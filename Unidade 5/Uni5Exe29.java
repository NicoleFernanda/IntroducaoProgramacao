import java.util.Scanner;

public class Uni5Exe29 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int i = 1, valor;
        while (i == 1) {
            System.out.println("valor: ");
            valor = tec.nextInt();
            
            int vinte, dez, cinco, dois, um, resto;
            vinte = valor / 20;
            resto = valor % 20;

            dez = resto / 10;
            resto = resto % 10;

            cinco = resto / 5;
            resto = resto % 5;

            dois = resto / 2;
            resto = resto % 2;

            um = resto;

            System.out.println(vinte + " nota(s) de R$: 20,00"); System.out.println(dez + " nota(s) de R$: 10,00"); System.out.println(cinco + " nota(s) de R&: 5,00"); 
            System.out.println( dois + " nota(s) de R$: 2,00");System.out.println( um + " nota(s) de R$: 1,00");

            System.out.println("entrar com outro valor? 1(SIM)/2(NAO)");
            i = tec.nextInt();
            if (i == 1) {continue;} 
            

            
        }
        
        
        tec.close();
    }
    
}
