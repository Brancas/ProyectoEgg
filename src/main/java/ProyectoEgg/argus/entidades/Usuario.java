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

    public Usuario(Integer documento, String nombre, String clave, String email) {
        this.documento = documento;
        this.nombre = nombre;
        this.clave = clave;
        this.email = email;
    }

    public Usuario() {
    }

    public Integer getDocumento() {
        return documento;
    }

    public void setDocumento(Integer documento) {
        this.documento = documento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getClave() {
        return clave;
    }

    public void setClave(String clave) {
        this.clave = clave;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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

    public List<Telefono> getTelefonos() {
        return telefonos;
    }

    public void setTelefonos(List<Telefono> telefonos) {
        this.telefonos = telefonos;
    }

    public List<Tablet> getTablets() {
        return tablets;
    }

    public void setTablets(List<Tablet> tablets) {
        this.tablets = tablets;
    }

    public List<Tv> getTvs() {
        return tvs;
    }

    public void setTvs(List<Tv> tvs) {
        this.tvs = tvs;
    }

    public List<Impresora> getImpresoras() {
        return impresoras;
    }

    public void setImpresoras(List<Impresora> impresoras) {
        this.impresoras = impresoras;
    }

    public Telefono getTelefono() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    

}
