//Leia um valor inteiro, que é o tempo de duração em segundos de um determinado evento em uma fábrica, e 
//informe-o expresso no formato horas:minutos:segundos.
import java.util.Scanner;

public class Exercício10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Coloque um número em segundos: ");
        int atividade = teclado.nextInt();
        int horas = atividade/3600;
        int minutosTotal = atividade/60;
        int minutos = (minutosTotal - ( horas *60));
        
        int segundos = atividade % 60;

        System.out.print(horas + ":" + minutos + ":" + segundos);
        teclado.close();


        
    }
    
}
