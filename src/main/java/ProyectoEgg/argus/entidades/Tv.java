
package ProyectoEgg.argus.entidades;


import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Agustin
 */
@Entity
public class Tv extends Dispositivo{
    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    public String id;

    public Tv(Marca marca, Modelo modelo, List<Falla> fallas) {
        super(marca, modelo, fallas);
    }

    public Tv() {
        super();
    }
    
    
    
    
    
    
}
