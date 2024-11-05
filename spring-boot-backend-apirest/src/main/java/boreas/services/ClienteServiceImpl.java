package boreas.services;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import boreas.dao.IClienteDao;
import boreas.entity.Cliente;
import jakarta.transaction.Transactional;
@Service
public class ClienteServiceImpl implements IClienteService{
    @Autowired
    private IClienteDao clienteDao;
    @Override
    public List<Cliente> findAll() {
        return (List<Cliente>) clienteDao.findAll();
    }
    @Override
    public Cliente findById(Long id) {
// TODO Auto-generated method stub
        return clienteDao.findById(id).orElse(null);
    }
    @Override
    public Cliente save(Cliente cliente) {
// TODO Auto-generated method stub
        return clienteDao.save(cliente);
    }
    @Override
    public void delete(Long id) {
// TODO Auto-generated method stub
        clienteDao.deleteById(id);
    }
}