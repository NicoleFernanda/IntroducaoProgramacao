import java.util.Scanner;

public class CedulasMoedas {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        double valor = teclado.nextDouble();
        
        double notas = (int) valor;
        double moedass = (( valor - notas) * 100);
        int moedas = (int) moedass;


        //notas + 1

        int cem = (int) (valor / 100);
        int resto100 = (int) valor % 100;

        int cinquenta = (int) (resto100 / 50);
        int resto50 = (int) resto100 % 50;

        int vinte = (int) (resto50 / 20);
        int resto20 = (int) resto50 % 20;

        int dez = (int) (resto20 / 10);
        int resto10 = (int) resto20 % 10;

        int cinco = (int) (resto10 / 5);
        int resto5 = (int) resto10 % 5;

        int dois = (int) (resto5 / 2);
        int resto2 = (int) resto5 % 2;

        int moeda1 = resto2 / 1; 

        
        //moedas - 1

        int moeda50 = (moedas / 50);
        resto50 = moedas % 50;

        int moeda25 = (int) (resto50 / 25);
        int resto25 = resto50 % 25; 

        int moeda10 = (int) (resto25 / 10);
        resto10 = resto25 % 10;

        int moeda05 = (int) (resto10 / 5);
        int resto05 = resto10 % 5;
        
        int moeda01 = (int) (resto05 / 1);

        System.out.println("NOTAS:");
        System.out.println(cem + " nota(s) de R$ 100.00");
        System.out.println(cinquenta + " nota(s) de R$ 50.00");
        System.out.println(vinte + " nota(s) de R$ 20.00");
        System.out.println(dez + " nota(s) de R$ 10.00");
        System.out.println(cinco + " nota(s) de R$ 5.00");
        System.out.println(dois + " nota(s) de R$ 2.00");
        
        System.out.println("MOEDAS:");
        System.out.println(moeda1 + " moeda(s) de R$ 1.00");
        System.out.println(moeda50 + " moeda(s) de R$ 0.50");
        System.out.println(moeda25 + " moeda(s) de R$ 0.25");
        System.out.println(moeda10 + " moeda(s) de R$ 0.10");
        System.out.println(moeda05 + " moeda(s) de R$ 0.05");
        System.out.println(moeda01 + " moeda(s) de R$ 0.01");

        
        teclado.close();

    
    
    
    
    
    }
    
}
