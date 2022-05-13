//Dado um valor inteiro maior do que 0 informe se o valor é par ou ímpar. 

import java.util.Scanner;
public class Uni4Exe02 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //entradas
        
        System.out.println("Entre com um valor inteiro maior que zero: ");
        int valor = teclado.nextInt();
         
        //processamento e saida
        if (valor % 2 == 0) {
            System.out.println("Número é par");
        } else {
            System.out.println("Número é ímpar");
        }

        teclado.close();
        
    }
    
}
