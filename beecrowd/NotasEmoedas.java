/*    NOTAS:
5 nota(s) de R$ 100.00
1 nota(s) de R$ 50.00
1 nota(s) de R$ 20.00
0 nota(s) de R$ 10.00
1 nota(s) de R$ 5.00
0 nota(s) de R$ 2.00
     MOEDAS:
1 moeda(s) de R$ 1.00
1 moeda(s) de R$ 0.50
0 moeda(s) de R$ 0.25
2 moeda(s) de R$ 0.10
0 moeda(s) de R$ 0.05
3 moeda(s) de R$ 0.01
*/

import java.util.Scanner;

public class NotasEmoedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valorEntrada = teclado.nextDouble();
        int valor = (int) valorEntrada;
        int valor1 = (int) ((int) valorEntrada % 1.0);
        
        int cem = (int) (valor / 100);
        valor %= 100;
        int cinquenta = (int) (valor / 50);
        valor %=50;
        int vinte = (int) (valor / 20);
        valor %=20;
        int dez = (int) (valor / 10);
        valor %= 10;
        int cinco = (int) (valor / 5);
        valor %= 5;
        int dois = (int) (valor / 2);
        valor %= 2;

    
        int moeda1 = (int) (valor / 1);
        
        

        
        int moeda2 = (int) (valor1 / 50);
        valor1 %= 0.50;
        int moeda3 = (int) (valor1 / 25);
        valor1 %= 0.25;
        int moeda4 = (int) (valor1 / 10);
        valor1 %= 0.10;
        int moeda5 = (int) (valor1 / 05);
        valor1 %= 0.05;


        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda2 + " moeda(s) de R$ 0.50");
        System.out.println(moeda3 + " moeda(s) de R$ 0.25");
        System.out.println(moeda4 + " moeda(s) de R$ 0.10");
        System.out.println(moeda5 + " moeda(s) de R$ 0.05");
        System.out.println(valor + " moeda(s) de R$ 0.01");

        
        teclado.close();

    }
    
}
