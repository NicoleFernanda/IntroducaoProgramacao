import java.util.Scanner;

public class Uni6Exe08 {
    Scanner tec = new Scanner(System.in);

    public Uni6Exe08(){
        
        int n = posicao();
        float vetor[] = new float[n];
        valores(vetor);//inserir elementos
        ordenar(vetor);
        iguais(vetor, n);

    }

    private int posicao(){
        
        int posicoes = 0;//so inicializar

        while (posicoes <= 0 || posicoes > 20) {
            
            System.out.println("\ninsira um valor para a quantidade de elementos dentro do vetor: ");
            posicoes = tec.nextInt();
           
        }
        
        return posicoes;    
        
    }

    private void valores(float vetor[]){
        
        for (int i = 0; i < vetor.length; i++) {
            System.out.println("valor elemento ["+ (1 + i)+"]");
            vetor[i] = tec.nextFloat();
        }
    }

    private void ordenar(float vetor[]) {
        
        float bolha = 0;

        for (int i = 0; (i < vetor.length - 1 );) {
            
            if (vetor[i] > vetor[i + 1]) {
                
                bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = 0;

            } else{
                i = i + 1;
            }
        }
    
    }

    private void iguais(float vetor[], int n){

        int frequencia = 1;

        System.out.println("\n valor\t    frequencia");
        
        for (int i = 1; i < vetor.length; i++) {
            
                
            if (vetor[i] == vetor[i - 1]) {
                frequencia++;
                
            } else {
                System.out.println("  " + vetor[i - 1] + "\t\t" + frequencia);
                frequencia = 1;
            }
                    
        }

        System.out.println("  " + vetor[vetor.length - 1] + "\t\t" + frequencia);
            
        
            
        }
        

    public static void main(String[] args) {
        new Uni6Exe08();
    }
}