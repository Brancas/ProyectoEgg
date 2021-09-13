package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.entidades.Tablet;
import ProyectoEgg.argus.entidades.Usuario;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.TabletRepositorio;
import ProyectoEgg.argus.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TabletServicio {
    
    @Autowired
    TabletRepositorio tabr1;
    
    @Autowired
    private UsuarioRepositorio ur1;
    
  public void crearTablet(String id, Marca marca, Modelo modelo, List<Falla> fallas, Integer documento) throws ErrorServicio {

        Tablet tablet = new Tablet();

        tablet.setId(id);
        tablet.setMarca(marca);
        tablet.setModelo(modelo);
        tablet.setFallas(fallas);
        tablet.getUsuario();

        tablet.setAlta(new Date());

        tabr1.save(tablet);

    }
  public void deshabilitarTablet(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            List<Tablet> tab = new ArrayList();
            tab = usuario.getTablets();
            Tablet ta1 = new Tablet();
            for (Tablet tablet : tab) {
                  ta1 = tablet;                          
            }

            if (ta1.getAlta() != null) {
                ta1.setBaja(new Date());
                ta1.setAlta(null);
                tabr1.save(ta1);

            } else {

                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }
  
  public void habilitarTelefono(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            List<Tablet> tab = new ArrayList();
            tab = usuario.getTablets();
            Tablet ta1 = new Tablet();
            for (Tablet tablet : tab) {
                ta1 = tablet;
            }

            if (ta1.getBaja() != null) {
                ta1.setAlta(new Date());
                ta1.setBaja(null);
                tabr1.save(ta1);
            } else {
                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }

}
