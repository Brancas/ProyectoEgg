package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.entidades.Telefono;
import ProyectoEgg.argus.entidades.Usuario;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.TelefonoRepositorio;
import ProyectoEgg.argus.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TelefonoServicio {

    @Autowired
    private TelefonoRepositorio telr1;

    @Autowired
    private UsuarioRepositorio ur1;

    public void crearTelefono(String id, Marca marca, Modelo modelo, List<Falla> fallas, Integer documento) throws ErrorServicio {

        Telefono telefono = new Telefono();

        telefono.setId(id);
        telefono.setMarca(marca);
        telefono.setModelo(modelo);
        telefono.setFallas(fallas);
        telefono.getUsuario();

        telefono.setAlta(new Date());

        telr1.save(telefono);

    }

    public void deshabilitarTelefono(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);
        //En este lugar buscamos al usuario mediante la llave foranea (documento)
        if (respuesta.isPresent()) {
            //Una vez encontrado, lo materializamos en un objeto local (usuario)
            Usuario usuario = respuesta.get();
            //Materializamos una lista de <Telefono> con el nombre "tel"
            List<Telefono> tel = new ArrayList();
            //Llenamos "tel" con la lista del Usuario ya materializado
            tel = usuario.getTelefonos();
            Telefono t1 = new Telefono();
            //Recorremos la lista <Telefono> con un For Each
            for (Telefono telefono : tel) {
                t1 = telefono;
                //Asignamos el telefono a t1
            }

            if (t1.getAlta() != null) {
                t1.setBaja(new Date());
                t1.setAlta(null);
                telr1.save(t1);

            } else {

                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }

    public void habilitarTelefono(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);
        //En este lugar buscamos al usuario mediante la llave foranea (documento)
        if (respuesta.isPresent()) {
            //Una vez encontrado, lo materializamos en un objeto local (usuario)
            Usuario usuario = respuesta.get();
            //Materializamos una lista de <Telefono> con el nombre "tel"
            List<Telefono> tel = new ArrayList();
            //Llenamos "tel" con la lista del Usuario ya materializado
            tel = usuario.getTelefonos();
            Telefono t1 = new Telefono();
            //Recorremos la lista <Telefono> con un For Each
            for (Telefono telefono : tel) {
                t1 = telefono;
                //Asignamos el telefono a t1
            }

            if (t1.getBaja() != null) {

                t1.setAlta(new Date());

                t1.setBaja(null);

                telr1.save(t1);

            } else {

                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }

}
