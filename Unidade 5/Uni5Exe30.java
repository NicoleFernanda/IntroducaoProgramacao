import java.util.Scanner;

public class Uni5Exe30 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        System.out.println("quantidade (inteira) de termos possiveis dentro da mochila: ");
        int mochila = tec.nextInt();

        System.out.println("valor do primeiro termo: ");
        float n = tec.nextFloat(), somadentro = 0, somafora = 0;

        System.out.println("escolha um decremento positivo K (se primeiro termo = 1 e K = 0,3; ent 0,7; 0,4...)");
        float k = tec.nextFloat();
        String termosmochila = "", foramochila = "";
        int termos = 1;
        int i = 1;
        
        while (i >= 1) {
            System.out.println("termo " + termos + " = " + n);
            
            
            if (termos <= mochila) {
                termosmochila = termosmochila + n + "/";
                somadentro = somadentro + n;
            } else {
                foramochila = foramochila + n + "/";
                somafora = somafora + n;
            }
            
            if (n == 0) {break;}
        
        n = n - k;
        termos++;
            
        } 
        System.out.println("\nentraram na mochila = " + termosmochila);
        System.out.println("elementos fora da mochila = " + foramochila);
        System.out.println("soma dos elementos que entraram na mochila = " + somadentro);
        System.out.println("soma dos elementos que nao entraram na mochila = " + somafora);

        tec.close();
    }
    
}
