import java.util.Scanner;

/*
Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
Imprima quais valores desses informados são maiores que a média dos valores. 
Faça um método para ler os valores, outro para calcular a média e outro para informar os valores maiores que a média.
*/

public class Uni6Exe02 {
    
    public Uni6Exe02() {
        
        float vetor[] = new float [12];
        
        float somatorio = determinar(vetor);
        float media = calcMedia(vetor, somatorio);
        acima(vetor, media);

    }
    
    public float determinar(float vetor[]) {
        Scanner tec = new Scanner(System.in); 
        float soma = 0;

        for (int i = 0; i < vetor.length; i++) { 
            System.out.println("informe o elemento [" + (i + 1) + "] para o vetor [" + i + "] :");
            vetor[i] = tec.nextFloat();
            soma = soma + vetor[i];
        }
        
        tec.close();
        return soma;

    }

    public float calcMedia(float vetor[],float somatorio) {
        float media = somatorio / vetor.length;
        System.out.println("media = " + media);
        return media;

    }

    public void acima(float vetor[], float media) {

        System.out.println("\nnumeros acima da media : ");

        for (int j = 0; j < vetor.length; j++){ //parecido com o primeiro for
                
            if (vetor[j] > media) {//quais valores estao acima da media
                
                System.out.println("["+ (j+ 1) +"] \t" + vetor[j]);
            }
            
        }

    }
    
    
    public static void main(String[] args) {    
        new Uni6Exe02();
    
    }
    
}
