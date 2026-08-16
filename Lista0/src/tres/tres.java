package tres;

import java.util.Scanner;
public class tres {
    public void main(String[] arg){
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite a quantidade de alunos: ");
        int n = sc.nextInt();
        int[] PM = new int[n];
        int[] C = new int[n];
        for(int i = 0; i<n; i++){
            System.out.println("adicione uma matricula a Programacao modular: ");
            int mat = sc.nextInt();
            PM[i]=mat;
        }
        for(int i = 0; i<n; i++){
            System.out.println("adicione uma matricula a Calculo: ");
            int mat = sc.nextInt();
            C[i]=mat;
        }

        for(int i = 0; i <n; i++){
            for(int j = 0; j<n; j++){
                if(PM[i]==C[j]){
                    System.out.println("O aluno matricula: "+ PM[i]+ " está nas duas materias");
                }
            }
    }

    }
}
