package mmm.comercial.centro.pojo;

public class Empleado extends Usuario {
	
	private int id;
	
	public Empleado() {
		super();
		super.setRole("EMP");		
	}	
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
}
