/*
Alunos: Alice, Evilyn, Glauber, Henry e João Eder
Data: 27/03/2023
Professor: Clayton Zambon
Trabalho de Algoritmos 2 - 3ª fase
Resolução do Trabalho - Concurso
*/

package trabalho;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
        Scanner scan = new Scanner(System.in);

        System.out.print("Qual a quantidade de pessoas? ");
        int quantidadePessoas = scan.nextInt();
        scan.nextLine();
        
        String[] nomes = new String[quantidadePessoas];
        String nomesAprovados = "";
        String nomeMaiorMedia = "";
        float[][] notas = new float[quantidadePessoas][2];
        float[] medias = new float[quantidadePessoas];
        float notaMediaAprovados = 0f;
        int notasAprovados = 0;
        float maiorMedia = 0f;
        int aprovados = 0;

        for(int i = 0; i < quantidadePessoas; i++) {
        	System.out.printf("Digite os dados da %da pessoa:\n", i + 1);
        	System.out.print("Nome: ");
        	nomes[i] = scan.nextLine();
        	System.out.print("Nota etapa 1: ");
        	notas[i][0] = scan.nextFloat();
        	System.out.print("Nota etapa 2: ");
        	notas[i][1] = scan.nextFloat();
        	scan.nextLine();
        	
        	medias[i] = (notas[i][0] + notas[i][1]) / 2;
        	
        	if(i == 0 || medias[i] > maiorMedia) {
        		nomeMaiorMedia = nomes[i];
        		maiorMedia = medias[i];
        	}
        	
        	if(medias[i] >= 70.0) {
        		notaMediaAprovados += notas[i][0] + notas[i][1];
        		notasAprovados+= 2;
        		nomesAprovados += nomes[i] + "\n";
        		aprovados++;
        	}
        }
        
        float porcentagemAprovados = (float)(aprovados * 100) / quantidadePessoas;
        notaMediaAprovados /= notasAprovados;
        
        System.out.println("\nTABELA:");
        for(int i = 0; i < quantidadePessoas; i++)
        	System.out.printf("%s, %.1f, %.1f, MEDIA = %.2f\n", nomes[i], notas[i][0], notas[i][1], medias[i]);
        System.out.println("\nPESSOAS APROVADAS:");
        System.out.print(nomesAprovados);
        System.out.printf("\nPorcentagem de aprovação: %.1f%%\n", porcentagemAprovados);
        System.out.printf("Maior média: %s\n", nomeMaiorMedia);
        System.out.printf("Nota média dos aprovados: %.2f", notaMediaAprovados);
        scan.close();
	}

}
