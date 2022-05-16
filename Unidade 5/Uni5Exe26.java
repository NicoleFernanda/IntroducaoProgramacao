/*
Faça um programa que leia inicialmente o valor do pedágio ao qual Astolfo se nega a pagar

*/
import java.util.Scanner;

public class Uni5Exe26 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int i = 1, acima = 0, trechos = 0, aceita150 = 0;
        double max = 0, valor, distancia; 
        while (i >= 1) {
            
            if (i == 1) {
               System.out.println("valor maximo de pedagio: ");
                max = tec.nextDouble();
            }
            
            System.out.println("valor pedagio ["+i+"]: ");
            valor = tec.nextDouble();
            trechos++;
            
            if (valor == -1) {
                trechos--;
                System.out.println(acima + " (trechos com valor acima do qual ele nega-se a pagar);"); 
                System.out.println(trechos + " (quantidade de trechos informados);"); 
                System.out.println(aceita150 + " (trechos acima de 150km com valor aceito por ele).");
                break;
            }

            System.out.println("distancia ["+i+"]");
            distancia = tec.nextDouble();
            
            if (valor > max) {
                acima++;
            } else if (distancia > 150 && valor < max) {
                aceita150++;
            }
            
            
            i++;
        
        }


        tec.close();
    }
    
}
