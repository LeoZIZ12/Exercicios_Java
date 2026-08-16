package seis;

import java.util.Scanner;

public class seis {
    public void main(String[] args){
        int qtd_aluno= 2;
        String [] [] provas = new String [8] [qtd_aluno];
        int [] alunos = new int [qtd_aluno];
        String[] gabarito = {"A","B","D","D","C","E","A","A"};

        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <qtd_aluno; i++){
            System.out.println("Digite o numero do aluno: ");
            alunos[i] = sc.nextInt();
            for (int j = 0; j < 8; j++){
                System.out.print("Digite a resposta do aluno (Q "+ (j+1) + "):");
                provas[j][i] = sc.next();
            }
        }

        int contador_aprovacoes= 0;
        int contador;
        for (int i = 0; i < qtd_aluno; i++){
            contador = 0;
            for (int j = 0; j < 8; j++) {
                if (provas[j][i].equalsIgnoreCase(gabarito[j])) {
                    contador++;
                }
            }
            if(contador>=6){
                contador_aprovacoes++;
            }
            System.out.println("O aluno numero "+alunos[i]+" acertou "+contador+" questoes");
        }
        System.out.println(contador_aprovacoes);
        double aprovacoes = (double) contador_aprovacoes / qtd_aluno;
        double percent_aprovacoes = aprovacoes *100;
        System.out.println("A porcentagem de aprovacao foi de: "+ percent_aprovacoes);
    }
}
