package mmm.comercial.centro.service;

import java.util.List;

import javax.annotation.Resource;

import mmm.comercial.centro.model.ProductoDAOImpl;
import mmm.comercial.centro.pojo.Producto;
import mmm.comercial.centro.service.interfaces.IProductoService;

public class ProductoServiceImpl implements IProductoService {
	
	@Resource(name="productoDAO")
	private ProductoDAOImpl productoDAO;
	
	
	@Override
	public int create(Producto prod) {
		int codigo=productoDAO.create(prod);
		return codigo;
	}

	@Override
	public Producto getById(int id) {
		Producto prod= productoDAO.getById(id);
	    return prod;
	}
	
	@Override
	public List<Producto> getByCliente(int cliente) {
		List<Producto> productos=null;
		productos = productoDAO.getByCliente(cliente);
		return productos;
	}

	@Override
	public List<Producto> getByTienda(int tienda) {
		List<Producto> productos=null;
		productos = productoDAO.getByTienda(tienda);
		return productos;
	}

	@Override
	public List<Producto> getAll() {
		List<Producto> productos=null;
		productos = productoDAO.getAll();
		return productos;
	}

	@Override
	public int update(Producto prod) {
		int codigo=productoDAO.update(prod);
		return codigo;
	}

	@Override
	public int delete(int id) {
		int cod=productoDAO.delete(id);
		return cod;
		
	}	

	@Override
	public List<Producto> getAllJoinTienda() {
		List<Producto> productos=null;
		productos = productoDAO.getAllJoinTienda();
		return productos;
	}

	@Override
	public void setProductoDAO(ProductoDAOImpl productoDAO) {
		this.productoDAO = productoDAO;
		
	}


}
