package mmm.comercial.centro.controller.cliente;

import java.util.List;

import mmm.comercial.centro.pojo.Tienda;
import mmm.comercial.centro.service.interfaces.ITiendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class ClienteController {

	@Autowired
	@Qualifier ("tiendaService")
	private ITiendaService tiendservice;	
	
	/**
	 * Método que lleva a la pagina principal de clientes en la que se muestra la lista de las tiendas
	 * @return ModelAndView
	 */	
	@RequestMapping(value ="/clientes", method = RequestMethod.GET)
	protected ModelAndView clicontroller()  {
		ModelAndView tiend = new ModelAndView();
		List<Tienda> tiendas = tiendservice.getAll();
		tiend.addObject("lista_tiendas",tiendas);
		tiend.setViewName("/cliente/index");
		return tiend;		
	}

}
