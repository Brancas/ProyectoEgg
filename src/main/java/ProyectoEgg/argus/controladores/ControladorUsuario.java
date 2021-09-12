
package ProyectoEgg.argus.controladores;

import ProyectoEgg.argus.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/registro")
public class ControladorUsuario {
     
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @GetMapping("/nuevoUsuario")
    
    
}
