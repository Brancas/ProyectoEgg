package ProyectoEgg.argus.servicios;


import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.entidades.Tablet;
import ProyectoEgg.argus.entidades.Telefono;
import ProyectoEgg.argus.entidades.Usuario;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.TabletRepositorio;
import ProyectoEgg.argus.repositorios.TelefonoRepositorio;
import ProyectoEgg.argus.repositorios.UsuarioRepositorio;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*

 */
@Service
public class TelefonoServicio {
    
    @Autowired
    private TelefonoRepositorio telr1;
    
    @Autowired
    private UsuarioRepositorio ur1;
    
    public void crearTelefono(String id, Marca marca, Modelo modelo, List<Falla> fallas, Integer documento) throws ErrorServicio {
        
        Telefono telefono = new Telefono() ;
        
        
        telefono.setId(id);
        telefono.setMarca(marca);
        telefono.setModelo(modelo);
        telefono.setFallas(fallas);
        
        telefono.setUsuario(documento);
        
        telefono.setAlta(new Date());
        
        telr1.save(telefono);
        
    }
    
    public void deshabilitarTelefono(Integer documento) throws ErrorServicio {

        Optional <Usuario> respuesta = ur1.findById(documento);

        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            
            Telefono telefono = usuario.getTelefono();
            
            
            if (telefono.getAlta() != null) {

                telefono.setBaja(new Date());

                telefono.setAlta(null);

                telr1.save(telefono);
                
            } else {

                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }
    
    public void habilitarTelefono(Integer documento) throws ErrorServicio {

        Optional <Usuario> respuesta = ur1.findById(documento);

        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();
            
//            Telefono telefono = usuario.getTelefono();
            
            
//            if (telefono.getBaja() != null) {
//
//                telefono.setAlta(new Date());
//
//                telefono.setBaja(null);
//
//                telr1.save(telefono);
//                
//            } else {
//
//                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
//            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }
    
    

}