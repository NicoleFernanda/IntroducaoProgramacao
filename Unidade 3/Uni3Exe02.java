/*Uma loja de calçados está concedendo 12% de desconto nos produtos. 
Escreva um programa para calcular e exibir o valor de desconto a ser dado num par de sapatos e quanto deve 
custar o produto com o desconto. O preço do par de sapatos deve ser informado pelo usuário. 
Como resultado, o programa deverá exibir as seguintes mensagens:
O valor do desconto é de R$ xxx
O preço do par de sapatos com desconto é R$ xxx */

import java.util.Scanner;

public class Uni3Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o valor do seu produto: ");
        double sapato = teclado.nextDouble();
        double desconto = (sapato * 0.12);
        double valor = (sapato - desconto);
        // ou: double valor = sapato * 0.88;
         System.out.println("O valor do desconto é de R$: " + desconto + 
         "\nO preço do par de sapatos com desconto é de R$: "  + valor);
        
        teclado.close();
    }
    
}
