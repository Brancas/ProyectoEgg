package ProyectoEgg.argus.servicios;

//import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.entidades.Tv;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.TvRepositorio;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*

 */
@Service
public class TvServicio {

    @Autowired
    TvRepositorio tvr1;

    public void crearTv(String id, Marca marca, Modelo modelo, Falla fallas) throws ErrorServicio {

        Tv tv = new Tv();

        tv.setId(id);
        tv.setMarca(marca);
//        tv.setModelo(modelo);
        tv.setFallas((List<Falla>) fallas);

        tv.setAlta(new Date());

        tvr1.save(tv);

    }

    public void altaTv() throws ErrorServicio {

    }

}
