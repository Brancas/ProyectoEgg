package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.entidades.Tablet;
import ProyectoEgg.argus.entidades.Telefono;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.TabletRepositorio;
import ProyectoEgg.argus.repositorios.TelefonoRepositorio;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*

 */
@Service
public class TelefonoServicio {
    
    @Autowired
    TelefonoRepositorio telr1;
    
    public void crearTelefono(String id, Marca marca, Modelo modelo, List<Falla> fallas) throws ErrorServicio {
        
        Telefono telefono = new Telefono() ;
        
        
        telefono.setId(id);
        telefono.setMarca(marca);
        telefono.setModelo(modelo);
        telefono.setFallas(fallas);
        
        telefono.setAlta(new Date());
        
        telr1.save(telefono);
        
    }

}