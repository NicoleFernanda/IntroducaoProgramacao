import java.util.Scanner;

public class Uni6Exe10 {

    private Scanner tec = new Scanner(System.in);

    public Uni6Exe10(){
        
        int elementos = 5; 
        
        int opcao;
    

        int vetor [] = new int[elementos];

        while (true) {
            System.out.println("escolha uma opcao, sabendo que:\n1 - incluir valor\n2 - pesquisa de valor");    
            System.out.println("3 - alterar valor\n4 - excluir valor\n5 - mostras valores");
            System.out.println("6 - ordenar valores\n7 - inverter valores\n8 - sair do sistema");
            opcao = tec.nextInt();

            if (opcao == 1) {

                if (incluir(vetor)) {
                    System.out.println("nao ha espaco disponivel nesse vetor");
                }
            
            } else if (opcao == 2) {
                
                if (pesquisar(vetor)) {
                    System.out.println("o valor existe no vetor");
                } else {
                    System.out.println("o valor NAO existe no vetor");
                }
                
                
            }else if (opcao == 3) {

                if (!alterar(vetor)) {
                    System.out.println("elemento nao encontrado");
                }

            }else if (opcao == 4) {
                
                if (excluir(vetor)) {
                    System.out.println("valor excluido");
                } else {
                    System.out.println("valor nao encontrado");
                }

            }else if (opcao == 5) {
                System.out.println("voce escolheu : " + "\""+"mostrar valores"+"\"");//linha 56
                mostrar(vetor);
            }else if (opcao == 6) {
                ordenar(vetor);
            }else if (opcao == 7) {
                inverter(vetor);
                mostrar(vetor);//perguntar se deve mostrar
            }else if (opcao == 8) {
                break;
            }

        }
    
        tec.close();
    }

    private boolean incluir(int vetor[]) {
        
        boolean vazio = true;//talvez trocar para espaco
        System.out.println("voce escolheu : " + "\""+"incluir valor"+"\"");
        
        for (int i = 0; i < vetor.length; i++) {
            
            if (vetor[i] == 0) {
                System.out.println("valor a ser incluído (diferente de zero): ");
                vetor[i] = tec.nextInt();
                return false;
            }
            
        }
        
        return vazio; 
    }

    private boolean pesquisar(int vetor[]) {
        
        System.out.println("voce escolheu : " + "\""+"pesquisa de valor"+"\"");
        System.out.println("escolha um valor para pesquisar no vetor: ");
        int valor = tec.nextInt();

        boolean noVetor = false;
        
        for (int i = 0; i < vetor.length; i++) {
            
            if (vetor[i] == valor) {
                return true;
            }
        
        }
    
        return noVetor;
    }

    private boolean alterar(int vetor[]) {
        System.out.println("voce escolheu : " + "\""+"alterar valor"+"\"");
        System.out.println("insira o elemento dentro do vetor o qual deseja trocar: ");
        int elemento = tec.nextInt();
        
        boolean encontrado = false;

        for (int i = 0; i < vetor.length; i++) {
            
            if (vetor[i] == elemento) {
                System.out.println("insira o valor pelo qual deseja substituir o [" + elemento + "]: ");
                vetor[i] = tec.nextInt();
                return true;
            }
            
        }
        return encontrado;
    }
    
    private boolean excluir(int vetor[]) {
        System.out.println("voce escolheu : " + "\""+"excluir valor"+"\"");
        System.out.println("insira o elemento dentro do vetor o qual deseja excluir: ");
        int elemento = tec.nextInt();
        boolean excluido = false;

        for (int i = 0; i < vetor.length; i++) {
            
            if (vetor[i] == elemento) {
                
                vetor[i] = 0;

                for (int j = i; j < vetor.length - 1; j++) {//puxar os outros valores
                    vetor[j] = vetor[j + 1];
                }
                
                vetor[vetor.length - 1] = 0;
                return true;
            }
        
        }
    
        return excluido;
    }
    
    private void mostrar(int vetor[]) {

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] != 0) {
                System.out.println(vetor[i]);
            }
        }
    }
    
    private void ordenar(int vetor[]) {
        System.out.println("voce escolheu : " + "\""+"ordenar valores"+"\"");

        int bolha = 0;
        
        for (int i = 0; (i < vetor.length - 1 );) {
            
            if (vetor[i] > vetor[i + 1]) {
                
                bolha = vetor[i];
                vetor[i] = vetor[i + 1];
                vetor[i + 1] = bolha;
                i = 0;

            } else{
                i = i + 1;
            }
        }

    }
    private void inverter(int vetor[]) {
        System.out.println("voce escolheu : " + "\""+"inverter valores"+"\"");

        int temp = 0; //variavel auxiliar

        for (int i = 0; i < vetor.length; i++) {
        
            if (vetor[i] != 0) {
                for (int x = 0; x < i; x++) {
                    
                    temp = vetor[i];
                    vetor[i] = vetor[x];
                    vetor[x] = temp;
                }   
            }
        
        }
    
    }
    


    public static void main(String[] args) {
        new Uni6Exe10();
    }
    
}
