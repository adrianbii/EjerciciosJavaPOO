package PilaColas;


public class ColaEnteros {

	  private int[] elementos;
	  private int tamaño;

	  public ColaEnteros() {
	    this(16);
	  }
	  public ColaEnteros(int capacidad) {
		  elementos = new int[capacidad];
	  }
	  public void encolaElemento(int value) {
	    if (tamaño >= elementos.length) {
	      int[] temp = new int[elementos.length * 2];
	      System.arraycopy(elementos, 0, temp, 0, elementos.length);
	      elementos = temp;
	    }
	    elementos[tamaño++] = value;
	  }
	  public int retiraElemento() {
		int aux =  elementos[0];
		System.arraycopy(elementos, 1, elementos, 0, elementos.length-1);
		--tamaño;
	    return aux;
	  }
	  public int verElemento() {
	    return elementos[0];
	  }
	  public boolean vacia() {
	    return tamaño == 0;
	  }
	  public int getTamaño() {
	    return tamaño;
	  }
	}