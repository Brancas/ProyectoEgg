package ProyectoEgg.argus.servicios;

import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Impresora;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.entidades.Telefono;
import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.repositorios.ImpresoraRepositorio;
import ProyectoEgg.argus.repositorios.TelefonoRepositorio;
import java.util.Date;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/*

 */
@Service
public class ImpresoraServicio {
    
    @Autowired
    ImpresoraRepositorio ir1;
    
    public void crearImpresora(String id, Marca marca, Modelo modelo, List<Falla> fallas) throws ErrorServicio {
        
        Impresora impresora = new Impresora() ;
        
        
        impresora.setId(id);
        impresora.setMarca(marca);
        impresora.setModelo(modelo);
        impresora.setFallas(fallas);
        
        impresora.setAlta(new Date());
        
        ir1.save(impresora);
        
    }

}