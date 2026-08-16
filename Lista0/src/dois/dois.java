package dois;

import java.util.Scanner;

public class dois {
    public void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite 3 numeros");
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int[] vetor = {x, y, z};
        int tamanho = vetor.length;
        int maior = vetor[0];
        int menor = vetor[0];

        for(int i = 0; i<tamanho; i++){
            if(vetor[i]>maior){
                maior = vetor[i];
            }
            if(vetor[i]< menor){
                menor = vetor[i];
            }
        }
        boolean dentro = false;
        for( int j = y; j<=z; j++){
            if(j==x){
                dentro = true;
            }
        }

        System.out.println("Maior: "+ maior);
        System.out.println("Menor: "+ menor);
        System.out.println(x+" está dentro do intervalo "+ y+ " a " + z + ": "+dentro);

        if(x%y==0){
            System.out.println(x + " é divisivel por " + y);
        }
        if(x%z==0){
            System.out.println(x + " é divisivel por " + z);
        }
    }
}
