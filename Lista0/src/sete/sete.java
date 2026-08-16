package sete;

import java.util.Scanner;

public class sete {
    public static void main(String[] args) {

        int[] temperaturas = new int[12];

        Scanner sc = new Scanner(System.in);

        for ( int i = 0; i<12; i++){
            System.out.println("digite a temperatura do mes "+(i+1)+ ": ");
            temperaturas[i]=sc.nextInt();
        }
        int maior = temperaturas[0];
        int menor = temperaturas[0];
        int mes_maior = 0, mes_menor = 0;
        for (int i = 1; i<12; i++){
            if (temperaturas[i]>maior){
                maior = temperaturas[i];
                mes_maior = i+1;
            }
            if (temperaturas[i]<menor){
                menor = temperaturas[i];
                mes_menor = i+1;
            }
        }
        String maior_mes= "", menor_mes= "";
        for (int i = 1; i<12; i++){
            if (mes_maior==1){
                maior_mes =  "janeiro";
            } else if (mes_maior==2){
                maior_mes =  "fevereiro";
            }else if (mes_maior==3){
                maior_mes =  "marco";
            }else if (mes_maior==4){
                maior_mes =  "abril";
            }else if (mes_maior==5){
                maior_mes = "maio";
            }else if (mes_maior==6){
                maior_mes =  "junho";
            }else if (mes_maior==7){
                maior_mes =  "julho";
            }else if (mes_maior==8){
                maior_mes =  "agosto";
            }else if (mes_maior==9){
                maior_mes =  "setembro";
            }else if (mes_maior==10){
                maior_mes =  "outubro";
            }else if (mes_maior==11){
                maior_mes =  "novembro";
            }else if (mes_maior==12){
                maior_mes =  "dezembro";
            }

            if (mes_menor==1){
                menor_mes = "janeiro";
            }else if (mes_menor==2){
                menor_mes = "fevereiro";
            }else if (mes_menor==3){
                menor_mes = "marco";
            }else if (mes_menor==4){
                menor_mes = "abril";
            }else if (mes_menor==5){
                menor_mes = "maio";
            }else if (mes_menor==6){
                menor_mes =  "junho";
            }else if (mes_menor==7){
                menor_mes =  "julho";
            }else if (mes_menor==8){
                menor_mes =  "agosto";
            }else if (mes_menor==9){
                menor_mes =  "setembro";
            }else if (mes_menor==10){
                menor_mes =  "outubro";
            }else if (mes_menor==11){
                menor_mes =  "novembro";
            }else  if (mes_menor==12){
                menor_mes =  "dezembro";
            }
        }

        System.out.println(mes_menor+ "-"+ menor_mes+ ":"+ menor +"C");
        System.out.println(mes_maior+ "-"+ maior_mes+ ":"+ maior +"C");

    }
}
