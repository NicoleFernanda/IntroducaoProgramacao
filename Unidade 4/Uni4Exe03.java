//Dados dois números inteiros descreva um algoritmo para informar o maior valor entre eles.

import java.util.Scanner;
public class Uni4Exe03 {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
           
        //entradas
        System.out.println("Insira um valor inteiro");
        int A = teclado.nextInt();
        System.out.println("Insira outro valor inteiro"); 
        int B = teclado.nextInt();
        
        //processamento e saida
        if (A>B){
            System.out.println( A +" é o maior valor entre os dois números");
        } else {
            System.out.println(B + " é o maior valor entre os dois números");
        }
        

        teclado.close();

    }
    
}
