package mmm.comercial.centro.service.interfaces;

import java.util.List;

import mmm.comercial.centro.model.EmpleadoDAOImpl;
import mmm.comercial.centro.pojo.Empleado;

public interface IEmpleadoService {

	public int create(Empleado emp);
	
	public Empleado getById(int codigo);
	
	public Empleado getByUser(String user);
	
	public Empleado getByRole(String role);
	
	public Empleado getByOnline();
	
	public List<Empleado> getAll();
	
	public int update(Empleado emp);
	
	public int delete(int codigo);
	
	public void setEmpleadoDAO(EmpleadoDAOImpl empleadoDAO);
	
}
