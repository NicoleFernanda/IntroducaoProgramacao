//            || ou          && e
/*Dados 3 valores lado1, lado2, lado3,
 que representam os comprimentos dos lados de um triângulo, descreva um algoritmo 
que verifique se os mesmos podem ser os comprimentos dos lados de um triângulo. 
Em caso afirmativo, verifique e informe se é 
"triângulo equilátero", 
"triângulo isósceles" ou 
"triângulo escaleno". Em caso negativo, informe que os mesmos não 
formam um triângulo. Considere que:

o comprimento de cada lado de um triângulo é menor que a soma dos comprimentos dos outros lados

um triângulo equilátero tem três lados iguais
um triângulo isóscele tem dois lados iguais e um diferente
um triângulo escaleno tem três lados diferentes*/

import java.util.Scanner;
public class Uni4Exe12 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        //entradas
        System.out.println("Informe o lado 1: ");
        float lado1 = tec.nextFloat();
        System.out.println("Informe o lado 2: ");
        float lado2 = tec.nextFloat();
        System.out.println("Informe o lado 3: ");
        float lado3 = tec.nextFloat();

        if ((lado1 < lado2 + lado3) && (lado2 < lado1 + lado3) && (lado3 < lado1 + lado2)) { //é triangulo
		
            if (lado1 == lado2 && lado2 == lado3) {
                System.out.println("Triangulo equilátero!");
            
            } else if (lado1 == lado2 || lado2 == lado3 || lado1 == lado3) {
                System.out.println("Triangulo isóceles!");	
            
            } else if (lado1 != lado2 && lado2 != lado3 && lado3 != lado1) {
                System.out.println("Triangulo escaleno!");
            
            }
    
        } else {
        System.out.println("Tais lados não formam um triângulo.");
        
        }
            
    
        tec.close();
    }
}
