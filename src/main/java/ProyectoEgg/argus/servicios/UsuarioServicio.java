package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.entidades.Usuario;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.UsuarioRepositorio;

import java.util.Date;
import java.util.Optional;
import javax.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServicio {

    @Autowired
    UsuarioRepositorio ur1;

    @Transactional
    public void crearUsuario(Integer documento, String nombre, String clave, String email) throws ErrorServicio {

        Usuario usuario = new Usuario();

        validacion(documento, nombre, clave, email);

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

        } else {

            validarDNI(documento);

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

    @Transactional
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

    @Transactional
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
