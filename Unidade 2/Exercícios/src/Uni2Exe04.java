//Leia dois valores de ponto flutuante e calcule a média ponderada sabendo que a note A tem peso 3.5 e 
//nota B 7.5 (a soma dos pesos é 11), sendo que a nota vai de 0.0 a 10.0.

import java.util.Scanner;

public class Exercício4 {
    public static void main(String[] args) {
        try (Scanner teclado = new Scanner(System.in)) {
        System.out.print("Digite nota A: ");
        float notaa = teclado.nextFloat();
        System.out.print("Digite nota B: ");
        float notab = teclado.nextFloat();

        float mediaponderada = ((notaa*3.5f) + (notab*7.5f))/11f;
        
        System.out.println("sua média é: " + mediaponderada);
        teclado.close();
        }
    }
}

class CalculoNota
{
private float n1;
private float n2;

public float CalcularMedia(){
    return (n1 + n2) / 2;
}


}
