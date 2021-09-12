
package ProyectoEgg.argus.controladores;

import ProyectoEgg.argus.servicios.TelefonoServicio;
import ProyectoEgg.argus.servicios.UsuarioServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/celular")
public class ControladorTelefono {
    
    @Autowired
    private TelefonoServicio telefonoServicio; 
    
    @Autowired
    private UsuarioServicio usuarioServicio;
    
    @PostMapping("/registro_celular")
    public String 
    
}
