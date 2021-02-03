package PilaColas;

public class TestColaElementos {
	static public void main(String[] args) {
		ColaEnteros miCola = new ColaEnteros(5);
	     miCola.encolaElemento(65);
	     miCola.encolaElemento(78);
	     miCola.encolaElemento(67);
	     miCola.encolaElemento(12);
	     miCola.encolaElemento(41);
	     miCola.encolaElemento(76);
	     miCola.encolaElemento(38);
	     System.out.println(miCola.retiraElemento());
	     System.out.println(miCola.verElemento());
	     while (!miCola.vacia()) {
	         System.out.print(miCola.retiraElemento() + " ");  
	     }

	}
}
