package ProyectoEgg.argus.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

/**
 *
 * @author Agustin
 */
@Entity
public class Usuario {

    @Id
    private Integer documento;
    private String nombre;
    private String clave;
    private String email;

    @Temporal(TemporalType.TIMESTAMP)
    private Date alta;
    @Temporal(TemporalType.TIMESTAMP)
    private Date baja;

    @OneToMany
    private List<Telefono> telefonos;

    @OneToMany
    private List<Tablet> tablets;

    @OneToMany
    private List<Tv> tvs;

    @OneToMany
    private List<Impresora> impresoras;

    

}
