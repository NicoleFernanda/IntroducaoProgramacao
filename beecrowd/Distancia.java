import java.util.Scanner;

public class Distancia {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int y = teclado.nextInt();
        int resultado = y * 2;
        System.out.println(resultado + " minutos");
        teclado.close();
    }
}
