import java.util.Scanner;

public class Uni5Exe05 {
    public static void main(String[] args) {
        double a = 1;
        Scanner tec = new Scanner(System.in);
        int num = 8;
        int potencia = 4;
        int n = tec.nextInt();
        System.out.print(num);
        n = n - 1;
        for (int i = 1; i <= n ; i++) {

            
            if (i % 2 != 0) {
                num += + 2;
                System.out.print(","+ num);
            } else {
                a = Math.pow(2, potencia);
                num = (int) a;
                potencia++;
                System.out.print(","+ num);
            }
                
        
        }


        tec.close();
    }
    
}
