package ProyectoEgg.argus.controladores;

import ProyectoEgg.argus.errores.ErrorServicio;
import ProyectoEgg.argus.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/registro")
public class ControladorUsuario {

    @Autowired
    private UsuarioServicio usuarioServicio;

  
    @PostMapping("/registrar")
    public String registrar(@RequestParam Integer documento, @RequestParam String nombre, @RequestParam String clave, @RequestParam String email) throws ErrorServicio {
        try {
            usuarioServicio.crearUsuario(documento, nombre, clave, email);
        } catch (ErrorServicio e) {
            
            return "registro.html";
        }
        return "reparar.html";
    }

}
