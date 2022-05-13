import java.util.Scanner;
import java.text.DecimalFormat;
    public class Exercício3 {
        
        public static void main(String[] args) {
        
            Scanner entrada = new Scanner(System.in);
            double raio = entrada.nextDouble();
            double n = 3.14159;
            
            DecimalFormat F = new DecimalFormat ("0.0000");

            double A = ((raio * raio) * n);

            System.out.println("A=" + F.format(A));
            
            entrada.close();
    
    }
    
}
