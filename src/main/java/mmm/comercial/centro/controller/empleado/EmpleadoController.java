package mmm.comercial.centro.controller.empleado;

import java.util.List;

import mmm.comercial.centro.pojo.Empleado;
import mmm.comercial.centro.service.interfaces.IEmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class EmpleadoController {

	@Autowired
	@Qualifier ("empleadoService")
	private IEmpleadoService empservice;
	
	/**
	 * Método que te lleva a la pagina principal de empleados en la que se muestran todos sus datos
	 * @return ModelAndView
	 */	
	@RequestMapping(value ="/empleados", method = RequestMethod.GET)	
	protected ModelAndView econtroller() {
		ModelAndView emp= new ModelAndView();
		List<Empleado> empleados = empservice.getAll();
		emp.addObject("lista_empleados",empleados);
		emp.setViewName("/empleado/index");
		return emp;		
	}

}
