public class Uni5Exe04 {
    public static void main(String[] args) {
    //divisor = soma 4, soma 6, soma 8, soma 10,tbc
    //2*2, 2*3, 2*4, 2*5
        double numerador, denominador, auxiliar,soma;
        numerador = 2;
        denominador = 3;
        auxiliar = 4;
        soma = 0;


        for (int i = 1; i <= 20; i++) {
            soma = soma + (numerador / denominador);
            
            numerador = numerador + 2;
            denominador = denominador + auxiliar;
            auxiliar = auxiliar + 2;

        }

        System.out.println("soma = " + soma);
    }
    
}
