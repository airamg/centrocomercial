package mmm.comercial.centro.controller.cliente;

import mmm.comercial.centro.service.interfaces.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class LogoutClienteController {
	
	@Autowired
	@Qualifier("clienteService")
	private IClienteService cliservice;
	
	@RequestMapping(value = "/clientes/logout", method = RequestMethod.GET)
	public String logout() {
		//TODO crear metodo como formulario para que no de error el administrador objeto form (pasar vacio)
		//TODO comprobar quien es el cliente online
		//TODO cambiar el campo online a 0
		return "home";
	}


}