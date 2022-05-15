import java.util.Scanner;
public class Cedulas {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        
        int numero = teclado.nextInt();
        
        int cem = (numero / 100);
        int restoCem = (numero % 100);

        int cinquenta = ( restoCem / 50);
        int restoCinquenta = (restoCem % 50);

        int vinte = (restoCinquenta / 20);
        int restoVinte = (restoCinquenta % 20);

        int dez = ( restoVinte / 10 );
        int restoDez = (restoVinte % 10);

        int cinco = ( restoDez / 5); 
        int restoCinco = ( restoDez % 5);
         
        int dois = (restoCinco / 2);
        int restoDois = (restoCinco % 2);

        int um = restoDois;

        System.out.println(numero);
        System.out.println(cem + " nota(s) de R$ 100,00");
        System.out.println(cinquenta + " nota(s) de R$ 50,00");
        System.out.println(vinte + " nota(s) de R$ 20,00");
        System.out.println(dez + " nota(s) de R$ 10,00");
        System.out.println(cinco + " nota(s) de R$ 5,00");
        System.out.println(dois + " nota(s) de R$ 2,00");
        System.out.println(um + " nota(s) de R$ 1,00");


        teclado.close();
        


        
    }
    
}
