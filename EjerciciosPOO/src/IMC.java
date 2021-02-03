
public class IMC {

	  private String nombre;
	  private int edad;
	  private double peso;
	  private double altura;  
	  
	  public IMC(String nombre, int edad, double peso, double altura) {
	    this.nombre = nombre;
	    this.edad = edad;
	    this.peso = peso;
	    this.altura = altura;
	  }
	  
	  public IMC(String nombre, double peso, double altura) {
	    this(nombre, 20, peso, altura);
	  }
	  
	  public double getIMC() {
	    double imc = peso / 
	      (altura * altura);
	    return Math.round(imc * 100) / 100.0;
	  }
	  
	  public String getEstado() {
	    double bmi = getIMC();
	    if (bmi < 18.5)
	      return "Bajo de peso";
	    else if (bmi < 25)
	      return "Normal";
	    else if (bmi < 30)
	      return "Sobre peso";
	    else
	      return "Obeso";
	  }
	  
	  public String getNombre() {
	    return nombre;
	  }
	  
	  public int getEdad() {
	    return edad;
	  }
	  
	  public double getPeso() {
	    return peso;
	  }
	  
	  public double getAltura() {
	    return altura;
	  }
	}