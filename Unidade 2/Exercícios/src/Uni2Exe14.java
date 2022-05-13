//Leia um valor inteiro. A seguir, calcule o menor número de notas possíveis (cédulas) no qual o valor pode 
//ser decomposto. As notas consideradas são de 100, 50, 20, 10, 5, 2 e 1. A seguir mostre o valor lido e a 
//relação de notas necessárias.

import java.util.Scanner;
public class Exercício14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print( "Informe o valor: " );
        int numero = teclado.nextInt();
        
        // quantidade de notas 100
        int cem = (numero / 100);
        int restoCem = (numero % 100);

        int cinquenta = ( restoCem / 50);
        int restoCinquenta = (restoCem % 50);

        //quantidade de notas de 50
        int vinte = (restoCinquenta / 20);
        int restoVinte = (restoCinquenta % 20);

        //notas de vinte
        int dez = ( restoVinte / 10 );
        int restoDez = (restoVinte % 10);

        //notas de dez
        int cinco = ( restoDez / 5); 
        int restoCinco = ( restoDez % 5);
         
        //notas de dois
        int dois = (restoCinco / 2);
        int restoDois = (restoCinco % 2);

        //notas de um
        int um = restoDois;

        System.out.println( "Valor: " + numero );
        System.out.println( "Notas de 100 reais: " + cem );
        System.out.println( "Notas de 50 reais: " + cinquenta );
        System.out.println( "Notas de 20 reais: " + vinte );
        System.out.println( "Notas de 10 reais: " + dez );
        System.out.println( "Notas de 5 reais: " + cinco );
        System.out.println( "Notas de 2 reais: " + dois );
        System.out.println( "Notas de 1 real: " + um );


        teclado.close();
        



    }
    
}
