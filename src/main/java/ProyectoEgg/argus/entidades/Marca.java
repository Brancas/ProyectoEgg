package ProyectoEgg.argus.entidades;

import java.util.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import org.hibernate.annotations.GenericGenerator;

/**
 *
 * @author Agustin
 */

@Entity
public class Marca {

    @Id
    protected String nombre;

    @Temporal(TemporalType.TIMESTAMP)
    protected Date alta;
    @Temporal(TemporalType.TIMESTAMP)
    protected Date baja;

    @OneToMany
    protected Modelo modelo;

    public Marca(String nombre) {
        this.nombre = nombre;
    }

    public Marca() {
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the alta
     */
    public Date getAlta() {
        return alta;
    }

    /**
     * @param alta the alta to set
     */
    public void setAlta(Date alta) {
        this.alta = alta;
    }

    /**
     * @return the baja
     */
    public Date getBaja() {
        return baja;
    }

    /**
     * @param baja the baja to set
     */
    public void setBaja(Date baja) {
        this.baja = baja;
    }

    /**
     * @return the modelo
     */
    public Modelo getModelo() {
        return modelo;
    }

    /**
     * @param modelo the modelo to set
     */
    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }
    
    
}
