/*Leia 2 valores com uma casa decimal (x e y), que devem representar as coordenadas de um ponto em um plano. 
A seguir, determine qual o quadrante ao qual pertence o ponto, ou se está sobre um dos eixos cartesianos ou na origem (x = y = 0). 


Se o ponto estiver na origem, escreva a mensagem “Origem”.
Se o ponto estiver sobre um dos eixos escreva “Eixo X” ou “Eixo Y”, conforme for a situação.

*/
import java.util.Scanner;
public class CoordenadasPonto {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        
        double x = teclado.nextDouble();
        double y = teclado.nextDouble();

        if ((x == 0) && (y == 0)) { //origem
            System.out.println("Origem");
        
        } else if (x > 0 && y > 0) { //primeiro quadrante
            System.out.println("Q1");
        
        }else if ( y > 0 && x < 0) { //segundo quadrante
            System.out.println("Q2");
        
        } else if (y < 0 && x < 0) { //terceiro quadrante
            System.out.println("Q3");
        
        } else if (y < 0 && x > 0) { //quarto quadrante
            System.out.println("Q4");
        
        } else if (y == 0 && x != 0) {
            System.out.println("Eixo X");

        } else if (x == 0 && y != 0) {
            System.out.println("Eixo Y");
        
        }


    
        teclado.close();
    }
    
}
