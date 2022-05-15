/*Leia 3 valores inteiros e ordene-os em ordem crescente. No final, mostre os valores em ordem crescente, uma linha em branco e em seguida, os valores na sequência 
como foram lidos. */

import java.util.Scanner;
public class SortSimples {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int x = teclado.nextInt();
        int y = teclado.nextInt();
        int z = teclado.nextInt();
        
        
        
        if (x > y && x > z) { //x é o maior
            if (y > z) { //z menor
                System.out.println(z);
                System.out.println(y);
                System.out.println(x);
                System.out.println();
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            } else if (z > y) { //y menor
                System.out.println(y);
                System.out.println(z);
                System.out.println(x);
                System.out.println();
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);

            }
       
        } else if (y > x && y > z) { //y é maior
            if (x > z) { //z menor
                System.out.println(z);
                System.out.println(x);
                System.out.println(y);
                System.out.println();
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);

            } else if (z > x) { //x menor
                System.out.println(x);
                System.out.println(z);
                System.out.println(y);
                System.out.println();
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);

            }
        
        } else if (z > x && z > y) { //z maior 
            if (x > y) { //y menor
                System.out.println(y);
                System.out.println(x);
                System.out.println(z);
                System.out.println();
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            
            } else if (y > x) { //x menor
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
                System.out.println();
                System.out.println(x);
                System.out.println(y);
                System.out.println(z);
            }

        }
     
     
     
        teclado.close();
    }

}
