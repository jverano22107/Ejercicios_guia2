import java.util.Scanner;
import java.text.NumberFormat;
import java.util.Locale;

public class Comidas_Restaurante{
   public static void main(String[] args){
    Scanner leer = new Scanner(System.in);
    NumberFormat format = NumberFormat.getCurrencyInstance(Locale.CANADA);
    System.out.println("El restaurante ofrece tres tipos de Menú");
    System.out.println("Vegetariano digite 1, No vegetariano digite 2 y Comida rápida digite 3");
    int Tipo;
    Tipo = leer.nextInt();
    
         if (Tipo==1) {
            System.out.println ("Menú vegetariano, digite un # según su preferencia");
            System.out.println ("1. Sopa de vegetales  $10.000");
            System.out.println ("2. Ensalada  $25.000");
            System.out.println ("3. Jugo  $5.000");
            int Eleccion,Cantidad;
            Eleccion = leer.nextInt();
            System.out.println ("Digite Cantidad");
            Cantidad = leer.nextInt();
            double Precio=0,Impuesto,Descuento;
            if(Eleccion==1){Precio=Cantidad*10000;}if(Eleccion==2){Precio=Cantidad*25000;}if(Eleccion==3){ Precio=Cantidad*5000;}
            Impuesto = Precio*0.19;
            Descuento=(Precio+Impuesto)*0.2;
            String TotalB = format.format(Precio);
            String IVA = format.format(Impuesto);
            String TotalN = format.format(Precio+Impuesto);
            String Descuent = format.format(Descuento);
            String Total = format.format(Precio+Impuesto-Descuento);
            System.out.println ("Total bruto............."+TotalB);
            System.out.println ("IVA(19%)................"+IVA);
            System.out.println ("Total neto.............."+TotalN);
            System.out.println ("Descuento(20%).........."+Descuent);
            System.out.println ("Total a pagar..........."+Total);}
         else if(Tipo==2){
            System.out.println ("Menú no vegetariano, digite un # según su preferencia");
            System.out.println ("1. Bandeja de carne  $30.000");
            System.out.println ("2. Bandeja de pollo  $28.000");
            
            int Eleccion,Cantidad;
            Eleccion = leer.nextInt();
            System.out.println ("Digite Cantidad");
            Cantidad = leer.nextInt();
            double Precio=0,Impuesto,Descuento;
            if(Eleccion==1){Precio=Cantidad*30000;}if(Eleccion==2){Precio=Cantidad*28000;}if(Eleccion<1&&Eleccion>2){ Precio=Cantidad*0;}
            Impuesto = Precio*0.19;
            Descuento=(Precio+Impuesto)*0.1;
            String TotalB = format.format(Precio);
            String IVA = format.format(Impuesto);
            String TotalN = format.format(Precio+Impuesto);
            String Descuent = format.format(Descuento);
            String Total = format.format(Precio+Impuesto-Descuento);
            System.out.println ("Total bruto............."+TotalB);
            System.out.println ("IVA(19%)................"+IVA);
            System.out.println ("Total neto.............."+TotalN);
            System.out.println ("Descuento(10%).........."+Descuent);
            System.out.println ("Total a pagar..........."+Total);}
         else if(Tipo==3){
            System.out.println ("Menú Comidas rápidas, digite un # según su preferencia");
            System.out.println ("1. Perro caliente  $5.000");
            System.out.println ("2. Hamburguesa  $7.000");
            
            int Eleccion,Cantidad;
            Eleccion = leer.nextInt();
            System.out.println ("Digite Cantidad");
            Cantidad = leer.nextInt();
            double Precio=0,Impuesto,Descuento;
            if(Eleccion==1){Precio=Cantidad*5000;}if(Eleccion==2){Precio=Cantidad*7000;}if(Eleccion<1&&Eleccion>2){ Precio=Cantidad*0;}
            Impuesto = Precio*0.19;
            Descuento=0;
            String TotalB = format.format(Precio);
            String IVA = format.format(Impuesto);
            String TotalN = format.format(Precio+Impuesto);
            String Descuent = format.format(Descuento);
            String Total = format.format(Precio+Impuesto-Descuento);
            System.out.println ("Total bruto............."+TotalB);
            System.out.println ("IVA(19%)................"+IVA);
            System.out.println ("Total neto.............."+TotalN);
            System.out.println ("Descuento(0%)..........."+Descuent);
            System.out.println ("Total a pagar..........."+Total);}
         else {
            System.out.println ("Selección incorrecta");}
    }
 
}
