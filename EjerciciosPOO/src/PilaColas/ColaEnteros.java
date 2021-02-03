package PilaColas;


public class ColaEnteros {

	  private int[] elementos;
	  private int tama�o;

	  public ColaEnteros() {
	    this(16);
	  }
	  public ColaEnteros(int capacidad) {
		  elementos = new int[capacidad];
	  }
	  public void encolaElemento(int value) {
	    if (tama�o >= elementos.length) {
	      int[] temp = new int[elementos.length * 2];
	      System.arraycopy(elementos, 0, temp, 0, elementos.length);
	      elementos = temp;
	    }
	    elementos[tama�o++] = value;
	  }
	  public int retiraElemento() {
		int aux =  elementos[0];
		System.arraycopy(elementos, 1, elementos, 0, elementos.length-1);
		--tama�o;
	    return aux;
	  }
	  public int verElemento() {
	    return elementos[0];
	  }
	  public boolean vacia() {
	    return tama�o == 0;
	  }
	  public int getTama�o() {
	    return tama�o;
	  }
	}