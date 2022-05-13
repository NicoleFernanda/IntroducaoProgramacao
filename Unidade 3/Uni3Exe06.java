//Um restaurante cobra R$ 25,00 por cada quilo de refeição. Escreva um programa que leia o peso do prato 
//montado pelo cliente (em quilos) e imprima o valor a pagar. O peso do prato é de 750 gramas.

import java.util.Scanner;

public class Uni3Exe06 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira o preço do prato montado: ");
        float prato = teclado.nextInt();
        float comida = prato - 0.75f;
        float pagamento = comida * 25;
        System.out.println("Valor a pagar: " + pagamento);

        teclado.close();
    }
    
}
