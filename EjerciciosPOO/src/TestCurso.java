
public class TestCurso {

	  public static void main(String[] args) {
	    Curso curso1 = new Curso("Programacion");
	    Curso curso2 = new Curso("Sistemas gestores de bases de datos");

	    curso1.añadeEstudiante("Pedro Panyagua");
	    curso1.añadeEstudiante("Barbara Lopez");
	    curso1.añadeEstudiante("Jan Politu");

	    curso2.añadeEstudiante("Francisco Gomez");
	    curso2.añadeEstudiante("Salvador Perez");

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