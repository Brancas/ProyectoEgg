package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.entidades.Tablet;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.TabletRepositorio;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*

 */

@Service
public class TabletServicio {
    
    @Autowired
    TabletRepositorio tr1;
    
    public void crearTablet(String id, Marca marca, Modelo modelo, List<Falla> fallas) throws ErrorServicio {
        
        Tablet tablet = new Tablet() ;
        
        
        tablet.setId(id);
        tablet.setMarca(marca);
        tablet.setModelo(modelo);
        tablet.setFallas(fallas);
        
        tablet.setAlta(new Date());
        
        tr1.save(tablet);
        
    }

}
