import java.util.*;
public class ValidacionNumeros {
    public static void main(String[] args) {
       
    	Scanner teclado=new Scanner(System.in);
        int numero,val,mayor,menor;
        double media;
        System.out.print("cuantos numeros quiere ingresar: ");
        numero=teclado.nextInt();
        mayor=0;
        menor=999999999;
        media=0;
        for (int i=1;i<=numero;i++)
        {
            System.out.print("Ingrese cantidad " + i+" : ");
            val=teclado.nextInt();
            if (val>mayor)
            {
                mayor=val;
            }
            if (val<menor)
            {
                menor=val;
            }
            media=media+val;
        }
        media=media/numero;
        
        System.out.println("\n");
        System.out.println("El numero mayor es: " + mayor);
        System.out.println("El numero menor es: " + menor);
        System.out.println("La media de los valores: " + media);
    }
} 