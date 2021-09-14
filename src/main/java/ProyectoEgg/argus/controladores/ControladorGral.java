package ProyectoEgg.argus.controladores;

import ProyectoEgg.argus.servicios.TelefonoServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping
public class ControladorGral {

    @Autowired
    private TelefonoServicio telefonoServicio;

    @GetMapping("/")
    public String index() {
        return "index.html";

    }

    @GetMapping("/login")
    public String login() {
        return "login.html";

    }

    @GetMapping("/registro")
    public String registro() {
        return "registro.html";

    }

    @GetMapping("/about")
    public String about() {
        return "about.html";

    }

    @GetMapping("/reparar")
    public String reparar() {
        return "reparar.html";

    }

    @GetMapping("/celular")
    public String celular() {
        return "celular.html";

    }

    @GetMapping("/computadora")
    public String computadora() {
        return "computadora.html";

    }

    @GetMapping("/tablet")
    public String tablet() {
        return "tablet.html";

    }

    @PostMapping("/reparar/crearCelular")
    public String llenarMarca(String marca) {
        try {
            marca = "Alcatel" ;
            telefonoServicio.llenarMarca(marca);
        } catch (Exception e) {
            
            return "Error404.html";
        }
        
//        Escribí "ModeloAcatel" solo porque no hay uno genérico.

        return "modeloAcatel.html";
     
    }
}
