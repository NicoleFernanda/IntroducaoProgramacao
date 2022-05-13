//Dada uma pergunta, “a cor é azul?”, faça um programa que leia uma variável lógica com a resposta e responda 
//“Sim”, caso a resposta seja true, ou “Não”, caso seja false.

import java.util.Scanner;
public class Uni4Exe05 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //entradas
        System.out.println("a cor é azul? \nResponda 'true' para sim e 'false' para não");
        //variavel auxiliar
        boolean cor = tec.nextBoolean();
        
        //processamento e saida
        if (cor == true) {
            System.out.println("Sim");
        } else {
            System.out.println("Não");
        }

        tec.close();
    }
    
}
