/*
Alunos: Alice, Evilyn, Glauber, Henry e João Eder
Data: 22/03/2023
Professor: Clayton Zambon
Trabalho de Algoritmos 2 - 3ª fase
Resolução do Trabalho - Atleta
*/

package trabalho;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        int quantidadeHomens = 0;
        float alturasMulheres = 0f, pesoAtletas = 0f, maiorAltura = 0f;
        String maisAlto = "";

        System.out.print("Qual a quantidade de atletas? ");
        int quantidadeAtletas = scan.nextInt();
        scan.nextLine();

        for (int i = 0; i < quantidadeAtletas; i++)
        {
            System.out.printf("Digite os dados do atleta numero %d:\n", i + 1);
            System.out.print("Nome: ");
            String nome = scan.nextLine();
            System.out.print("Sexo: ");
            char sexo = scan.next().toUpperCase().charAt(0);

            while (sexo != 'M' && sexo != 'F') {
                System.out.print("Valor inválido! Favor digitar M ou F: ");
                sexo = scan.next().toUpperCase().charAt(0);
            }

            System.out.print("Altura: ");
            float altura = scan.nextFloat();

            while (altura <= 0f){
                System.out.print("Valor inválido! Favor digitar um valor positivo: ");
                altura = scan.nextFloat();
            }

            System.out.print("Peso: ");
            float peso = scan.nextFloat();

            while (peso <= 0f){
                System.out.print("Valor inválido! Favor digitar um valor positivo: ");
                peso = scan.nextFloat();
            }
            scan.nextLine();

            if (sexo == 'M') {
                quantidadeHomens++;
            }
            else {
                alturasMulheres += altura;
            }

            if (i == 0 || altura > maiorAltura) {
                maiorAltura = altura;
                maisAlto = nome;
            }

            pesoAtletas += peso;
        }

        float mediaPeso = pesoAtletas / quantidadeAtletas;
        float porcentagemHomens = (float)(quantidadeHomens * 100) / quantidadeAtletas;
        float mediaAlturaMulher = alturasMulheres / (quantidadeAtletas - quantidadeHomens);

        System.out.println("RELATÓRIO:");
        System.out.printf("Peso médio dos atletas: %.2f\n", mediaPeso);
        System.out.print("Atleta mais alto: " + maisAlto);
        System.out.printf("\nPorcentagem de homens: %.1f%%\n", porcentagemHomens);
        System.out.printf("Altura média das mulheres: %.2f", mediaAlturaMulher);

        scan.close();
	}

}
