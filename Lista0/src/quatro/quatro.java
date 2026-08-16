package quatro;

import java.util.Scanner;

public class quatro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        System.out.println("Digite o tamanho do Vetor X: ");
        int[] X = new int[n];
        System.out.println("Digite um.um tamnaho para o Vetor y: ");
        int[] Y = new int[m];

        for (int i = 0; i < n; i++) {
            System.out.println("Digite um.um numero para o Vetor X: ");
            X[i] = sc.nextInt();
        }
        for (int i = 0; i < m; i++) {
            System.out.println("Digite um.um numero para o Vetor Y: ");
            Y[i] = sc.nextInt();
        }

        int[] xy = new int[n + m];
        int count = 0;


        for (int i = 0; i < n; i++) {
            xy[count++] = X[i];
        }

        for (int i = 0; i < m; i++) {
            boolean existe = false;
            for (int j = 0; j < count; j++) {
                if (xy[j] == Y[i]) {
                    existe = true;
                    break;
                }
            }
            if (!existe) {
                xy[count++] = Y[i];
            }
        }

        for (int i = 0; i < count; i++) {
            System.out.println(xy[i]);
        }
    }
}