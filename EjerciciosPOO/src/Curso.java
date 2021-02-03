
public class Curso {


	  private String nombreCurso;
	  private String[] estudiantes = new String[4];
	  private int numeroEstudiantes;
	    
	  public Curso(String nombreCurso) {
	    this.nombreCurso = nombreCurso;
	  }
	  
	  public void añadeEstudiante(String estudiante) {
		estudiantes[numeroEstudiantes] = estudiante;
		numeroEstudiantes++;
	  }
	  
	  public String[] getEstudiantes() {
	    return estudiantes;
	  }

	  public int getNumeroEstudiantes() {
	    return numeroEstudiantes;
	  }  

	  public String getNombreCursoe() {
	    return nombreCurso;
	  }  

	}