import java.util.Scanner;

/*
Descreva um algoritmo que leia 12 valores reais e os coloque em um vetor de 12 posições do tipo real. 
Em seguida, modifique o vetor de modo que os valores das posições ímpares sejam aumentados em 5% e os das posições pares sejam aumentados em 2%.
Imprima o vetor resultante. 
Faça um método para ler os valores, outro para ajustar os valores dentro do vetor e outro para escrever os valores atualizados do vetor.
*/

public class Uni6Exe03 {
    
    public Uni6Exe03() { 

        float vetor[] = new float [12];
        ler(vetor);
        ajustar(vetor);
        imrpimir(vetor);
    }
    
    
    public void ler(float vetor[]) {
        Scanner tec = new Scanner(System.in);
        
        for (int i = 0; i < vetor.length; i++) { //ler valores
            System.out.println("informe o elemento [" + (i + 1) + "] para o vetor["+ i + "]:");
            vetor[i] = tec.nextFloat();
        }
        
        tec.close();
    }
    
    public void ajustar(float vetor[]){
        for (int j = 0; j < vetor.length; j++) { //ajustar os valores
            
            if (j % 2 != 0) {//posicoes impares
                vetor[j] = (vetor[j] * 0.05f) + vetor[j];
            } else {//posicoes pares
                vetor[j] = (vetor[j] * 0.02f) + vetor[j];
            }
            
        }
    }
    
    public void imrpimir(float vetor[]) {
        for (int z = 0; z < vetor.length; z++) { //imprimir
            System.out.println("[" +z + "]"+ " = " + vetor[z]);
        }

    }
   
    public static void main(String[] args) {
        new Uni6Exe03();
        
    }
    
}
