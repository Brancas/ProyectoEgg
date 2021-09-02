/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEgg.argus.repositorios;

import ProyectoEgg.argus.entidades.Tablet;
import ProyectoEgg.argus.entidades.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

/**
 *
 * @author Enzo
 */
@Repository
public interface TabletRepositorio extends JpaRepository <Tablet, String >{
    
    @Query ("SELECT x FROM Tv x")
    public List<Usuario> ListadoUsuarios();
    
}
