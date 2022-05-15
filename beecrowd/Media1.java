import java.text.DecimalFormat;
import java.util.Scanner;

public class Media1 {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        double A = entrada.nextDouble();
        double B = entrada.nextDouble();

        DecimalFormat F = new DecimalFormat ("0.00000");

        double MEDIA = ((( A * 3.5 ) + ( B * 7.5 ))/11);
        System.out.println("MEDIA = " + F.format(MEDIA));

        entrada.close();
    }
    
}
