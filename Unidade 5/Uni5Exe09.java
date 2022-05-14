/*
Uma turma tem n alunos. Dado n, o nome e idade de cada 
aluno descreva um algoritmo que:

escreva os nomes dos alunos que tem 18 anos;
escreva a quantidade de alunos que tem idade acima 
de 20 anos.
*/

import java.util.Scanner;

public class Uni5Exe09 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("escreva o numero de alunos que deseja computar: ");
        int n = tec.nextInt(), idade, soma = 0;
        String somaNomes = "";

        for (int i = 1; i <= n; i++) {
            System.out.println("idade do aluno "+ i + ":");
            idade = tec.nextInt();
            System.out.println("nome do aluno " + i + ":");
            String nome = tec.next();

            if (idade == 18) {
                somaNomes = somaNomes  + nome + ";";
            } else if (idade > 20) {
                soma++;
            }
        
        
        
        }
        System.out.println(somaNomes);
        System.out.println("quantidade de alunos com idade acima de 20 = " + soma);
        tec.close();
    }
    
}
