import java.util.Scanner;

public class SomaSimples {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        
        int A = entrada.nextInt();
        int B = entrada.nextInt();
        int soma = A + B;

        System.out.println("SOMA = " + soma);
        entrada.close();
    }
}
