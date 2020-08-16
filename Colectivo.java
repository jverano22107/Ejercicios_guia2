import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;
public class Colectivo
    {
        public static void main(String[] args)
        {
        double Cupo, N_Turistas,N_Viajes,Costo_Viaje,Pago_Propietario;
        
        Scanner Tecl = new Scanner(System.in);
        System.out.print("Cupo del colectivo ");
        Cupo = Tecl.nextDouble();
        System.out.print("Numero de personas a transportar al hotel ");
        N_Turistas = Tecl.nextDouble();
        N_Viajes = Math.ceil((float)(N_Turistas/Cupo));
        Costo_Viaje = N_Turistas * 10000;
        Pago_Propietario = N_Viajes * 2000;
        NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);
        String currency = format.format(Costo_Viaje);
        String currency1 = format.format(Pago_Propietario);
        System.out.println("Cantidad de viajes = "+N_Viajes);
        System.out.println("Costo total del viaje  = "+currency);
        System.out.println("Valor a pagar al propietario  = "+currency1);
        
         
  
    }
    }