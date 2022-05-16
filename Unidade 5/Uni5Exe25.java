import java.util.Scanner;

/*
Em uma disputa de pingue-pongue os pontos são anotados como D, ponto para o jogador do lado direito, 
e E, ponto para o jogador do lado esquerdo da mesa. Descreva um algoritmo que leia o código do ponto 
de cada jogada e determine o vencedor. A partida encerra quando:

um dos jogadores chegar a 21 pontos e a diferença de pontos entre os jogadores for maior ou igual a dois;
o jogador com mais de 21 pontos conseguir uma diferença de dois pontos sobre o adversário, 
caso a primeira condição não seja atendida.
*/
public class Uni5Exe25 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);

        int i = 1, pontosD, pontosE, vencedorD;
        
        while (i >= 1) {
            
            System.out.println("pontos do lado direito: ");
            pontosD = tec.nextInt();
            System.out.println("pontos do lado esquerdo: ");
            pontosE = tec.nextInt();

            vencedorD = pontosD - pontosE;
            if (vencedorD >= 2) {
                System.out.println("vencedor = lado direito"); break;
            } else if (vencedorD <= -2) {
                System.out.println("vencedor = lado esquerdo"); break;
            }
            i++;
        }

        tec.close();
    }
    
}
