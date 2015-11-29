package mmm.comercial.centro.service.interfaces;

import java.util.List;

import mmm.comercial.centro.model.ProductoDAOImpl;
import mmm.comercial.centro.pojo.Producto;

public interface IProductoService {
	
	public int create(Producto prod);
	
	public Producto getById(int codigo);
	
	public List<Producto> getAll();
	
	public int update(Producto prod);
	
	public int delete(int codigo);
	
	public void setProductoDAO(ProductoDAOImpl productoDAO);

}
