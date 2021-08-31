package ProyectoEgg.argus.entidades;

import java.util.List;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.MappedSuperclass;

/**
 *
 * @author Agustin
 */
@MappedSuperclass
public abstract class Dispositivo {

    @ManyToOne
    protected Marca marca;
    @ManyToOne
    public Modelo modelo;
    @ManyToMany
    public List<Falla> fallas;

    public Dispositivo() {
    }

    public Dispositivo(Marca marca, Modelo modelo, List<Falla> fallas) {
        this.marca = marca;
        this.modelo = modelo;
        this.fallas = fallas;
    }

    public Marca getMarca() {
        return marca;
    }

    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    public Modelo getModelo() {
        return modelo;
    }

    public void setModelo(Modelo modelo) {
        this.modelo = modelo;
    }

    public List<Falla> getFallas() {
        return fallas;
    }

    public void setFallas(List<Falla> fallas) {
        this.fallas = fallas;
    }

   

}
