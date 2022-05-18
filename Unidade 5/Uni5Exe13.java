import java.util.Scanner;

public class Uni5Exe13 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("quantas paradas foram feitas: ");
        int n = tec.nextInt();
        double km, litros, total_litros = 0, total_km = 0;
        //tem que dizer antes quantas paradas?
        for (int i = 1; i <= n ; i++) {
            
            System.out.println("\nquilometros percorridos = ");
            km = tec.nextDouble();
            System.out.println("litros abstecidos = ");
            litros = tec.nextDouble();
            
            total_km = total_km + km;
            total_litros += litros;
            System.out.println("neste trecho foram percorridos " + km + "km com " + litros + " litros de combustivel");
        
        
        }
        double media = total_km / total_litros;
        System.out.println("\nquilometragem media obtida por toda a viagem = " + media + "km/l");
    
        tec.close();
    }
    
}
