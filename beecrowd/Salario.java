import java.util.Scanner;
import java.text.DecimalFormat;

public class Salario {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
    
        int NUMBER = teclado.nextInt();
        int HORAS = teclado.nextInt();
        float VALOR = teclado.nextFloat();
        float SALARY = (VALOR * HORAS);
        
        DecimalFormat F = new DecimalFormat ("0.00");
        
        System.out.println("NUMBER = " + NUMBER + "\nSALARY = U$ " + F.format(SALARY) );

        teclado.close();
    }
}
