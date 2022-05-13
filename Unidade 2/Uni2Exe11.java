//Escreva um programa que leia três valores com ponto flutuante de dupla precisão: A, B e C. Em seguida, 
//calcule e mostre:
//a) a área do triângulo retângulo que tem A por base e C por altura.                 b*h/2
//b) a área do círculo de raio C. (pi = 3.14159).                  r*r*3,14
//c) a área do trapézio que tem A e B por bases e C por altura.               [(B+b)*h]/2
//d) a área do quadrado que tem lado B.
//e) a área do retângulo que tem lados A e B.

import java.util.Scanner;

public class Exercício11 {
    public static void main(String[] args) {
        Scanner variavel = new Scanner(System.in);
        System.out.print(" Valor de A: ");
        double A = variavel.nextDouble();
        System.out.print(" Valor de B: ");
        double B = variavel.nextDouble();
        System.out.print(" Valor de C: ");
        double C = variavel.nextDouble();
        //area triangulo
        double AT = (A * C)/2;
        System.out.println("A área do triângulo com A de base e C de altura é: " + AT);
        //area circulo
        double AC = (C*C)*(3.14159);
        System.out.println("A área do círculo com C de raio é: " + AC);
        //area trapezio
        double ATR = ((A + B)*C)/2;
        System.out.println("A área do trapézio com A e B de bases e C de altura é: " + ATR);
        //area quadrado
        double AQ = B*B;
        System.out.println("A área do quadrado com lado B é: " + AQ);
        //area retangulo
        double AR = A*B;
        System.out.println("A área do retângulo com lados A e B é: " + AR);
        






        variavel.close();




    }


    
    
}
