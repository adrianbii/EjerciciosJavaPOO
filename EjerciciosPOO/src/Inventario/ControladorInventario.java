package Inventario;

import java.util.Scanner;

public class ControladorInventario {
	static Scanner input = new Scanner(System.in);
	public static int menu() {
		System.out.println("-----------------");
		System.out.println("1. ALTAS");
		System.out.println("2. BAJAS");
		System.out.println("3. MODIFICACION");
		System.out.println("4. CONSULTA");
		System.out.println("5. Salir");
		System.out.println("-----------------");
		System.out.print("Introduce una opcion: ");
		int valor = input.nextInt();
		System.out.println();
		return valor;
	}
	
	public static void main(String[] args) {
		Almacen MiAlmacen = new Almacen(100,"Poligono industrial nave 1B-10","Diego Perez Sur");
		int op=menu();
		while (op!=5) {
			switch (op) {
			case 1:
				MiAlmacen.añadeProducto();
				break;
			case 2:
				MiAlmacen.borraProducto();
				break;	
			case 3:
				MiAlmacen.modificaProducto();
				break;	
			case 4:
				System.out.println(MiAlmacen.toString());
				break;	
			}
			op=menu();
		}
	
	}

}
