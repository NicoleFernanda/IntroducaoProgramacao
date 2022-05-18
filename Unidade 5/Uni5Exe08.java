import java.util.Scanner;

public class Uni5Exe08 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int maior = 0, menor = 0, soma = 0, numero, denominador = 0;

        System.out.println("escolha a quantidade de numeros que vc quer entrar: ");
        byte n = tec.nextByte();

        for (int i = 1; i <= n; i++) {
            System.out.println("escolha os numeros (inteiros):   ["+i+"]");
            numero = tec.nextInt();
            
            if (numero > 0) {
                soma = soma + numero;
                denominador++;
            
            } else { //numero negativo
                
                if (numero > maior) {
                    maior = numero;
                } else if (numero < menor) {
                    menor = numero;
                } else {
                    maior = numero;
                    menor = numero;

                }
                
            
            } //fim else
        
        } //fim for
        
        double media = soma/denominador;
        System.out.println();
        System.out.println("media dos numeros positivos = " + media);
        if (menor == 0) {
            System.out.println("nao ha menor numero negativo");
        } else {
        System.out.println("menor numero negativo = " + media);
        }
        tec.close();

    }
    
}
