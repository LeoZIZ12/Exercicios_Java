package oito;

import java.util.Scanner;

public class oito {
    public void main(String[] args) {
        double[] preco = new double [10];
        int[] qtd_vendida = new int[10];

        Scanner sc = new Scanner(System.in);

        for ( int i = 0; i<10; i++ ) {
            System.out.println("Digite o preco do prduto "+ (i+1)+ ": ");
            preco[i] = sc.nextDouble();
            System.out.println("Digite a qtd vendida do produto : ");
            qtd_vendida[i] = sc.nextInt();
        }


        int total_vendas= 0;
        int maior = qtd_vendida[0];
        double preco_maior = preco[0];
        for ( int i = 0; i<10; i++ ) {
            double total_obj = 0;
            total_obj = qtd_vendida[i] * preco[i];
            System.out.println("Produto: "+(i+1) + ": " + qtd_vendida[i] + " vendidos");
            System.out.println("Preco unitario: " + ": " + preco[i] + " R$");
            System.out.println("Total vendido:  " + total_obj+ "R$");
            total_vendas += total_obj;
            if (qtd_vendida[i] > maior) {
                maior = qtd_vendida[i];
                preco_maior = preco[i];
            }

        }

        System.out.println("Total de vendas: " + total_vendas);
        double comissao = 0.05;
        System.out.println("Comissao: " + comissao*total_vendas + "R$");
        System.out.println("Produto mais vendido= quantidade: "+ maior + " preco: "+ preco_maior);

    }
}
