
package ProyectoEgg.argus.entidades;

import java.util.List;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Agustin
 */
public class Telefono extends Dispositivo{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String id;

    public Telefono(Marca marca, Modelo modelo, List<Falla> fallas) {
        super();
    }

    public Telefono() {
        super();
    }
}
