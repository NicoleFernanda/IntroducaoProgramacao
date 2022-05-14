import java.util.Scanner;

public class Uni5Exe11 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int auxiliar = 3,hora = 0;  
        double biscoito = 0, soma = 0;
        
        for (int i = 1; i <= 16; i++) {
            
            biscoito = Math.pow(auxiliar, hora);
            soma = soma + biscoito;
            hora += 1;

        }
        
        System.out.println("biscoitos quebrados no final de cada dia = " + soma);
        tec.close();
    }
}