
public class TestIMC {

	  public static void main(String[] args) {
	    IMC imc1 = new IMC("John Doe", 18, 90, 1.9);
	    System.out.println("El indice de masa corporal de " + imc1.getNombre() + " es "
	      + imc1.getIMC() + " " + imc1.getEstado());
	    
	    IMC bmi2 = new IMC("Peter King", 60, 1.50);
	    System.out.println("El indice de masa corporal de " + bmi2.getNombre() + " es "
	      + bmi2.getIMC() + " " + bmi2.getEstado());
	  }
	}