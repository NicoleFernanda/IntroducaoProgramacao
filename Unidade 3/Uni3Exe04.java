import java.util.Scanner;

//Faça um programa para ler três notas de um aluno em uma disciplina e imprimira sua média ponderada 
//(as notas tem pesos respectivos de 5, 3 e 2).

public class Uni3Exe04 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Insira a nota A: ");
        float A = teclado.nextFloat();
        System.out.print("Insira a nota B: ");
        float B = teclado.nextFloat();
        System.out.print("Insira a nota C: ");
        float C = teclado.nextFloat();

        float media = ((((A*5) + (B*3) + (C*2)))/10);
        System.out.println("Sua média é: " + media);

        teclado.close();
    
    }
    
}
