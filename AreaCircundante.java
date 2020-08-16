import java.util.Scanner;
import java.text.DecimalFormat;
public class AreaCircundante {
    public static void main(String[] args) {
        double area1,area2,area, radio;
        Scanner num = new Scanner(System.in);
        DecimalFormat decimal = new DecimalFormat("#.###");
    
            System.out.print("Introduce el radio de un círculo para calcular área circundante ");
            radio = num.nextDouble();
            area = Math.PI*(radio*radio)-2*(radio*radio);
            area1=2*(radio*radio);
            area2=Math.PI*(radio*radio);
            System.out.println("area circulo "+decimal.format(area2)+" area cuadrado "+decimal.format(area1)+" El área circundante es: " + decimal.format(area)); 
          
    }
}