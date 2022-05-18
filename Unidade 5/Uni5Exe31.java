import java.util.Scanner;

public class Uni5Exe31 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("digite um numero inteiro positivo: ");
        int numero = tec.nextInt();
        System.out.println();
        
        int i = 1;
        int fator = 2;
        while (numero > 0 && i >= 0) {
            if (i == 1) {System.out.println("numero       decomposicao");}
            
            if (numero == 1) {System.out.println("1"); break;}

            if (numero % fator == 0) {
                System.out.println(numero + "\t\t" + fator);
                numero = numero / fator;
            } else {fator++;}
            
        i++;
    
        }


        tec.close();
    }
    
}
