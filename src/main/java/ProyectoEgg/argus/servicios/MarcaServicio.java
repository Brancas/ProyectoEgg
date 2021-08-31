package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.FallaRepositorio;
import ProyectoEgg.argus.repositorios.MarcaRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*

 */
@Service
public class MarcaServicio {

    @Autowired
    MarcaRepositorio mr1;
    
    public void crearMarca(String nombre) throws ErrorServicio {
        
        
        
    }
        
    
}