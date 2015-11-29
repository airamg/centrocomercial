package mmm.comercial.centro.model.interfaces;

import java.util.List;

import javax.sql.DataSource;

import mmm.comercial.centro.pojo.Empleado;

public interface IEmpleadoDAO {
	
	public int create(Empleado emp);
	
	public Empleado getById(int codigo);
	
	public List<Empleado> getAll();
	
	public int update(Empleado emp);
	
	public int delete(int codigo);
	
	public void setDatasource(DataSource datasource);

}
