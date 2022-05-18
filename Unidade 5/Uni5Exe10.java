import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        
        for (int i = 1; i <= 10000; i++) {
            
            for (int j = 0; j <= 10000; j++) { 
                String numero = i + "" + j;
                String compara = (i+j) * (i+j) + "";
                
                if (numero.equals(compara)) {
                    System.out.println(((i+j) * (j+i)) + " = (" + i  + " + " + j + ") ^2");
                }
            
            
            }
        
            
        } 
        
        
        




        tec.close();
    }
    
}