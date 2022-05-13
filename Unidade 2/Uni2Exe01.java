import java.io.IOException;
import java.util.Scanner;

public class Exercício1 {
 
    public static void main(String[] args) throws IOException {
           
        Scanner teclado = new Scanner(System.in);
        int A = teclado.nextInt();
        int B = teclado.nextInt();
        int soma = A + B;
        System.out.print("X = " + soma);
            
        teclado.close();
 
    }
 
}
