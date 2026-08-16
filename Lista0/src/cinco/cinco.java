package cinco;

import java.util.Scanner;

public class cinco {
    public void main(String[] args){
            int MAX = 1000;
            Scanner sc = new Scanner(System.in);

            String[][] dados = new String[MAX][3];
            int[] idades = new int[MAX];

            int total = 0;

            System.out.println("Digite os dados de cada habitante.");
            System.out.println("Para encerrar, digite -1 naa idade.\n");

            while (total < MAX) {
                System.out.println("Habitante " + (total + 1));

                System.out.print("Idade (-1 para encerrar): ");
                int idade = sc.nextInt();

                if (idade == -1) {
                    break;
                }

                System.out.print("Sexo (M/F): ");
                String sexo = sc.next();

                System.out.print("Cor dos olhos (azuis/verdes/castanhos): ");
                String corOlhos = sc.next();

                System.out.print("Cor dos cabelos (louros/castanhos/pretos): ");
                String corCabelo = sc.next();

                dados[total][0] = sexo;
                dados[total][1] = corOlhos;
                dados[total][2] = corCabelo;
                idades[total] = idade;

                total++;
            }

            sc.close();

            if (total == 0) {
                System.out.println("\nNenhum habitante foi cadastrado.");
                return;
            }

            int maiorIdade = idades[0];
            int menorIdade = idades[0];
            int contaFeminino = 0;

            for (int i = 0; i < total; i++) {
                if (idades[i] > maiorIdade) {
                    maiorIdade = idades[i];
                }
                if (idades[i] < menorIdade) {
                    menorIdade = idades[i];
                }

                String sexo = dados[i][0];
                String corOlhos = dados[i][1];
                String corCabelo = dados[i][2];

                boolean ehFeminino = sexo.equalsIgnoreCase("F");
                boolean faixaIdade = idades[i] >= 18 && idades[i] <= 35;
                boolean olhosVerdes = corOlhos.equalsIgnoreCase("verdes");
                boolean cabelosLouros = corCabelo.equalsIgnoreCase("louros");

                if (ehFeminino && faixaIdade && olhosVerdes && cabelosLouros) {
                    contaFeminino++;
                }
            }


            System.out.println("Maior idade encontrada: " + maiorIdade);
            System.out.println("Menor idade encontrada: " + menorIdade);
            System.out.println("Mulheres (18 a 35 anos, olhos verdes, cabelos louros): " + contaFeminino);
        }
}
