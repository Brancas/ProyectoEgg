package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Impresora;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.entidades.Usuario;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.ImpresoraRepositorio;
import ProyectoEgg.argus.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*

 */
@Service
public class ImpresoraServicio {
    
    @Autowired
    ImpresoraRepositorio ir1;
      
    @Autowired
    private UsuarioRepositorio ur1;
    
  public void crearImpresora(String id, Marca marca, Modelo modelo, ArrayList<Falla> fallas, Integer documento) throws ErrorServicio {

        Impresora impresora = new Impresora();

        impresora.setId(id);
        impresora.setMarca(marca);
        impresora.setModelo(modelo);
        impresora.setFallas(fallas);
        impresora.getUsuario();

        impresora.setAlta(new Date());

        ir1.save(impresora);

    }
  public void deshabilitarImpresora(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            List<Impresora> imp = new ArrayList();
            imp = usuario.getImpresoras();
            Impresora i1 = new Impresora();
            for (Impresora impresora : imp) {
                i1 = impresora;
                
            }

            if (i1.getAlta() != null) {
                i1.setBaja(new Date());
                i1.setAlta(null);
                ir1.save(i1);

            } else {

                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }
  
  public void habilitarImpresora(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            List<Impresora> imp = new ArrayList();
            imp = usuario.getImpresoras();
            Impresora i1 = new Impresora();
            for (Impresora impresora : imp) {
                i1 = impresora;
            }

            if (i1.getBaja() != null) {
                i1.setAlta(new Date());
                i1.setBaja(null);
                ir1.save(i1);
            } else {
                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }

}