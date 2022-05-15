import java.util.Scanner;
import java.text.DecimalFormat;
public class SalarioComBonus {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        String nome = teclado.nextLine();
        double salario = teclado.nextDouble();
        double vendas = teclado.nextDouble();
        

        DecimalFormat F = new DecimalFormat ("0.00");
        double TOTAL = salario + (vendas * 0.15);
        System.out.println("TOTAL = R$ " + F.format(TOTAL));

        teclado.close();
    }
    
}
