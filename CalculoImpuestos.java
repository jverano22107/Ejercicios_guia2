import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class CalculoImpuestos
{
   public static void main(String[] args)
        {
    Scanner leer = new Scanner(System.in);
    System.out.println("A partir del precio bruto y el tipo de vehículo, se calcula los impuestos y precio neto.");
    System.out.print("Ingrese precio bruto = ");
    int Tipo;
    double PrecioB;
    PrecioB = leer.nextDouble();
    System.out.print("Ingrese tipo asi Camioneta= 1 o Automovil= 2  = ");
    Tipo = leer.nextInt();
    double PrecioNeto=0;
    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);
     {
         if (Tipo==1&&PrecioB<80) {
             String currency = format.format(PrecioNeto);
            System.out.println ("Exento de impuestos precio Neto = "+currency);

        }
        else if (Tipo==1&&PrecioB>=80) {
            String currency = format.format(PrecioB/2);
            String currency1 = format.format((PrecioB+(PrecioB/2)));
            System.out.println ("Los impuestos "+currency+" Precio Neto = "+currency1);
        }

         else if (Tipo==2&&PrecioB<20) {
            String currency = format.format(PrecioB+5);
            System.out.println ("Los impuestos $5.00 Precio Neto = "+currency);
        }
         else if (Tipo==2&&PrecioB>20&&PrecioB<40) {
             String currency = format.format(PrecioB/5);
            String currency1 = format.format((PrecioB+(PrecioB/5)));
            System.out.println ("Los impuestos "+currency+" Precio Neto = "+currency1);
        }
        else if (Tipo==2&&PrecioB>40) {
            String currency = format.format(PrecioB+9);
            System.out.println ("Los impuestos $9.00 Precio Neto = "+currency);
        }
         else {

            System.out.println ("El tipo no es valido");

        }
    }
}
 
}
