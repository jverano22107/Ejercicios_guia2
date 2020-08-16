import java.util.Scanner;
import java.util.*;

public class LeerNumerosEnteros
{
   public static void main(String[] args){
       Scanner leer=new Scanner(System.in);
       int i=0;
       double x,pn=0,cun=0;
       System.out.println("Ingresa numeros, use el cero para terminar");
       do{
           x=leer.nextDouble();
          if(x<0) 
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
        	
        System.out.println("El cuadrado de negativos es "+Math.pow(cun,2));
        else 
        System.out.println("No ingreso numeros negativos");
       if(pn!=0) 
        System.out.print("El cubo de los positivos es "+Math.pow(pn,3));
        else 
        System.out.println("No ingreso numeros positivos");
    }
}