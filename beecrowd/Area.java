import java.text.DecimalFormat;
import java.util.Scanner;

public class Area {
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
        
        double A = variavel.nextDouble();
        double B = variavel.nextDouble();
        double C = variavel.nextDouble();

        DecimalFormat F = new DecimalFormat("0.000");
        
        double TRIANGULO = (A * C)/2;
        double CIRCULO = ((C*C)*(3.14159));
        double TRAPEZIO = ((A + B)*C)/2;
        double QUADRADO = B*B;
        double RETANGULO = A*B;
        
        System.out.println("TRIANGULO: " + F.format(TRIANGULO) + "\nCIRCULO: " + F.format(CIRCULO) + "\nTRAPEZIO: " + F.format(TRAPEZIO) +
        "\nQUADRADO: " + F.format(QUADRADO) + "\nRETANGULO: " + F.format(RETANGULO));
        

        variavel.close();
        


        
    }
}
