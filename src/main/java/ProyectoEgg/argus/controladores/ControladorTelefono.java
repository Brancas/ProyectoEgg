
package ProyectoEgg.argus.controladores;

import ProyectoEgg.argus.entidades.Falla;
import ProyectoEgg.argus.entidades.Marca;
import ProyectoEgg.argus.entidades.Modelo;
import ProyectoEgg.argus.servicios.TelefonoServicio;
import ProyectoEgg.argus.servicios.UsuarioServicio;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/telefono")
public class ControladorTelefono {
    
    @Autowired
    private TelefonoServicio telefonoServicio; 
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    Marca m1 = new Marca() ;
    Modelo mod1 = new Modelo();
    List <Falla> f1 = (List <Falla>) new Falla();
    
    @PostMapping("/")
    
    public String repararTelefono(Marca m1, Modelo mod1, Falla f1){
        
        try {
            
            if(m1 != null && mod1 != null && f1 != null) {
                
                telefonoServicio.crearTelefono(m1, mod1, (List<Falla>) f1, Integer.SIZE);
                
            }
            
        } catch (Exception e) {
            
            return "Error404.html";
            
        }
        
        return "registro_celular.html";
        
    } 
    
//    @GetMapping("/reparar/crearCelular")
    public String alcatelMarca(Marca m1) {
        try {
            String marca = "Alcatel" ;
            m1.setId(marca);
            
        } catch (Exception e) {
            
            return "Error404.html";
        }
        
//        Escribí "ModeloAcatel" solo porque no hay uno genérico.

        return "modeloAcatel.html";
     
    }
    
    public String alcatelModelo(Modelo mod1) {
        try {
            String modelo = "5C" ;
            mod1.setNombre(modelo);
            
        } catch (Exception e) {
            
            return "Error404.html";
        }
        
//        Escribí "ModeloAcatel" solo porque no hay uno genérico.

        return "registroCelular.html";
     
    }
    
    public String fallaTelefono(List <Falla> f1) {
        try {
            String fallaString = "Pantalla" ;
            Falla falla = new Falla() ;
            
            falla.setNombre(fallaString);
            
            f1.add(falla);
            
        } catch (Exception e) {
            
            return "Error404.html";
        }
        
//        Escribí "ModeloAcatel" solo porque no hay uno genérico.

        return "registroCelular.html";
     
    }
    
    public void vaciarObjetos(){
        
        m1 = null;
        mod1 = null;
        f1 = null;
        
    }
   
}
