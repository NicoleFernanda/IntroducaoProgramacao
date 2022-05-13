/*                       || ou          && e 
Escreva um algoritmo que leia a idade de 2 homens e 2 mulheres (considere que a idade entre homens e mulheres sempre 
serão diferentes). Calcule e escreva a soma das idades do homem mais velho com a mulher mais nova, e o produto das 
idades do homem mais novo com a mulher mais velha.
*/

import java.util.Scanner;
public class Uni4Exe16 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        //entradas 
        System.out.println("Idade de um homem: ");
        int homem1 = teclado.nextInt();
        System.out.println("Idade de outro homem: ");
        int homem2 = teclado.nextInt();
        System.out.println("Idade de uma mulher: ");        
        int mulher1 = teclado.nextInt();
        System.out.println("Idade de outra mulher: ");
        int mulher2 = teclado.nextInt();
        
        
        //processamento e saida
        //          soma : homem mais velho       +      mulher mais nova
        //          produto: homem mais novo      *      mulher mais velha
        if ((homem1 > homem2) && (mulher1 > mulher2)) { 
            int soma = homem1 + mulher2;               // homem mais velho: 1;   mulher mais nova: 2
            int produto = homem2 * mulher1;           // homem mais novo: 2;   mulher mais velha: 1
            System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + soma);
            System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + produto);

        } else if ((homem1 > homem2) && (mulher1 < mulher2)) {
            int soma = homem1 + mulher1;               // homem mais velho:1;   mulher mais nova: 1
            int produto = homem2 * mulher2;           // homem mais novo: 2;   mulher mais velha: 2
            System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + soma);
            System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + produto);


        } else if ((homem1 < homem2) && (mulher1 > mulher2)) {
            int soma = homem2 + mulher2;               // homem mais velho:2;   mulher mais nova: 2
            int produto = homem1 * mulher1;           // homem mais novo: 1;   mulher mais velha: 1
            System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + soma);
            System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + produto);


        } else if ((homem1 < homem2) && (mulher1 < mulher2)) {
            int soma = homem2 + mulher1;               // homem mais velho:2;   mulher mais nova: 1
            int produto = homem1 * mulher2;           // homem mais novo: 1;   mulher mais velha: 2
            System.out.println("A soma das idades do homem mais velho com a mulher mais nova é " + soma);
            System.out.println("O produto das idades do homem mais novo com a mulher mais velha é " + produto);

        }
        teclado.close();
    }
    
}
