package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.FallaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*

 */
@Service
public class FallaServicio {

    @Autowired
    FallaRepositorio fr1;
    
    public void crearFalla(String id, String nombre, double costoReparacion) throws ErrorServicio {
        
        
        
    }
        
    
}
