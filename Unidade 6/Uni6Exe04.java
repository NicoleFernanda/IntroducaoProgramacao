/*
Faça um programa para ler os valores de dois vetores de inteiros, cada um contendo 10 elementos. 
Crie um terceiro vetor em que cada elemento é a soma dos valores contidos nas posições respectivas dos
vetores originais. Por exemplo, vetor1 = [1,2,3] vetor2 = [1,5,6] vetor3 = [2,7,9]. 
Exiba, ao final, os três vetores na tela. 
Faça três métodos: um método para ler valores dos vetores, outro para somar e outro para escrever os vetores.
*/
import java.util.Scanner;

public class Uni6Exe04 {

    public Uni6Exe04() {

        Scanner tec = new Scanner(System.in);
        
        int vetor1[] = new int[10];
        int vetor2[] = new int[10];
        int vetor3[] = new int[10]; //soma do vetor1 e vetor2

        System.out.println("insira os valores do vetor 1:");
        ler(vetor1, tec);
        
        System.out.println("insira os valores do vetor 2:");
        ler(vetor2, tec);

        soma(vetor1, vetor2, vetor3);
        escrever(vetor3);
        
        tec.close();

    }
    
    private void ler(int vetor[], Scanner tec) {
        
        
        for (int i = 0; i < vetor.length; i++) { 
            System.out.println("informe o elemento [" + (i + 1) + "] para o vetor [" + i + "] :");
            vetor[i] = tec.nextInt();
        }
    
        
    }
    
    private void soma(int vetor1[], int vetor2[], int vetor3[]){
        System.out.println("\nvalores do vetor 3:");
        for (int i = 0; i < vetor3.length; i++) { //vetor3
            vetor3[i] = vetor1[i] + vetor2[i];
        }
    }
    
    private void escrever(int vetor3[]){
        
        for (int j = 0; j < vetor3.length; j++) {
            System.out.println("[" + j + "] = " + vetor3[j]);
        }
    
    }
    
    public static void main(String[] args) {
        new Uni6Exe04();
        
        
    }
    
}
