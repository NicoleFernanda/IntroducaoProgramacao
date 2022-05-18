public class Uni5Exe04 {
    public static void main(String[] args) {
        double numerador = 2, denominador = 3, apoio = 4,soma = 0;

        for (int i = 1; i <= 20; i++) {
            soma = soma + (numerador / denominador);
            
            numerador = numerador + 2;
            denominador = denominador + apoio;
            apoio = apoio + 2; //apoio += 2

        }

        System.out.println("soma = " + soma);
    }
    
}
