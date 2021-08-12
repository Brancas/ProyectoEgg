
package ProyectoEgg.argus.entidades;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;


public class Impresora {
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String id;

    public Impresora(Marca marca, Modelo modelo, List<Falla> fallas) {
        super();
    }

    public Impresora() {
        super();
    }
    
}
