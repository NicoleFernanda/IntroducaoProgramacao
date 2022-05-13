//       || ou          && e
/*Um casal possui três filhos: Marquinhos, Zezinho e Luluzinha. Faça um algoritmo para ler as idades dos filhos e 
exibir quem é o caçula da família; suponha que não haja empates.*/

import java.util.Scanner;
public class Uni4Exe10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //entradas
        System.out.println("Idade de Marquinhos: ");
        int marcos = teclado.nextInt();
        System.out.println("Idade de Zezinho: ");
        int ze = teclado.nextInt();
        System.out.println("Idade de Luluzinha: ");
        int lulu = teclado.nextInt();

        //processamento e saída
        if ((lulu < marcos) && (lulu < ze)){
            System.out.println("A Luluzinha é a caçula!");
        }
        if ((marcos < lulu) && (marcos < ze)){
            System.out.println("O Marquinhos é o caçula!");
        }
        if ((ze < marcos) && (ze < lulu)){
            System.out.println("O Zezinho é o caçula!");
        }
        teclado.close();
    }
    
}
