package mmm.comercial.centro.service;

import java.util.List;

import javax.annotation.Resource;


import mmm.comercial.centro.model.EmpleadoDAOImpl;
import mmm.comercial.centro.pojo.Empleado;
import mmm.comercial.centro.service.interfaces.IEmpleadoService;

public class EmpleadoServiceImpl implements IEmpleadoService {

	@Resource(name="empleadoDAO")
	private EmpleadoDAOImpl empleadoDAO;
	
	@Override
	public int create(Empleado emp) {
		int codigo=empleadoDAO.create(emp);
		return codigo;
	}
	@Override
	public Empleado getById(int id) {
		Empleado emp= empleadoDAO.getById(id);
	    return emp;
	  }

	@Override
	public List<Empleado> getAll() {
		List<Empleado> empleados=null;
		empleados = empleadoDAO.getAll();
		return empleados;
	}

	@Override
	public int update(Empleado emp) {
		int codigo=empleadoDAO.update(emp);
		return codigo;
	}

	@Override
	public int delete(int id) {
		int cod=empleadoDAO.delete(id);
		return cod;
		
	}

	@Override
	public void setEmpleadoDAO(EmpleadoDAOImpl empleadoDAO) {
		this.empleadoDAO = empleadoDAO;
		
	}

}
