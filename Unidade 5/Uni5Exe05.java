import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        double a = 1;
        Scanner tec = new Scanner(System.in);
        int num = 8;
        int potencia = 4;
        
        System.out.println("quantos termos: ");
        int n = tec.nextInt();
       System.out.println();
        System.out.println(num);
        
        n = n - 1; //pq imprime o 8 fora
        for (int i = 1; i <= n ; i++) {
            
            if (i % 2 != 0) {
                num += + 2;
                System.out.println(num);
            } else {
                a = Math.pow(2, potencia);
                num = (int) a;
                potencia++;
                System.out.println(num);
            }

        
        }


        tec.close();
    }
    
}
