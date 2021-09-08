package ProyectoEgg.argus.entidades;

import java.util.Date;
import java.util.List;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

@Entity
public class Marca {

    @Id
    @GeneratedValue(generator = "uuid")
    @GenericGenerator(name = "uuid", strategy = "uuid2")
    private String id;

    protected String nombre;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date alta;
    @Temporal(TemporalType.TIMESTAMP)
    protected Date baja;

    @OneToMany
    protected List<Modelo> modelos;

    public Marca() {
    }

    public Marca(String id, String nombre, Date alta, Date baja, List<Modelo> modelos) {
        this.id = id;
        this.nombre = nombre;
        this.alta = alta;
        this.baja = baja;
        this.modelos = modelos;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Date getAlta() {
        return alta;
    }

    public void setAlta(Date alta) {
        this.alta = alta;
    }

    public Date getBaja() {
        return baja;
    }

    public void setBaja(Date baja) {
        this.baja = baja;
    }

    public List<Modelo> getModelos() {
        return modelos;
    }

    public void setModelos(List<Modelo> modelos) {
        this.modelos = modelos;
    }

    
}
