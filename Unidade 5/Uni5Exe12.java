import java.util.Scanner;

public class Uni5Exe12 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("escolha a quantidade de linhas: ");
        int n = tec.nextInt();
        int numero = 1;
        
        //int l = linhas; int c = numero
        for (int l = 1 ; l <= n ; l++) {
            for (int c = 1 ; c  <= l ; c++) {
                System.out.print(numero++);
                System.out.print(" ");
            }
            System.out.println("\n");
        }
        

        tec.close();
    }
}
    

