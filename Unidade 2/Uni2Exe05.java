//Leia quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto de A e B 
//pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

import java.util.Scanner;

public class Exercício5 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
        System.out.print("Digite o valor A: ");
        int a = teclado.nextInt();
        System.out.print("Digite valor B: ");
        int b = teclado.nextInt();
        System.out.print("Digite o valor C: ");
        int c = teclado.nextInt();
        System.out.print("Digite o valor D: ");
        int d = teclado.nextInt();

        int resultado = ((a*b) - (c*d)); 
        System.out.print("o resultado da difereça do produto AB pelo BC é: " + resultado);

        
        
        
        teclado.close();
        }
    }
}