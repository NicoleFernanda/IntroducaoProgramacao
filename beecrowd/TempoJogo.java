import java.util.Scanner;
public class TempoJogo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int inicio = teclado.nextInt();
        int fim = teclado.nextInt();

        int tempo = 24 - inicio + fim;

        if (tempo > 24) {
            tempo -= 24;
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");

        } else {
            System.out.println("O JOGO DUROU " + tempo + " HORA(S)");
        }


        teclado.close();
    }
    
}
