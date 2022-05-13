/*       || ou          && e          
Dadas 3 notas obtidas por um aluno em 3 provas e a média dos exercícios, descreva um algoritmo que calcule a média de 
aproveitamento e o conceito do aluno, usando a fórmula:

media=(notaProva1 + notaProva2*2 + notaProva3*3 + notaExercicios ) / 7

O algoritmo deve escrever a média de aproveitamento, o conceito correspondente e a mensagem "aprovado" caso o conceito
seja A, B ou C, e "reprovado" caso o conceito seja D ou E.


*/
import java.util.Scanner;
public class Uni4Exe20 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        //entradas
        System.out.println("Nota da Prova1: ");
        float prova1 = tec.nextInt();

        System.out.println("Nota da Prova2: ");
        float prova2 = tec.nextInt();

        System.out.println("Nota da Prova3: ");
        float prova3 = tec.nextInt();

        System.out.println("Nota dos Exercícios: ");
        float exercicios = tec.nextInt();
        
        //processamento
        float media = ((prova1) + (prova2 * 2) + (prova3 * 3) + exercicios)/7;

        
        if (prova1 > 10 || prova2 > 10 || prova3 > 10 || exercicios > 10) {
            System.out.println("Nota(s) inválida(s)");
        
        } else if (media >= 9 && media <= 10) { //conceito A
            System.out.println("Média: " + media);
            System.out.println("Conceito A" + "\nAprovado");

        } else if (media < 9 && media >= 7.5) { //conceito B
            System.out.println("Média: " + media);
            System.out.println("Conceito B" + "\nAprovado");

        } else if (media >= 6 && media < 7.5) { //conceito C
            System.out.println("Média: " + media);
            System.out.println("Conceito C" + "\nAprovado");

        } else if (media >= 4 && media < 6) { //conceito D
            System.out.println("Média: " + media);
            System.out.println("Conceito D" + "\nReprovado");

        } else if (media < 4) { //conceito E
            System.out.println("Média: " + media);
            System.out.println("Conceito E" + "\nReprovado");

        } 
        

        
        tec.close();
    }
    
}
