package mmm.comercial.centro.model.interfaces;

import java.util.List;

import javax.sql.DataSource;

import mmm.comercial.centro.pojo.Producto;

public interface IProductoDAO {
	
	public int create(Producto prod);
	
	public Producto getById(int codigo);
	
	public List<Producto> getByCliente(int cliente);
	
	public List<Producto> getByTienda(int tienda);
	
	public List<Producto> getAll();
	
	public int update(Producto prod);
	
	public int delete(int codigo);
	
	public List<Producto> getAllJoinTienda();

	public void setDatasource(DataSource datasource);


}
