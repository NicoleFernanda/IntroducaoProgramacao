/* Dado um caractere indicando uma opção, escreva um algoritmo para:

se opção = ‘T’: calcular a área de um triângulo de base b e altura h
se opção = ‘Q’: calcular a área de um quadrado de lado l
se opção = ‘R’: calcular a área de um retângulo de base b e altura h
se opção = ‘C’: calcular a área de um círculo de raio r*/

import java.util.Scanner;
public class Uni4Exe26 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        //entradas
        System.out.println("Escolha uma opção");
        System.out.println("T: calcular a área de um triângulo de base b e altura h");
        System.out.println("Q: calcular a área de um quadrado de lado l");
        System.out.println("R: calcular a área de um retângulo de base b e altura h");
        System.out.println("C: calcular a área de um círculo de raio r");

        char letra = teclado.next().charAt(0);
        letra = Character.toUpperCase(letra); //torna a carcatere maiusculo

        float base,altura,lado,raio,area; 

        //processamento e saidas
        switch (letra) {
            case 'T': //calcular a área de um triângulo de base b e altura h
                System.out.println("Base do triângulo e altura, respectivamente:");
                base = teclado.nextFloat();
                altura = teclado.nextFloat();
                area = (base * altura) / 2;

                System.out.println("A área do trângulo é: " + area);

                break;
            
            case 'Q': //calcular a área de um quadrado de lado l
                System.out.println("Lado do quadrado:");
                lado = teclado.nextFloat();
                area = lado * lado;
                System.out.println("A área do quadrado é: " + area);

                break;
            
            case 'R': //calcular a área de um retângulo de base b e altura h
                System.out.println("Base do retângulo e altura, respectivamente:");
                base = teclado.nextFloat();
                altura = teclado.nextFloat();
                area = base * altura;
                System.out.println("A área do retângulo é: " + area);

                break;
            
            case 'C': //calcular a área de um círculo de raio r
                System.out.println("Raio do círculo: ");
                raio = teclado.nextFloat();
                area = ((raio * raio)* 3.14159f);
                System.out.println("A área do círculo é: " + area);

                break;
            default:
            
            break;
        }





        teclado.close();
    }
    
}
