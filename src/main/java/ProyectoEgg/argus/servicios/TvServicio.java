package ProyectoEgg.argus.servicios;

//import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.entidades.Tv;
import ProyectoEgg.argus.entidades.Usuario;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.TvRepositorio;
import ProyectoEgg.argus.repositorios.UsuarioRepositorio;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


@Service
public class TvServicio {

    @Autowired
    TvRepositorio tvr1;
    @Autowired
    UsuarioRepositorio ur1;
    
   public void crearTv(String id, Marca marca, Modelo modelo, List<Falla> fallas, Integer documento) throws ErrorServicio {

        Tv tv = new Tv();

        tv.setId(id);
        tv.setMarca(marca);
        tv.setModelo(modelo);
        tv.setFallas(fallas);
        tv.getUsuario();

        tv.setAlta(new Date());

        tvr1.save(tv);

    }
  public void deshabilitarTv(Integer documento) throws ErrorServicio {

        Optional<Usuario> respuesta = ur1.findById(documento);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            List<Tv> teve = new ArrayList();
            teve = usuario.getTvs();
            Tv t1 = new Tv();
            for (Tv tv : teve){
                t1 = tv;
                
            }

            if (t1.getAlta() != null) {
                t1.setBaja(new Date());
                t1.setAlta(null);
                tvr1.save(t1);

            } else {

                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }
  
  public void habilitarTv(Integer documento) throws ErrorServicio {

         Optional<Usuario> respuesta = ur1.findById(documento);
        if (respuesta.isPresent()) {
            Usuario usuario = respuesta.get();
            List<Tv> teve = new ArrayList();
            teve = usuario.getTvs();
            Tv t1 = new Tv();
            for (Tv tv : teve){
                t1 = tv;
                
            }

            if (t1.getBaja() != null) {
                t1.setAlta(new Date());
                t1.setBaja(null);
                tvr1.save(t1);
            } else {
                throw new ErrorServicio("El usuario ingresado ya se encuentra inhabilitado.");
            }

        } else {

            throw new ErrorServicio("El documento ingresado no se encuentra registrado.");
        }

    }

}

