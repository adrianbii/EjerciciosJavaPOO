
public class Prestamo {
	  private double interesAnual;
	  private int numeroDeAños;
	  private double importePrestamo;
	  private java.util.Date fechaPrestamo;

	  /** Constructor por defecto */
	  public Prestamo() {
	    this(2.5, 1, 1000);
	  }

	  /** Construir un préstamo con una tasa de interés anual especificada,
		cantidad de años y monto del préstamo  */
	  public Prestamo(double interesAnual, int numeroDeAños,
	      double importePrestamo) {
	    this.interesAnual = interesAnual;
	    this.numeroDeAños = numeroDeAños;
	    this.importePrestamo = importePrestamo;
	    fechaPrestamo = new java.util.Date();
	  }

	  /** Devuelve interesAnual */
	  public double getInteresAnual() {
	    return interesAnual;
	  }

	  /** Introduce un nuevo interesAnual */
	  public void setAnnualInterestRate(double interesAnual) {
	    this.interesAnual = interesAnual;
	  }

	  /** Devuelve numeroDeAños */
	  public int getNumeroDeAños() {
	    return numeroDeAños;
	  }

	  /** Introduce un nuevo numeroDeAños */
	  public void setNumeroDeAños(int numeroDeAños) {
	    this.numeroDeAños = numeroDeAños;
	  }

	  /** Devuelve importePrestamo */
	  public double getImportePrestamo() {
	    return importePrestamo;
	  }

	  /** Introduce un importePrestamo */
	  public void setImportePrestamo(double importePrestamo) {
	    this.importePrestamo = importePrestamo;
	  }

	  /** Devuelve pago mensual */
	  public double getPagoMesual() {
	    double tasaInteresMensual = interesAnual / 1200;
	    double pagoMensual = importePrestamo * tasaInteresMensual / (1 -
	      (1 / Math.pow(1 + tasaInteresMensual, numeroDeAños * 12)));
	    return pagoMensual;    
	  }

	  /** Devuelve el pago total */
	  public double getpagoTotal() {
	    double pagoTotal = getPagoMesual() * numeroDeAños * 12;
	    return pagoTotal;    
	  }

	  /** Devuelve fecha del prestamo */
	  public java.util.Date getFechaPrestamo() {
	    return fechaPrestamo;
	  }
	}