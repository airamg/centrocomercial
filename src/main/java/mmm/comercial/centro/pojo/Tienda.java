package mmm.comercial.centro.pojo;

import java.util.ArrayList;
import java.util.List;

import mmm.comercial.centro.pojo.Producto;
import mmm.comercial.centro.pojo.Empleado;

public class Tienda {
	
	private int id;
	private String nombre;
	private String tipo;
	private String descripcion;
	private int estado; // 1: abierta - 0: cerrada
	private String horario_abrir;
	private String horario_cerrar;
	private List<Producto> listaProductos;
	private List<Empleado> listaEmpleados;	
	
	public Tienda() {
		super();
		setNombre("");
		setTipo("");
		setDescripcion("");
		setEstado(0);
		setHorario_abrir("08:00");
		setHorario_cerrar("22:00");
		setListaProductos(new ArrayList<Producto>());
		setListaEmpleados(new ArrayList<Empleado>());
	}

	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getNombre() {
		return nombre;
	}
	
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public String getTipo() {
		return tipo;
	}
	
	public void setTipo(String tipo) {
		this.tipo = tipo;
	}	
	
	public String getDescripcion() {
		return descripcion;
	}

	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}

	public int getEstado() {
		return estado;
	}
	
	public void setEstado(int estado) {
		this.estado = estado;
	}
	
	public String getHorario_abrir() {
		return horario_abrir;
	}
	
	public void setHorario_abrir(String horario_abrir) {
		this.horario_abrir = horario_abrir;
	}
	
	public String getHorario_cerrar() {
		return horario_cerrar;
	}
	
	public void setHorario_cerrar(String horario_cerrar) {
		this.horario_cerrar = horario_cerrar;
	}
	
	public List<Producto> getListaProductos() {
		return listaProductos;
	}
	
	public void setListaProductos(List<Producto> listaProductos) {
		this.listaProductos=listaProductos;				
	}
	
	public List<Empleado> getListaEmpleados() {
		return listaEmpleados;
	}
	
	public void setListaEmpleados(List<Empleado> listaEmpleados) {
		this.listaEmpleados=listaEmpleados;			
	}	
	
}
