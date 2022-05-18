import java.util.Scanner;

public class Uni5Exe06 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);      
        double media = 0, altura, soma = 0;
        
        for (int i = 1; i <= 20; i++) {
            System.out.println("escreva as alturas   ["+i+"]:");
            altura = tec.nextDouble();
            soma = soma + altura;
        
        }
    
        media = soma/20;
        System.out.println("media de alturas = " + media);

        tec.close();

    }
}
