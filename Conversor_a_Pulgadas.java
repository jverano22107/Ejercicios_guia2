import java.util.*;
import java.text.DecimalFormat;
public class Conversor_a_Pulgadas{
       public static void main( String args[] ){
       
       String cal;
       System.out.println( "Ingrese la letra segun preferencia de conversión" );
       System.out.println( "P - Pies a pulgadas" );
       System.out.println( "C - Centimetos a pulgadas" );
       System.out.println( "L - Leguas a pulgadas" );
       System.out.println( "Y - Yardas a pulgadas" );
       ///System.out.println( "\n" );
       Scanner leer = new Scanner(System.in);
       cal = leer.nextLine();
       int Pies,CM,Yarda,Legua;
       double Resultado;
       DecimalFormat formato2 = new DecimalFormat("#.###");
       switch (cal){
                   case "P":
                          System.out.println( "Pies a pulgadas" );
                          System.out.println( "Ingrese los pies" );
                         
                          Pies = leer.nextInt();
                          Resultado = Pies / 0.0833;
                          System.out.println("El resultado es: "+formato2.format(Resultado)+" pulgadas" );
                          break;
                   case "C":
                          System.out.println( "Centimetos a pulgadas" );
                          System.out.println( "Ingrese los centimetos" );
                          CM = leer.nextInt();
                          Resultado = CM / 2.54;
                          System.out.println( "El resultado es: "+formato2.format(Resultado)+" pulgadas" );
                          break;
                   case "Y":
                          System.out.println( "Yardas a pulgadas" );
                          System.out.println( "Ingrese las yardas" );
                          Yarda = leer.nextInt();
                          Resultado = Yarda * 36;
                          System.out.println( "El resultado es: "+formato2.format(Resultado)+" pulgadas" );
                          break;
                   case "L":
                          System.out.println( "Leguas a pulgadas" );
                          System.out.println( "Ingrese las leguas" );
                          Legua = leer.nextInt();
                          Resultado = Legua  * 190080.02;
                          System.out.println( "El resultado es: "+formato2.format(Resultado)+" pulgadas" );
                          
                  }
       }
}