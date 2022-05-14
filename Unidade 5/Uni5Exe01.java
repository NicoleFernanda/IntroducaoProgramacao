import java.util.Scanner;

public class Uni5Exe01 {
    public static void main(String[] args) {

        
        Scanner tec = new Scanner(System.in);
        for (int i = 1; i <= 20; i++) {
            System.out.println("Informe o numero ["+i+"]: ");
            int entrada = tec.nextInt();
            if (entrada % 2 == 0) {
                System.out.println("par");
            } else {
                System.out.println("impar");
            }
        }
    
        tec.close();
    }
}
    


    