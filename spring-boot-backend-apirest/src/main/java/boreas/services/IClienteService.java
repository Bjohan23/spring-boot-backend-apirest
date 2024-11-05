package boreas.services;
import boreas.entity.Cliente;
import java.util.List;

public interface IClienteService {
    public List<Cliente> findAll();
    public Cliente findById(Long id);
    Cliente save(Cliente cliente);
    public void delete(Long id);

}