import java.util.Scanner;
import java.text.NumberFormat;

public class Compañia_Seguros {

	static final double comision = 0.10;
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("Números de empleados de la compañía de seguros: ");
		int empleados = sc.nextInt ();
		
		System.out.println("Sueldo base de los empleados: ");
		double sueldo = sc.nextDouble ();
		
		int i = 1;
		
		while (i <= empleados) {
		
			System.out.println("Ingrese el número de ventas realizadas por el empleado: ");
			int ventas = sc.nextInt ();
			System.out.println("Ingrese el valor de la venta: ");
			int valorventas = sc.nextInt ();
			i++;
			
			NumberFormat moneda = NumberFormat.getCurrencyInstance();
			System.out.println ("Número de ventas realizadas: " + (ventas));
			System.out.println ("Valor total de las ventas realizadas: " + moneda.format(valorventas));
		}
		
		NumberFormat moneda = NumberFormat.getCurrencyInstance();
		System.out.println ("Sueldo del empleado: " + moneda.format(sueldo));
		
	}

}