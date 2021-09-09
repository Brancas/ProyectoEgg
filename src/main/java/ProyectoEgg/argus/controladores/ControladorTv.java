package ProyectoEgg.argus.controladores;

import ProyectoEgg.argus.servicios.TvServicio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/*

 */

@Controller
@RequestMapping("/smarttv")
public class ControladorTv {
    
    @Autowired
    private TvServicio tvs1;
    
    

}
