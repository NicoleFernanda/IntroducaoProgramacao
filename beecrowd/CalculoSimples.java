import java.util.Scanner;
import java.text.DecimalFormat;
public class CalculoSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        int peça1 = teclado.nextInt();
        int quant1 = teclado.nextInt();
        float valor1 = teclado.nextFloat();
            
        int peça2 = teclado.nextInt();
        int quant2 = teclado.nextInt();
        float valor2 = teclado.nextFloat();
        
        DecimalFormat F = new DecimalFormat("0.00");

        float total1 = quant1 * valor1;
        float total2 = quant2 * valor2;
        float soma = total1 + total2;
        
        System.out.println("VALOR A PAGAR: R$ " + F.format(soma));
        teclado.close();
    }
    
}
