// Neste problema, deve-se ler o código de uma peça 1, o número de peças 1, o valor unitário de cada peça 1, 
//o código de uma peça 2, o número de peças 2 e o valor unitário de cada peça 2. Após, calcule e mostre o 
//valor a ser pago.



import java.util.Scanner;
import java.text.DecimalFormat;

public class Exercício8 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
            //peça 1
            System.out.print("Informe o código da peça 1: ");
            int peça1 = teclado.nextInt();
            System.out.print("Informe a quantidade de peças 1: ");
            int quant1 = teclado.nextInt();
            System.out.print("Informe o valor de cada peça 1: ");
            float valor1 = teclado.nextFloat();
            
            //peça 2
            System.out.print("Informe o código da peça 2: ");
            int peça2 = teclado.nextInt();
            System.out.print("Informe a quantidade de peças 2: ");
            int quant2 = teclado.nextInt();
            System.out.print("Informe o valor de cada peça 2: ");
            float valor2 = teclado.nextFloat();

            //total a ser pago
            DecimalFormat F = new DecimalFormat("0.0000");
            float total1 = quant1 * valor1;
            float total2 = quant2 * valor2;
            float soma = total1 + total2;
            System.out.print("o valor correspondente para " + quant1 + " peças do código " + peça1 + "e " + quant2 
            + " do código " + peça2 + "é: " + F.format(soma));

            teclado.close();
          


        }
    
     
        
    }
    
}
