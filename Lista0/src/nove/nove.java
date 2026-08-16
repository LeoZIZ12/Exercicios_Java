package nove;
import java.util.Scanner;

public class nove {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int [] numeros = new int [6];
        for (int i = 0; i<6; i++){
            System.out.println("Digite um numero: ");
            int n = sc.nextInt();
            numeros[i] = n;
        }
        int soma_pares = 0;
        int soma_impares = 0;
        int [] pares = new int[6];
        int [] impares = new int[6];
        for (int i = 0; i<numeros.length; i++){
            if(numeros[i]%2==0) {
                pares[i] = numeros[i];
                soma_pares+=numeros[i];
            }else{
                impares[i] = numeros[i];
                soma_impares+=numeros[i];
            }
        }

        System.out.println("Numeros pares: ");
        for (int i = 0; i<pares.length; i++){
            if(pares[i]!=0) {
                System.out.println(pares[i]);
            }
        }
        System.out.println("Soma dos pares: "+ soma_pares);

        System.out.println("Numeros impares: ");
        for (int i=0; i<impares.length; i++){
            if (impares[i] != 0) {
                System.out.println(impares[i]);
            }
        }
        System.out.println("Soma dos impares: " + soma_impares);


    }
}
