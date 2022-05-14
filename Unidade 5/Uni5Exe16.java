/*
Dado um determinado grupo de pessoas, descreva um algoritmo que a partir da altura
e do sexo (sexo = 'M' ou sexo = 'm' para masculino e sexo = 'F' e sexo = 'f' para
feminino) de cada pessoa informe a média da altura das mulheres e a média de altura
do grupo. A leitura deve ser finalizada ao digitar 0 para a altura.
*/
import java.util.Scanner;

public class Uni5Exe16 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double mediaM = 0,somaM = 0, mediaF = 0, somaF = 0, mediaG;
        int homens = 0,mulheres = 0;
        
        int i = 1;
        while (i >= 1) {
            System.out.println("altura: ");
            double altura = tec.nextDouble();
            if (altura == 0) {
                
                break;
            }
            
            System.out.println("sexo: ");
            char sexo = tec.next().charAt(0);
            sexo = Character.toLowerCase(sexo);

            if (sexo == 'm') {
                somaM += altura;
                homens++;
            } else if (sexo == 'f') {
                somaF += altura;
                mulheres++;
            }

            mediaM = somaM / homens;
            mediaF = somaF / mulheres;
            mediaG = ((somaM + somaF)/(homens + mulheres));

            System.out.println("media da altura das mulheres = " + mediaF);
            System.out.println("media da altura dos homens = " + mediaM);
            System.out.println("media da altura do grupo = " + mediaG);
            
        }

        tec.close();
    }
    
}
