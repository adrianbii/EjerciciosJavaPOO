package PilaColas;

public class TesPilaEnteros {

		static public void main(String[] args) {
			PilaEnteros miPila = new PilaEnteros(10);
		     miPila.apilaElemento(10);
		     miPila.apilaElemento(0);
		     miPila.apilaElemento(896);
		     miPila.apilaElemento(105);
		     miPila.apilaElemento(0);
		     miPila.apilaElemento(896);
		     miPila.apilaElemento(105);
		     System.out.println(miPila.retiraElemento());
		  
		     while (!miPila.vacia()) {
		         System.out.print(miPila.retiraElemento() + " ");  
		     }

		}
	}
