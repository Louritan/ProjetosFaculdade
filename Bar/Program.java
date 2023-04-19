/*
 * Alunos: Alice, Evilyn, Glauber, Henry e João Eder
 * Data: 13/03/2023
 * Professor: Clayton Zambon
 * Trabalho de Algoritmos 2 - 3 fase
 * Resolução do Desafio - BAR
 */

package desafio;

import java.util.Locale;
import java.util.Scanner;

public class Program {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner scan = new Scanner(System.in);
		
		final double ingressoM = 10.0, ingressoF = 8.0,
				valorCerveja = 5.0, valorRefrigerante = 3.0,
				valorEspetinho = 7.0, valorCouvert = 4.0;
		
		int cervejas, refrigerantes, espetinhos;
		double consumo, totalPagar = 0.0;
		char sexo;
		
		System.out.print("Sexo: ");
		sexo = scan.nextLine().toUpperCase().charAt(0);
		
		System.out.print("Quantidade de cervejas: ");
		cervejas = scan.nextInt();
		System.out.print("Quantidade de refrigerantes: ");
		refrigerantes = scan.nextInt();
		System.out.print("Quantidade de espetinhos: ");
		espetinhos = scan.nextInt();
		
		consumo = (valorCerveja * cervejas) + (valorRefrigerante * refrigerantes) + (valorEspetinho * espetinhos);
		totalPagar += consumo;
		
		System.out.println("\nRELATÓRIO:");
		System.out.printf("Consumo = R$ %.2f\n", consumo);
		
		if(consumo > 30)
		{
			System.out.println("Isento de Couvert");
		}
		else
		{
			System.out.printf("Couvert = R$ %.2f\n", valorCouvert);
			totalPagar += valorCouvert;
		}
		
		if(sexo == 'M')
		{
			System.out.printf("Ingresso = R$ %.2f\n", ingressoM);
			totalPagar += ingressoM;
		}
		else
		{
			System.out.printf("Ingresso = R$ %.2f\n", ingressoF);
			totalPagar += ingressoF;
		}
		
		System.out.printf("Valor a pagar = R$ %.2f", totalPagar);
		
		scan.close();
	}

}
