import java.util.Scanner;

public class Uni6Exe09 {
    
    public Uni6Exe09(){
        
        int n = 30; //pessoas entrevistadas
        
        int sexo[] = new int[n];
        int nota[] = new int[n];
        int idade[] = new int[n];

        int somaNotas = pesquisa(sexo, nota, idade);
        imprimir(idade, nota, sexo, somaNotas, n);

    }

    private int pesquisa(int sexo[], int nota[], int idade[]) {

        Scanner tec = new Scanner(System.in);
        
        int soma = 0;

        for (int i = 0; i < idade.length; i++) {
            System.out.println("\ngenero do entrevistado ["+(i + 1) + "]     1 = fem   |   2 = masc");
            sexo[i] = tec.nextInt();

            while (sexo[i] != 1 && sexo[i] != 2) {
                System.out.println("genero invalido, insira novamente:");
                sexo[i] = tec.nextInt();
            }
        
            
            System.out.println("nota do entrevistado ["+(i + 1) + "]     (1 a 10)");
            nota[i] = tec.nextInt();

            while (nota[i] > 10 || nota[i] < 1) {
                System.out.println("nota invalida, insira novamente:");
                nota[i] = tec.nextInt();
            }
        
            System.out.println("idade do entrevistado [" + (i + 1) + "]");
            idade[i] = tec.nextInt();

          soma += nota[i]; 
            
        }
        
        tec.close();

        return soma;   
    
    }

    private void imprimir(int idade[], int nota[], int sexo[], int somaNotas, int n) {
        
        float media = (float) somaNotas/n;
        System.out.println("nota media do cinema = [" + (media) + "]");

        int homens = 0, notaHomens = 0, menor = 3200, mulheres = 0, notaMaisJovem = 0;

        for (int i = 0; i < sexo.length; i++) {
            
            if (sexo[i] == 2) {//se for homem
                homens++;
                notaHomens += nota[i];
            } else { // (sexo [i] == 1) --> mulheres
                
                if (idade[i] < menor) {//menor idade das mulheres
                    menor = idade[i];
                    notaMaisJovem = nota[i];
                }
                
                if (idade[i] > 50 || nota[i] > media) {//colocar else if?
                    mulheres++;
                }
            
            }
        
        }

        System.out.println("nota media dos homens = [" + ((float) notaHomens/homens) + "]");
        System.out.println("nota da mulher mais jovem = [" + (notaMaisJovem) + "]");
        System.out.println("quantidade de mulheres acima de 50 anos com a nota acima da media = [" + (mulheres) + "]");
    
    
    
    }
    
    public static void main(String[] args) {
        new Uni6Exe09();
    }  
}

        