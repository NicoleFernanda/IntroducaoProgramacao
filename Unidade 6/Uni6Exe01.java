import java.util.Scanner;
/*
Descreva um algoritmo que leia 10 números inteiros e os coloque em um vetor de 10 posições do tipo inteiro. 
Escreva na ordem inversa em que foram lidos. Faça um método para ler e outro para escrever.
*/

public class Uni6Exe01 {

    private Uni6Exe01() {

        int vetor [] = new int[10]; 

        ler(vetor);
        escrever(vetor);

    }

    public void ler(int vetor[]) {
        Scanner tec = new Scanner(System.in);
        
        for (int i = 0; i < vetor.length; i++) { //ler
            System.out.println("informe o elemento [" + (i + 1) + "] para o vetor["+ i + "]:");
            vetor[i] = tec.nextInt();
        }

        tec.close();

    }

    public void escrever(int vetor[]) {
        System.out.println("\nordem inversa da qual foram lidos:");
        String ponto = ""; //ponto e virgula se nao for o ultimo e ponto final se for

        for (int j = (vetor.length - 1) ; j >= 0 ; j--) { //escrever
            ponto = (j == 0) ? "." : " , ";
            System.out.print(vetor[j] + ponto);
        }
    
    }

    public static void main(String[] args) {
        new Uni6Exe01();
        
    }

}