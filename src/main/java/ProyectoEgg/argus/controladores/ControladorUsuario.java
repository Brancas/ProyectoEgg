package ProyectoEgg.argus.controladores;

import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.servicios.UsuarioServicio;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/usuario")
public class ControladorUsuario {

    @Autowired
    private UsuarioServicio usuarioServicio;

  
    @PostMapping("/registrar")
    public String registrar(@RequestParam Integer documento, @RequestParam String nombre, @RequestParam String clave, @RequestParam String email){
        try {
            usuarioServicio.crearUsuario(documento, nombre, clave, email);
            
        } catch (ErrorServicio ex) {
            Logger.getLogger(ControladorUsuario.class.getName()).log(Level.SEVERE, null, ex);
            return "registro.html";
        }
        
        return "redirect:/reparar";
    }
    
    
}
