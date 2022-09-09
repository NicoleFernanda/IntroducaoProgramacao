/**
Faça um programa que leia um valor N inteiro. Com base neste valor, crie um vetor do tipo real. 
Em seguida, solicite ao usuário informar essa quantidade N de valores reais para popular o vetor. 
Após ter preenchido o vetor, solicite que o usuário informe um outro valor real. 
Informe para o usuário se este valor informado se encontra cadastrado no vetor. 
Faça um método para ler o vetor e outro, que retorne verdadeiro ou falso, para encontrar o valor.
*/

import java.util.Scanner;
public class Uni6Exe06 {
    
    public Uni6Exe06() { 
        Scanner t = new Scanner(System.in);

        System.out.println("informe o tamanho do vetor: ");
        final int tamanho = t.nextInt();//final ==> nunca mais vai perder esse valor; uma constante
        double vetor[] = new double[tamanho];

        ler(vetor, t);
        
        //boolean retorno = pesquisar(vetor, t); - posso jogar direto pra dentro do if (se for usar mais de uma vez, melhor jogar dentro de uma variavel)
        if (pesquisar(vetor, t)) {
            System.out.println("o valor informado encontra-se cadastrado no vetor");
        } else {
            System.out.println("o valor informado NAO se encontra cadastrado no vetor");
        }

        t.close();
    }
    
    private void ler(double vetor[], Scanner t){
        for (int i = 0; i < vetor.length; i++) {//vetor.length = tamanho
            System.out.println("elemento [" + (1 +i)+"]");
            vetor[i] = t.nextDouble();
        }
    
    }
    

    private boolean pesquisar(double vetor[], Scanner t) {
        System.out.println("informe um valor para a pesquisa: ");
        double valor = t.nextDouble();

        for (int i = 0; i < vetor.length; i++) {
            if (vetor[i] == valor) {
                return true;//nao vai ate o final, encerra aqui
            }

        }
        
        return false;//por isso tem return false, pois se chegar ate aqui, significa que nao entrou na condicao if
    }
    public static void main(String[] args) {
        new Uni6Exe06();
    }
    
}
