/*
* Alunos: Alice, Evilyn, Glauber, Henry e João Eder
* Data: 11/04/2023
* Professor: Clayton Zambon
* Trabalho de Algoritmos 2 - 3ª fase
* Resolução do Trabalho - De quem é a vez?
 */

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int quantidade = 0;
        int[] numeros = new int[2];
        int soma = 0;

        do {
            System.out.print("Digite a quantidade de amarelinhas: ");
            quantidade = scan.nextInt();
            scan.nextLine();
        } while (quantidade < 1 || quantidade > 100);

        String[] jogadoresVencedores = new String[quantidade];

        for (int i = 0; i < quantidade; i++) {

            soma = 0;
            String primeiraLinha = scan.nextLine();
            String segundaLinha = scan.nextLine();
            String[] primeiraLinhaSeparada = primeiraLinha.split(" ");
            String[] segundaLinhaSeparada = segundaLinha.split(" ");

            for (int j = 0; j < 2; j++) {
                numeros[j] = Integer.parseInt(segundaLinhaSeparada[j]);
                while (numeros[j] < 1) {
                    System.out.printf("%d° número inválido. Digite outro número:\n", j + 1);
                    numeros[j] = scan.nextInt();
                }
                soma += numeros[j];
            }

            if (primeiraLinhaSeparada[1].toUpperCase().equals("PAR")) {
                if (soma % 2 == 0)
                    jogadoresVencedores[i] = primeiraLinhaSeparada[0];
                else
                    jogadoresVencedores[i] = primeiraLinhaSeparada[2];
            }
            else {
                if (soma % 2 == 0)
                    jogadoresVencedores[i] = primeiraLinhaSeparada[2];
                else
                    jogadoresVencedores[i] = primeiraLinhaSeparada[0];
            }
        }

        System.out.println("\nJogadores Vencedores:");
        for (int i = 0; i < quantidade; i++)
            System.out.println(jogadoresVencedores[i]);

        scan.close();
    }
}