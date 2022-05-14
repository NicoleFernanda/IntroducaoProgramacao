public class Uni5Exe02 {
    public static void main(String[] args) {

        int somaImpar = 0, somaPar = 0;

        for (int i = 1; i >= 1 && i <= 100; i++) {
            
            if (i % 2 == 0) { //par
                somaPar = somaPar + i; //ou somaPar += i;
            
            } else {
                somaImpar = somaImpar + i;
            
            }
        
        
        }
    System.out.println("soma dos numeros pares = " + somaPar);
    System.out.println("soma dos numeros impares = " + somaImpar);
    }
    
}
