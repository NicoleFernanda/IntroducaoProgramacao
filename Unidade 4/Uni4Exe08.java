//Dado uma letra, escreva um algoritmo que informe se ela é ou não uma vogal.
import java.util.Scanner;
public class Uni4Exe08 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        //entradas
        System.out.println("Informe a letra: ");
        char letra = tec.next().charAt(0);    //pega a primeira letra
        letra = Character.toUpperCase(letra);       //torna o caractere maiusculo

        //processamento e saida
        if (letra == 'A' || letra == 'E' || letra == 'I' || letra == 'O' || letra == 'U') {
            System.out.println("É vogal");
        } else { 
            System.out.println("Não é vogal");
        }



        tec.close();
    }
    
}
