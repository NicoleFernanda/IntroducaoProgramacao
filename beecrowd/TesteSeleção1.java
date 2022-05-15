/*Leia 4 valores inteiros A, B, C e D. 
A seguir, 
se B for maior do que C 
e se D for maior do que A, 
e a soma de C com D for maior que a soma de A e B 
e se C e D, ambos, forem positivos e 
se a variável A for par escrever a mensagem 
"Valores aceitos", senão escrever "Valores nao aceitos".

Entrada */
import java.util.Scanner;
public class TesteSeleção1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int C =teclado.nextInt();
        int D = teclado.nextInt();
        int somaAB = A + B;
        int somaCD = C + D;

        if ( (B > C) && (D > A) && (somaCD > somaAB) && (C > 0)&& (D > 0)&& (A % 2 == 0)) {
            System.out.println("Valores aceitos");

        } else {
            System.out.println("Valores nao aceitos");
        }
        
        teclado.close();
    }
    
}
