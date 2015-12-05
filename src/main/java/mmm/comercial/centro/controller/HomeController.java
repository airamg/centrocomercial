package mmm.comercial.centro.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mmm.comercial.centro.pojo.Administrador;
import mmm.comercial.centro.pojo.Cliente;
import mmm.comercial.centro.pojo.Empleado;
import mmm.comercial.centro.service.interfaces.IAdministradorService;
import mmm.comercial.centro.service.interfaces.IClienteService;
import mmm.comercial.centro.service.interfaces.IEmpleadoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class HomeController {

	@Autowired
	@Qualifier("administradorService")
	private IAdministradorService admservice;
	
	@Autowired
	@Qualifier("clienteService")
	private IClienteService cliservice;
	
	@Autowired
	@Qualifier("empleadoService")
	private IEmpleadoService empservice;
	
	/**
	 * Método para la página principal con el login de administrador (cliente y empleado)
	 * @param request
	 * @param response
	 * @return ModelAndView
	 */
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.GET)
	public ModelAndView displayLogin(HttpServletRequest request, HttpServletResponse response) {
		ModelAndView model = new ModelAndView("home");
		Administrador admin = new Administrador();
		model.addObject("administrador", admin);
		return model;
	}

	/**
	 * Método de login que redirige a la página de clientes o a la de empleados
	 * @param request
	 * @param response
	 * @param administrador
	 * @return ModelAndView
	 */
	@RequestMapping(value = {"/","/home"}, method = RequestMethod.POST)
	public ModelAndView executeLogin(HttpServletRequest request, HttpServletResponse response, @ModelAttribute("administrador") Administrador administrador) {
		ModelAndView model = null;
		//comprobamos que el user existe en la bd
		Administrador admin = admservice.getByUser(administrador.getUser());
		if(admin!=null) {
			//buscamos a que cliente o empleado pertenece (busqueda por role)
			if((admin.getRole()).equals("CLI")) {
				//si es CLIENTE buscamos el cliente correspondiente a ese user
				Cliente cli = cliservice.getByUser(admin.getUser());
				if(cli!=null) {
					//si existe, comprobamos su pass
					if((cli.getPass()).equals(administrador.getPass())) {
						//redirigimos a la pagina de clientes principal
						request.setAttribute("adminuser", administrador.getUser());
						request.setAttribute("adminpass", administrador.getPass());
						model = new ModelAndView("/cliente/index");						
					} else {
						model = new ModelAndView("error");
					}
				} else {
					model = new ModelAndView("error");
				}
				
				
			} else {
				//si es EMPLEADO buscamos el empleado correspondiente a ese user
				Empleado emp = empservice.getByUser(admin.getUser());
				if(emp!=null) {
					//si existe, comprobamos su pass
					if((emp.getPass()).equals(administrador.getPass())) {
						//redirigimos a la pagina de empleados principal
						request.setAttribute("adminuser", administrador.getUser());
						request.setAttribute("adminpass", administrador.getPass());
						model = new ModelAndView("/empleado/cuenta");						
					} else {
						model = new ModelAndView("error");
					}
				} else {
					model = new ModelAndView("error");
				}
			}			
		} else {
			model = new ModelAndView("error");
		}
		request.setAttribute("adminuser", administrador.getUser());
		request.setAttribute("adminpass", administrador.getPass());
		return model;
	}	
	
}
