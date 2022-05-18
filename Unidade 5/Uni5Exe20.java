import java.util.Scanner;

/*
Um determinado material radioativo perde metade de sua massa a cada 50 segundos. 
Dada a sua massa inicial em Kg, descreva um algoritmo que determine o tempo necessário para que essa 
massa se torne menor que 0,5 gramas. Escreva a massa inicial, a massa final e o tempo.
*/ 

public class Uni5Exe20 {
    public static void main(String[] args) {

        Scanner tec = new Scanner(System.in);

        System.out.println("sua massa inicial (em kg): ");
        double kg = tec.nextDouble();
        int i = 0;
        double gramas = kg * 1000;

        while (i >= 0) {
            
            if (gramas < 0.5) {
                System.out.println("massa inicial = " + kg + "kg");
                System.out.println("massa final = " + gramas + " gramas");
                System.out.println("tempo = " + i + " segundos");
                break;

            } else {
                gramas *= 0.5; //metade
                i += 50;
                continue;
            }
            
        }


        tec.close();
        
    }
    
}
