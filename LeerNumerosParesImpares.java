
import java.util.Scanner;
import java.util.*;

public class LeerNumerosParesImpares
{
   public static void main(String[] args){
       Scanner leer=new Scanner(System.in);
       int i=0;
       double x,pn=0,cun=0;
       System.out.println("Ingresa numeros, use el cero para terminar");
       do{
           x=leer.nextDouble();
          if(x%2 == 0) 
            {
                i++;
                cun= cun+x;
        }
        else{
            i++;
            pn=pn+x;
       
        }
        
        }
        while(x!=0);
        if(cun!=0)
        	
        System.out.println("La suma de pares es "+cun);
        else 
        System.out.println("No ingreso numeros pares");
       if(pn!=0) 
        System.out.print("La suma de impares es "+pn);
        else 
        System.out.println("No ingreso numeros impares");
    }
}