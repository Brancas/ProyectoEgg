 import ProyectoEgg.argus.errores.ErrorServicio;

import java.util.Date;
import java.util.Optional;


@Service
public class UsuarioServicio {
    public void crearUsuario(Integer documento, String nombre, String clave, String email) throws ErrorServicio {

        Usuario usuario = new Usuario();
        
        validacion(documento, nombre, clave, email);

        usuario.setDocumento(documento);
        usuario.setNombre(nombre);
public class UsuarioServicio {

        if (documento == null) {
            throw new ErrorServicio("Debe ingresar su DNI");
//        } else {
//            if (validaIsbn(isbn)) {
//                throw new ErrorServicio("El isbn ingresado ya esta asignado a otro libro");
//            }
        } else {
            validarDNI(documento);
        }

        if (nombre == null) {
public class UsuarioServicio {
        }

    }
    
    public void modificarUsuario (Integer documento, String nombre, String clave, String email)throws ErrorServicio{
        

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

}