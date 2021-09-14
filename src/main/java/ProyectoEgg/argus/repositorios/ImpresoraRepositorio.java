/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ProyectoEgg.argus.repositorios;

import ProyectoEgg.argus.entidades.Impresora;
import ProyectoEgg.argus.entidades.Telefono;
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
public interface ImpresoraRepositorio extends JpaRepository <Impresora, String >{
    
//    @Query ("SELECT x FROM Telefono x")
//    public List<Usuario> ListadoUsuarios();
    
}
