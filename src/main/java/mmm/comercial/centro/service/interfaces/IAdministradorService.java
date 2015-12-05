package mmm.comercial.centro.service.interfaces;

import java.util.List;

import mmm.comercial.centro.model.AdministradorDAOImpl;
import mmm.comercial.centro.pojo.Administrador;


public interface IAdministradorService {
	
	public Administrador getById(int codigo);
	
	public Administrador getByUser(String user);	
	
	public List<Administrador> getAll();

	public int update(Administrador a);
	
	public int delete(int codigo);
	
	public void setAdministradorDAO(AdministradorDAOImpl administradorDAO);

}