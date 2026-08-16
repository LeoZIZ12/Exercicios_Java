package dez;

import java.util.Scanner;

public class dez {
    public void main(String[] args){
        double [][] vendas = new double[12][4];
        Scanner sc = new Scanner(System.in);
        for (int i = 0; i<12; i++){
            System.out.println("Digite quanto foi vendido na semana 1 do mes "+(i+1));
            vendas[i][0]=sc.nextDouble();
            System.out.println("Digite quanto foi vendido na semana 2 do mes "+(i+1));
            vendas[i][1]=sc.nextDouble();
            System.out.println("Digite quanto foi vendido na semana 3 do mes "+(i+1));
            vendas[i][2]=sc.nextDouble();
            System.out.println("Digite quanto foi vendido na semana 4 do mes "+(i+1));
            vendas[i][3]=sc.nextDouble();
        }

        double[] vendas_mes= new double[12];
        for (int i=0; i<12; i++){
            int soma_semanas=0;
            for ( int j = 0; j<4; j++){
                soma_semanas+= vendas[i][j];
            }
            vendas_mes[i]=soma_semanas;
        }

        int total=0;
        for(int i=0; i<12;i++){
            System.out.println("no mes "+ (i+1)+ " vendeu "+ vendas_mes[i]+"R$");
            total+=vendas_mes[i];
        }

        int soma_semana1=0;
        int soma_semana2=0;
        int soma_semana3=0;
        int soma_semana4=0;
        for(int i=0; i<12;i++){
            soma_semana1+=vendas[i][0];
            soma_semana2+=vendas[i][1];
            soma_semana3+=vendas[i][2];
            soma_semana4+=vendas[i][3];
        }
        System.out.println("Total vendido na semana 1: "+soma_semana1);
        System.out.println("Total vendido na semana 2: "+soma_semana2);
        System.out.println("Total vendido na semana 3: "+soma_semana3);
        System.out.println("Total vendido na semana 4: "+soma_semana4);

        System.out.println("no ano vendeu "+ total+"R$");


    }
}
