package ProyectoEgg.argus.servicios;

import org.springframework.stereotype.Service;
import ProyectoEgg.argus.entidades.Usuario;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.UsuarioRepositorio;
import java.util.Date;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio ur1;

    public void crearUsuario(Integer documento, String nombre, String clave, String email) throws ErrorServicio {

        Usuario usuario = new Usuario();

        usuario.setDocumento(documento);
        usuario.setNombre(nombre);
        usuario.setClave(clave);
        usuario.setEmail(email);

        usuario.setAlta(new Date());

        ur1.save(usuario);

    }

    public void validacion(Integer documento, String nombre, String clave, String email) throws ErrorServicio {

        if (documento == null) {
            throw new ErrorServicio("Debe ingresar su DNI");
//        } else {
//            if (validaIsbn(isbn)) {
//                throw new ErrorServicio("El isbn ingresado ya esta asignado a otro libro");
//            }
        }

        if (nombre == null) {
            throw new ErrorServicio("Debe ingresar su Nombre completo");
        }

        if (clave == null) {
            throw new ErrorServicio("Debe ingresar un clave");
        }

        if (email == null) {
            throw new ErrorServicio("Debe ingresar un Email");
        }

    }
    
    public void modificarUsuario (Integer documento, String nombre, String clave, String email)throws ErrorServicio{
        
    }

}
