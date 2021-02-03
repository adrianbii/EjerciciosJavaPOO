package Inventario;

import java.time.LocalDate;
import java.util.Random;

public class Producto {

	private int idProducto;
	private String nombre;
	private String descripcion;
	private LocalDate fechaCaducidad;
	static Random r = new Random();
	
    public Producto(int idProducto, String nombre, String descripcion, LocalDate fechaCaducidad) {
		this.idProducto = idProducto;
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.fechaCaducidad = fechaCaducidad;
	}
    public Producto() {
    	this(r.nextInt(100),"","",LocalDate.now());
    }
	public int getIdProducto() {
		return idProducto;
	}
	public void setIdProducto(int idProducto) {
		this.idProducto = idProducto;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getDescripcion() {
		return descripcion;
	}
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	public LocalDate getFechaCaducidad() {
		return fechaCaducidad;
	}
	public void setFechaCaducidad(LocalDate fechaCaducidad) {
		this.fechaCaducidad = fechaCaducidad;
	}
	@Override
	public String toString() {
		return " id=" + idProducto + ", nombre=" + nombre + ", descripcion=" + descripcion
				+ ", fechaCaducidad=" + fechaCaducidad;
	}
    
  
  
}
