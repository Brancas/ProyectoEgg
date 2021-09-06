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
    private Telefono telefono;
    
    @OneToMany
    private Tablet tablet;
    
    @OneToMany
    private Tv tv;
    
    @OneToMany
    private Impresora impresora;

    
    
    /**
     * @return the documento
     */
    public Integer getDocumento() {
        return documento;
    }

    /**
     * @param documento the documento to set
     */
    public void setDocumento(Integer documento) {
        this.documento = documento;
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
     * @return the clave
     */
    public String getClave() {
        return clave;
    }

    /**
     * @param clave the clave to set
     */
    public void setClave(String clave) {
        this.clave = clave;
    }

    /**
     * @return the email
     */
    public String getEmail() {
        return email;
    }

    /**
     * @param email the email to set
     */
    public void setEmail(String email) {
        this.email = email;
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
     * @return the dispositivo
     */
    

    public Usuario() {
    }

    public Usuario(Integer documento, String nombre, String clave, String email, Date alta, Date baja) {
        this.documento = documento;
        this.nombre = nombre;
        this.clave = clave;
        this.email = email;
        this.alta = alta;
        this.baja = baja;
    }

    /**
     * @return the telefono
     */
    public Telefono getTelefono() {
        return telefono;
    }

    /**
     * @param telefono the telefono to set
     */
    public void setTelefono(Telefono telefono) {
        this.telefono = telefono;
    }

    /**
     * @return the tablet
     */
    public Tablet getTablet() {
        return tablet;
    }

    /**
     * @param tablet the tablet to set
     */
    public void setTablet(Tablet tablet) {
        this.tablet = tablet;
    }

    /**
     * @return the tv
     */
    public Tv getTv() {
        return tv;
    }

    /**
     * @param tv the tv to set
     */
    public void setTv(Tv tv) {
        this.tv = tv;
    }

    /**
     * @return the impresora
     */
    public Impresora getImpresora() {
        return impresora;
    }

    /**
     * @param impresora the impresora to set
     */
    public void setImpresora(Impresora impresora) {
        this.impresora = impresora;
    }

}
