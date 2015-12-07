package mmm.comercial.centro.controller.producto;

import mmm.comercial.centro.service.interfaces.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class NuevoProductoController {
	
	@Autowired
	@Qualifier("productoService")
	private IProductoService proservice;
	
	@RequestMapping(value = "/productos/nuevo", method = RequestMethod.GET)
	public String nuevoproducto() {		
		
		return "/producto/nuevo";
	}

}
