package Inventario;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Almacen {
	static Scanner input = new Scanner(System.in);
	private Producto [] inventario;
	private int cantidad;
	private String direccion;
	private String ecargado;
	
	public Almacen(int tamaño, String direccion, String ecargado) {
		this.inventario= new Producto[tamaño] ;
		this.cantidad = 0; //Cantidad de productos que hay en el inventario.
		this.direccion = direccion; // Dirección física del almacen.
		this.ecargado = ecargado; //Nombre de la persona encargada del almacen.
	}
	
	public Almacen() {
		this(10,"","");
	}
	// Permita leer de teclado los datos del objeto.
	
	public Producto LeeProducto() {
				System.out.print("Id Producto: ");
				int idProducto = input.nextInt();
				System.out.print("Nombre: ");
				String nombre = input.next();
				System.out.print("Descripcion: ");
				String descripcion = input.next();
				System.out.print("Fecha caducidad: ");
				String fecha = input.next();
				DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");// Creamos un formato de fecha
				LocalDate fechaCad = LocalDate.parse(fecha, formato); // Creamos un LocalDate con la entrada en el formato especificado
				return new Producto(idProducto, nombre,descripcion,fechaCad);
			}
		    // Mostrará por pantalla los datos que contiene el objeto.
	public void verProducto(int posicion) {
		DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");// Creamos un formato de fecha
		System.out.println("IdProducto: " +inventario[posicion].getIdProducto() + "\n" +
							"Nombre: " + inventario[posicion].getNombre() + "\n" +
							"Descripcion: " + inventario[posicion].getDescripcion() + "\n" +
							"Nacimiento: " +inventario[posicion].getFechaCaducidad().format(formato));
	}
	public  int buscaIdProducto(int idProductoBuscado) {
		int posicion=-1;
		for (int i = 0; i < this.cantidad; i++) {
			if (idProductoBuscado == this.inventario[i].getIdProducto()) {
				posicion = i;
			}
		}
		return posicion;
	}
	public void añadeProducto() {
		if (this.cantidad<inventario.length) {
			this.inventario[this.cantidad]=LeeProducto();
			this.cantidad++;	
		}
		
	}
	public void modificaProducto() {
		System.out.println("Indique el id del producto a modificar: ");
		int posicion = buscaIdProducto(input.nextInt());
		if (posicion>=0) {
			verProducto(posicion);
			this.inventario[posicion]=LeeProducto();
		}else System.out.println("Producto no encontrado.");
		
	}
	public void borraProducto() {
		System.out.println("Indique el id del producto a borrar: ");
		int posicion = buscaIdProducto(input.nextInt());
		if (posicion>=0) {
			System.arraycopy(this.inventario, posicion, this.inventario, posicion+1, this.cantidad);
			this.cantidad--;
		}else System.out.println("Producto no encontrado.");
		
	}

	public void setInventario(Producto[] inventario) {
		this.inventario = inventario;
	}

	public int getCantidad() {
		return cantidad;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getEcargado() {
		return ecargado;
	}

	public void setEcargado(String ecargado) {
		this.ecargado = ecargado;
	}

	public String toString() {
		String text= "Direccion=" + direccion	+ ", Ecargado=" + ecargado + 
				"Inventario:";
				for(int i=0;i<cantidad;i++) text +="\n "+inventario[i].toString();
		return text;		
	}
	

}
