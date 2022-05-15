import java.util.Scanner;

public class Media2 {
    public static void main(String[] args) {
                
        Scanner teclado = new Scanner(System.in);
                
        double A = teclado.nextDouble();
        double B = teclado.nextDouble();
        double C = teclado.nextDouble();
        
        double media = (((A * 3) + (B * 2) + (C * 5))/10);
        System.out.println(media);
                
        teclado.close();
    }
}
        
