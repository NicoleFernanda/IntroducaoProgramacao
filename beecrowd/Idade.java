import java.util.Scanner;

public class Idade {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);

        int dias = teclado.nextInt();

        int years = dias / 365;
        int resto = dias % 365;

        int months = resto / 30;
        int resto2 = resto % 30;

        int days = resto2;

        System.out.println(years + " ano(s)");
        System.out.println(months + " mes(es)");
        System.out.println(days + " dia(s)");

        teclado.close();



    }
}
