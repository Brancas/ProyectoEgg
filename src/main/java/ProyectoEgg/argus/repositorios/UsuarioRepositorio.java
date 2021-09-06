
package ProyectoEgg.argus.repositorios;

import ProyectoEgg.argus.entidades.Usuario;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository

public interface UsuarioRepositorio extends JpaRepository <Usuario, Integer >{

    
      @Query ("SELECT x FROM Libro x")
    public List<Usuario> ListadoUsuarios();
    
}
