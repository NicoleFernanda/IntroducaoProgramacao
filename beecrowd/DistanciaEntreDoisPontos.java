import java.text.DecimalFormat;
import java.util.Scanner;

public class DistanciaEntreDoisPontos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        float x1 = teclado.nextFloat();
        float y1 = teclado.nextFloat();

        float x2 = teclado.nextFloat();
        float y2 = teclado.nextFloat();

        float x = x2 - x1;
        float y = y2 - y1;

        double a = Math.pow(x, 2);
        double b = Math.pow(y, 2);
        double c = Math.sqrt(a + b);

        DecimalFormat F = new DecimalFormat("0.0000");

        System.out.println(F.format(c));
        



        teclado.close();
    }
    
}
