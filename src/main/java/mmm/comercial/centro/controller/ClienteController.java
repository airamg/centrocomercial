package mmm.comercial.centro.controller;

import java.util.List;

import mmm.comercial.centro.pojo.Cliente;
import mmm.comercial.centro.service.interfaces.IClienteService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

@RequestMapping(value = "/clientes")
@Controller
public class ClienteController {

	@Autowired
	@Qualifier("clienteService")
	private IClienteService cs;

	@RequestMapping(value = "", method = RequestMethod.GET)
	protected ModelAndView indexClientes() {

		ModelAndView mav = new ModelAndView();
		List<Cliente> clientes = cs.getAll();
		mav.setViewName("/cliente/index");
		mav.addObject("listClients", clientes);

		return mav;
	}	

}
