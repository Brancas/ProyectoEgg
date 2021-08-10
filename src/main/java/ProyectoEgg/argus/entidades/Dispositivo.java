package ProyectoEgg.argus.entidades;

import javax.persistence.MappedSuperclass;

/**
 *
 * @author Agustin
 */
@MappedSuperclass
public abstract class Dispositivo {

    protected Marca marca;

    protected Modelo modelo;

    protected Falla falla;

    public Dispositivo() {
    }

    public Dispositivo(Marca marca, Modelo modelo, Falla falla) {
        this.marca = marca;
        this.modelo = modelo;
        this.falla = falla;
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

    public Falla getFalla() {
        return falla;
    }

    public void setFalla(Falla falla) {
        this.falla = falla;
    }
    
    
    
}
