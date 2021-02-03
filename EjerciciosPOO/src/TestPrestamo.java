
import java.util.Scanner;

public class TestPrestamo {
  /** metodo principal */
  public static void main(String[] args) {
   
    Scanner input = new Scanner(System.in);

    // Pide interes anual
    System.out.print(
      "Indique la tasa de interes anual, ej. 8.25: ");
    double tasaInteresAnual = input.nextDouble();

    // Pide numero de años
    System.out.print("Indique el numero de años: ");
    int numeroDeAños = input.nextInt();

    // Pide importe total
    System.out.print("Indeque el total del prestamo, ej. 120000.95: ");
    double importePrestamo =  input.nextDouble();

    // Crea un objeto Prestamo
    Prestamo miPrestamo =
      new Prestamo(tasaInteresAnual, numeroDeAños, importePrestamo);

    // Muestra fecha de miPrestamo, pago mensual y pago total
    System.out.printf("El prestamo se ha creado el %s\n" +
      "El pago mensual es %.2f\nEl pago total es %.2f\n",
      miPrestamo.getFechaPrestamo().toString(), miPrestamo.getPagoMesual(), 
      miPrestamo.getpagoTotal());
     input=null;
  }
}