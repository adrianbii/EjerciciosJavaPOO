
public class Prestamo {
	  private double interesAnual;
	  private int numeroDeA�os;
	  private double importePrestamo;
	  private java.util.Date fechaPrestamo;

	  /** Constructor por defecto */
	  public Prestamo() {
	    this(2.5, 1, 1000);
	  }

	  /** Construir un pr�stamo con una tasa de inter�s anual especificada,
		cantidad de a�os y monto del pr�stamo  */
	  public Prestamo(double interesAnual, int numeroDeA�os,
	      double importePrestamo) {
	    this.interesAnual = interesAnual;
	    this.numeroDeA�os = numeroDeA�os;
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

	  /** Devuelve numeroDeA�os */
	  public int getNumeroDeA�os() {
	    return numeroDeA�os;
	  }

	  /** Introduce un nuevo numeroDeA�os */
	  public void setNumeroDeA�os(int numeroDeA�os) {
	    this.numeroDeA�os = numeroDeA�os;
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
	      (1 / Math.pow(1 + tasaInteresMensual, numeroDeA�os * 12)));
	    return pagoMensual;    
	  }

	  /** Devuelve el pago total */
	  public double getpagoTotal() {
	    double pagoTotal = getPagoMesual() * numeroDeA�os * 12;
	    return pagoTotal;    
	  }

	  /** Devuelve fecha del prestamo */
	  public java.util.Date getFechaPrestamo() {
	    return fechaPrestamo;
	  }
	}