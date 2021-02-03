
public class TestCurso {

	  public static void main(String[] args) {
	    Curso curso1 = new Curso("Programacion");
	    Curso curso2 = new Curso("Sistemas gestores de bases de datos");

	    curso1.aņadeEstudiante("Pedro Panyagua");
	    curso1.aņadeEstudiante("Barbara Lopez");
	    curso1.aņadeEstudiante("Jan Politu");

	    curso2.aņadeEstudiante("Francisco Gomez");
	    curso2.aņadeEstudiante("Salvador Perez");

	    System.out.println("Numero de estudiantes de curso1: "
	      + curso1.getNumeroEstudiantes());
	    String[] estudiante = curso1.getEstudiantes();
	    for (int i = 0; i < curso1.getNumeroEstudiantes(); i++)
	      System.out.print(estudiante[i] + ", ");
	    
	    System.out.println();
	    System.out.print("Numero de estudiantes de curso2: "
	      + curso2.getNumeroEstudiantes());
	  }
	}