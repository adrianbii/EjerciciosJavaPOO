package PilaColas;

public class PilaEnteros {


	  private int [] elementos;
	  private int tama�o;

	  public PilaEnteros() {
	    this(16);
	  }

	  public PilaEnteros(int capacidad) {
		  elementos = new int[capacidad];
	  }

	  public void apilaElemento(int value) {
	    if (tama�o >= elementos.length) {
	      int[] temp = new int[elementos.length * 2];
	      System.arraycopy(elementos, 0, temp, 0, elementos.length);
	      elementos = temp;
	    }

	    elementos[tama�o++] = value;
	  }

	  public int retiraElemento() {
	    return elementos[--tama�o];
	  }

	  public int verElemento() {
	    return elementos[tama�o - 1];
	  }

	  public boolean vacia() {
	    return tama�o == 0;
	  }

	  public int getTama�o() {
	    return tama�o;
	  }
	}