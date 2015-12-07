package mmm.comercial.centro.controller.empleado;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mmm.comercial.centro.pojo.Empleado;
import mmm.comercial.centro.service.interfaces.IEmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class RegistroEmpleadoController {
	
	@Autowired
	@Qualifier("empleadoService")
	private IEmpleadoService empservice;

	/**
	 * Método para la página principal con el registro de empleado
	 * @param request
	 * @param response
	 * @return ModelAndView
	 */
	@RequestMapping(value = "/registroempleado", method = RequestMethod.GET)
	public ModelAndView displayRegistroEmpleado(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("/empleado/registro");
		Empleado empleado = new Empleado();
		model.addObject("empleado", empleado);
		return model;
	}

	/**
	 * Método de registro que redirige a la página de clientes
	 * @param request
	 * @param response
	 * @param administrador
	 * @return String
	 */
	@RequestMapping(value = "/registroempleado", method = RequestMethod.POST)
	public String executeRegistroEmpleado(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("empleado") Empleado empleado) {
		String model = null;
		//comprobar que el nuevo empleado no este repetido
		Empleado e = empservice.getByUser(empleado.getUser());
		if(e==null) {
			//guardar en la bd el nuevo empleado
			Empleado emp = new Empleado();			
			emp.setUser(empleado.getUser());
			emp.setPass(empleado.getPass());
			emp.setNombre(empleado.getNombre());
			emp.setApellidos(empleado.getApellidos());
			empservice.create(emp);
			request.setAttribute("adminuser", empleado.getUser());
			request.setAttribute("adminpass", empleado.getPass());
			request.setAttribute("nombre", empleado.getNombre());
			request.setAttribute("apellidos", empleado.getApellidos());
			model = "redirect:empleados";			
		} else {
			model = "error";
		}
		request.setAttribute("adminuser", empleado.getUser());
		request.setAttribute("adminpass", empleado.getPass());
		request.setAttribute("nombre", empleado.getNombre());
		request.setAttribute("apellidos", empleado.getApellidos());
		return model;
	}

}
