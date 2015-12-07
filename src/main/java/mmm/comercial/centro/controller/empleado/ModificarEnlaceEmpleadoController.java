package mmm.comercial.centro.controller.empleado;

import mmm.comercial.centro.service.interfaces.IEmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModificarEnlaceEmpleadoController {
	
	@Autowired
	@Qualifier("empleadoService")
	private IEmpleadoService empservice;
	
	/**
	 * Método al que se accede desde la cuenta de empleado que va al formulario de modificar
	 * @param id
	 * @return String
	 */
	@RequestMapping(value = "/empleados/modificar/{id}", method = RequestMethod.GET)
	public String modificarempleado(@PathVariable(value = "id") int id) {		
		
		//pasar los datos del empleado al formulario que crearemos en la pagina que se muestra
		
		return "/empleado/modificar";
	}

}
