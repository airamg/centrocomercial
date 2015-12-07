package mmm.comercial.centro.controller.empleado;

import mmm.comercial.centro.service.interfaces.IEmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutEmpleadoController {

	@Autowired
	@Qualifier("empleadoService")
	private IEmpleadoService empservice;
	
	@RequestMapping(value = "/empleados/logout", method = RequestMethod.GET)
	public String logout() {
		//TODO crear metodo como formulario para que no de error el administrador objeto form (pasar vacio)
		//TODO comprobar quien es el empleado online
		//TODO cambiar el campo online a 0
		return "home";
	}

}
