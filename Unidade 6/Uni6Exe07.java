/**
Faça um programa que leia um valor N inteiro limitado a 20 posições
Com base neste valor, crie um vetor do tipo inteiro. 
Em seguida, solicite ao usuário para digitar um número inteiro várias vezes, até preencher o vetor
*/
import java.util.Scanner;
public class Uni6Exe07 {
    
    private Scanner tec = new Scanner(System.in);
    
    public Uni6Exe07(){
        
        int n = posicao();
        int vetor[] = new int[n];
        preencher(vetor, n);
        ordenar(vetor);
        imprimir(vetor);


    }
    
    private int posicao(){
        
        int posicoes = 0;//so inicializar

        while (posicoes <= 0 || posicoes > 20) {
            System.out.println("\ninsira um valor para a quantidade de elementos dentro do vetor: ");
            posicoes = tec.nextInt();
           
        }
        
        return posicoes;    
        
    }

    private void preencher(int vetor[], int n){
    
        boolean repete = false;
        int auxiliar = 0;

        for (int i = 0; i < n; i++) {
            System.out.println("elemento ["+(1 + i)+"]");
            vetor[i] =  tec.nextInt();     
            
            auxiliar = i;
            
            for (int j = 0; j < auxiliar ; j++){
                if (vetor[i] == vetor[j]) {
                    repete = true;
                    break;
                } else {
                    repete = false;
                }

            }

            if (repete == true) {
                System.out.println("elemento ja adiconado, coloque outro numero:");
                i--;
            } else {//repete = false
               
            }
        
        }
        System.out.println("vetor origem = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[ " + vetor[i] + " ] ");
        }
    
    
    }

    private void ordenar(int vetor[]) {

        int bolha = 0;//auxiliar
        int i = 0;
        
        while (i < (vetor.length - 1)) {
            
            if (vetor[i] > vetor[i + 1]) {
                
                bolha = vetor[i];            //guarda o maior valor dentro da bolha
                vetor[i] = vetor[i + 1];     //coloca o menor valor na menor posicao
                vetor[i + 1] = bolha;        //coloca o maior valor dentro da maior posicao
                
                i = 0;

            } else{
                i = i + 1;
            }
        }

    }

    private void imprimir(int vetor[]){
        System.out.println("\nvetor ordenado = ");
        for (int i = 0; i < vetor.length; i++) {
            System.out.print("[ " + vetor[i] + " ] ");
        }
    }

    public static void main(String[] args) {
        new Uni6Exe07();
    }
    
}
