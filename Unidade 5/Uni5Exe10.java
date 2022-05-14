//SO IMPRIME 5, E AGORA?


import java.util.Scanner;

public class Uni5Exe10 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int milhar, restom, centena, restoc, dezena, restod, unidade;
        int par1, par2, soma, mult;
         
        
        int n = 1000;
        
        for (int i = 1; i <= 10; i++) {
            
            for (; n >= 1000 && n <= 9999; n++) { //checar o 9999 (se nao tiver limite, pesquisa 5 numeros)
                milhar = n / 1000;
                restom = n % 1000;

                centena = restom / 100;
                restoc = restom % 100;

                dezena = restoc / 10;
                restod = restoc % 10;

                unidade = restod;


                par1 = (milhar * 10) + centena;
                par2 = (dezena * 10) + unidade;
                soma = par1 + par2;
                mult = soma * soma;

                if (mult == n) {
                    System.out.println(n);
                } else {
                    continue;
                }
            
            
            }
        
            
        } 
        
        
        




        tec.close();
    }
    
}
