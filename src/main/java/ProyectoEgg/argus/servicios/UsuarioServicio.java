<<<<<<< HEAD
import ProyectoEgg.argus.entidades.Usuario;
 import ProyectoEgg.argus.errores.ErrorServicio;

import java.util.Date;
import java.util.Optional;
import org.springframework.stereotype.Service;


@Service
public class UsuarioServicio {
=======
package ProyectoEgg.argus.servicios;

import org.springframework.stereotype.Service;
import ProyectoEgg.argus.entidades.Usuario;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.UsuarioRepositorio;
import java.util.Date;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio ur1;

>>>>>>> 16f3ac8be56a586720b7c2d663fbdcecfda3a6fd
    public void crearUsuario(Integer documento, String nombre, String clave, String email) throws ErrorServicio {

        Usuario usuario = new Usuario();
        
        validacion(documento, nombre, clave, email);

        usuario.setDocumento(documento);
        usuario.setNombre(nombre);
<<<<<<< HEAD
public class UsuarioServicio {

        if (documento == null) {
            throw new ErrorServicio("Debe ingresar su DNI");
//        } else {
//            if (validaIsbn(isbn)) {
//                throw new ErrorServicio("El isbn ingresado ya esta asignado a otro libro");
//            }
=======
        usuario.setClave(clave);
        usuario.setEmail(email);

        usuario.setAlta(new Date());

        ur1.save(usuario);

    }

    public void validacion(Integer documento, String nombre, String clave, String email) throws ErrorServicio {

        if (documento == null) {
            throw new ErrorServicio("Debe ingresar su DNI");
>>>>>>> 16f3ac8be56a586720b7c2d663fbdcecfda3a6fd
        } else {
            validarDNI(documento);
        }

        if (nombre == null) {
<<<<<<< HEAD
public class UsuarioServicio {
        }

    }
    
    public void modificarUsuario (Integer documento, String nombre, String clave, String email)throws ErrorServicio{
        
=======
            throw new ErrorServicio("Debe ingresar su Nombre completo");
        }

        if (clave == null) {
            throw new ErrorServicio("Debe ingresar un clave");
        }

        if (email == null) {
            throw new ErrorServicio("Debe ingresar un Email");
        }

    }
>>>>>>> 16f3ac8be56a586720b7c2d663fbdcecfda3a6fd

    public void modificarUsuario(Integer documento, String nombre, String clave, String email) throws ErrorServicio {

        validacion(documento, nombre, clave, email);

        Optional<Usuario> respuesta = ur1.findById(documento);

        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();

            usuario.setNombre(nombre);
            usuario.setClave(clave);
            usuario.setEmail(email);

            ur1.save(usuario);

        } else {
            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }

    public void deshabilitarUsuario(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);

        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();

            if (usuario.getAlta() != null) {

                usuario.setBaja(new Date());

                usuario.setAlta(null);

                ur1.save(usuario);
            } else {

                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }

    public void habilitarUsuario(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);

        if (respuesta.isPresent()) {

            Usuario usuario = respuesta.get();

            if (usuario.getBaja() != null) {

                usuario.setAlta(new Date());

                usuario.setBaja(null);

                ur1.save(usuario);
            } else {

                throw new ErrorServicio("El usuario ingresado ya se encuentra habilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }

    public void validarDNI(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);

        if (respuesta.isPresent()) {

            throw new ErrorServicio("El Documento ingresado ya ha sido utilizado.");

        }
    }

<<<<<<< HEAD
}
=======
}
>>>>>>> 16f3ac8be56a586720b7c2d663fbdcecfda3a6fd
