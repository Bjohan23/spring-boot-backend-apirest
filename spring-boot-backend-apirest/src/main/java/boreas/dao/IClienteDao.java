package boreas.dao;
import org.springframework.data.repository.CrudRepository;
import boreas.entity.Cliente;
public interface IClienteDao extends CrudRepository<Cliente,Long>{
}