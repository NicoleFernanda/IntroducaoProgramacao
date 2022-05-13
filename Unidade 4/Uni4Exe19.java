/*       || ou          && e          
Dadas as coordenadas (X e Y) de um Ponto, você deve informar em qual quadrante ele está localizado

0, se os dois valores forem zero
1, se os dois valores forem positivos
2, se x for positivo e y, negativo
3, se os dois valores forem negativos
4, se x for negativo e y, positivo
*/

import java.util.Scanner;
public class Uni4Exe19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entradas
        System.out.println("x = ");
        int x = teclado.nextInt();

        System.out.println("y = "); 
        int y = teclado.nextInt();

        //processamento e saidas
        if ((x == 0) && (y == 0)) {               //(0, 0)     0     se os dois valores forem zero         
            System.out.println("Quadrante 0");

        } else if (x > 0 && y > 0) {             //(1, 1)      1     se os dois valores forem positivos
            System.out.println("Quadrante 1");

        } else if ((x > 0) && (y < 0)) {        //(1, -1)      2     se x for positivo e y, negativo
            System.out.println("Quadrante 2");

        } else if ((x < 0) && (y < 0)) {       //(-2, -2)      3     se os dois valores forem negativos        
            System.out.println("Qudrante 3");
        
        } else if ((x < 0) && (y > 0)) {      // (-3, 3)       4     se x for negativo e y, positivo
            System.out.println("Quadrante 4");

        }

        teclado.close();

    }
}
