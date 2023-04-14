package one.digitalinnovation.padroesprojetospring.model;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ClienteRepository extends CrudRepository<Cliente, Long> {
    @Query("SELECT u FROM Cliente u WHERE u.nome LIKE %:nome%")
    List<Cliente> filtrarPorNome(@Param("nome") String name);
}
