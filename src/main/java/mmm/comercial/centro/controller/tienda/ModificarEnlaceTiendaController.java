package mmm.comercial.centro.controller.tienda;

import mmm.comercial.centro.service.interfaces.ITiendaService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModificarEnlaceTiendaController {
	
	@Autowired
	@Qualifier("tiendaService")
	private ITiendaService tieservice;
	
	@RequestMapping(value = "/tiendas/modificar/{id}", method = RequestMethod.GET)
	public String modificartiendas(@PathVariable(value = "id") int id) {		
		
		//pasar los datos de la tienda al formulario que crearemos en la pagina que se muestra
		
		return "/tienda/modificar";
	}

}
