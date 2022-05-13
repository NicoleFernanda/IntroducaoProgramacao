//Dado um número de ponto flutuante maior do que 0, informe se foram digitadas ou não casas decimais no número.

import java.util.Scanner;

public class Uni4Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entradas
        System.out.println("Insira um número maior que zero");
        float valor = teclado.nextFloat(); //valor com casas decimais (ex: 10,5)
        int valorInteiro = (int) valor; // valor sem casas decimais  (ex: 10)
        float decimais = valor - valorInteiro; //a diferença entre os dois (10,5 - 10); só o numero apos virgula

        //processamento e saida
        if (decimais == 0) {  //numero inteiro
            System.out.println("O número não possui casas decimais");
        } else {
            System.out.println("O número possui casas decimais");
        }

        teclado.close();
    }


}
