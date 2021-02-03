package PilaColas;

public class PilaEnteros {


	  private int [] elementos;
	  private int tamaño;

	  public PilaEnteros() {
	    this(16);
	  }

	  public PilaEnteros(int capacidad) {
		  elementos = new int[capacidad];
	  }

	  public void apilaElemento(int value) {
	    if (tamaño >= elementos.length) {
	      int[] temp = new int[elementos.length * 2];
	      System.arraycopy(elementos, 0, temp, 0, elementos.length);
	      elementos = temp;
	    }

	    elementos[tamaño++] = value;
	  }

	  public int retiraElemento() {
	    return elementos[--tamaño];
	  }

	  public int verElemento() {
	    return elementos[tamaño - 1];
	  }

	  public boolean vacia() {
	    return tamaño == 0;
	  }

	  public int getTamaño() {
	    return tamaño;
	  }
	}