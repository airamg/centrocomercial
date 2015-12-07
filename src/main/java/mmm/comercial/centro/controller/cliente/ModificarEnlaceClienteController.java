package mmm.comercial.centro.controller.cliente;

import mmm.comercial.centro.service.interfaces.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModificarEnlaceClienteController {
	
	@Autowired
	@Qualifier("clienteService")
	private IClienteService cliservice;
	
	/**
	 * Método que se accede desde la cuenta de cliente que llevaá al formulario de modificar
	 * @param id
	 * @return
	 */
	@RequestMapping(value = "/clientes/modificar/{id}", method = RequestMethod.GET)
	public String modificarcliente(@PathVariable(value = "id") int id) {		
		
		//pasar los datos del cliente al formulario que crearemos en la pagina que se muestra
		
		return "/cliente/modificar";
	}

}
