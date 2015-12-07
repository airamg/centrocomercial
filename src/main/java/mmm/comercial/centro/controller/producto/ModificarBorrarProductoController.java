package mmm.comercial.centro.controller.producto;

import mmm.comercial.centro.service.interfaces.IProductoService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class ModificarBorrarProductoController {
	
	@Autowired
	@Qualifier("productoService")
	private IProductoService proservice;
	
	/**
	 * Método al que se accede desde la cuenta de empleado y lleva al formulario de edición del producto seleccionado
	 * @param id
	 * @return String
	 */
	@RequestMapping(value = "/productos/modificarborrar/{id}", method = RequestMethod.GET)
	public String modificarborrarproducto(@PathVariable(value = "id") int id) {		
		
		//pasar los datos del producto al formulario que crearemos en la pagina que se muestra (boton modificar y borrar)
		
		return "/producto/modificar";
	}

}
