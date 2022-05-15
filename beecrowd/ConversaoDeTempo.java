import java.util.Scanner;
public class ConversaoDeTempo {
    public static void main(String[] args) {
        
        Scanner teclado = new Scanner(System.in);
        int atividade = teclado.nextInt();
        int horas = atividade/3600;
        int minutosTotal = atividade/60;
        int minutos = (minutosTotal - ( horas *60));
        
        int segundos = atividade % 60;

        System.out.println(horas + ":" + minutos + ":" + segundos);
        teclado.close();


        
    }
    
}

