/*
Chico tem 1,50 metro e cresce 2 centímetros por ano, enquanto Zé tem 1,10 metros e cresce 3 centímetros por ano.
Construa um algoritmo que calcule e imprima quantos anos serão necessários para que Zé seja maior que Chico.
*/
public class Uni5Exe21 {
    public static void main(String[] args) {
        
        double i = 1, chico = 150, ze = 110;

        while (i >= 1) {

            if (ze > chico) {
                System.out.println("vai levar " + i + " anos para que Ze seja mais alto que Chico");
                System.out.println("altura de chico em " + i + " anos = " + (chico / 100) +"m");
                System.out.println("altura de ze em " + i + " anos = " + (ze / 100) + "m");
                break;

            } else {
                i ++;
                chico += 2;
                ze += 3;
                continue;
            }
            
        }


    }
    
}
