package mmm.comercial.centro.model.interfaces;

import java.util.List;

import javax.sql.DataSource;

import mmm.comercial.centro.pojo.Producto;

public interface IProductoDAO {
	
	public int create(Producto prod);
	
	public Producto getById(int codigo);
	
	public List<Producto> getAll();
	
	public int update(Producto prod);
	
	public int delete(int codigo);

	public void setDatasource(DataSource datasource);


}
