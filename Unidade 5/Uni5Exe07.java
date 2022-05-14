import java.util.Scanner;

public class Uni5Exe07 {
    public static void main(String[] args) {
        Scanner te = new Scanner(System.in);
        System.out.println("Quantos numeros vc quer entrar: ");
        int n = te.nextInt();
        int maior = 0; int menor = 0, numero;

        for (int i = 1 ;i <= n; i++) {
            System.out.println("escolha os numeros (inteiros):   ["+i+"]");
            numero = te.nextInt();

            if (i == 1) {
               maior = numero;
               menor = numero; 
            } 
            if (numero > maior) {
                maior = numero; 
            } else if (numero < menor) {
                menor = numero;
            }

        }
    
    System.out.println("maior numero = " + maior);
    System.out.println("menor numero = " + menor);
    te.close();
    }
}
