package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.MarcaRepositorio;
import ProyectoEgg.argus.repositorios.ModeloRepositorio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*

 */
@Service
public class ModeloServicio {

    @Autowired
    ModeloRepositorio mr1;
    
    public void crearModelo(String id, String nombre, Marca marca) throws ErrorServicio {
        
        
        
    }
        
    
}