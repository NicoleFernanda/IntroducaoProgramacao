import java.util.Scanner;

/*
Os regulamentos de uma competição de pesca impõem um limite no peso total de pesca de um dia. 

Descreva um algoritmo que leia o limite diário (em quilogramas) e então leia o peso (em gramas) de cada 
peixe e escreva o peso total da pesca obtido até aquele ponto. Quando o limite diário for excedido 
escreva uma mensagem e encerre a execução do algoritmo. Para prosseguir com a entrada de dados de pesos 
de cada peixe o algoritmo deve apresentar a seguinte mensagem: 
“deseja informar o peso de mais um peixe: s (SIM) / n (NÃO)?”.
*/

public class Uni5Exe24 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int i = 1;
        double limite = 0, kg, somapeixes = 0;
        while (i >= 1) {
        
            if (i == 1) {
                System.out.println("limite diario (kg) : ");
                limite = tec.nextDouble();
            }
            
            System.out.println("peso do peixe (kg)   " + i + ":");
            kg = tec.nextDouble();
            somapeixes += kg;
            
            if (somapeixes > limite) {
                System.out.println("limite diario excedido");
                break;
            
            } else {
                System.out.println("deseja informar o peso de mais um peixe?    s(SIM / n(NAO))");
                char resp = tec.next().charAt(0);
                
                if (resp == 'n') {
                    System.out.println("deseja parar? s(SIM) / n(NAO)");
                    resp = tec.next().charAt(0);
                    if (resp == 's') {System.out.println("limite diario nao excedido");break;} else {i = 0;}
                
                }
            
            }

         i++;
        }
        

        tec.close();
    }
    
}
