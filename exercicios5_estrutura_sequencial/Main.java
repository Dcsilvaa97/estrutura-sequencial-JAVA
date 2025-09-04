package exercicios5_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Fazer um programa para ler o código de uma peça 1, o número de peças 1, 
		//o valor unitário de cada peça 1, 
		//o código de uma peça 2
		//o número de peças 2 
		//e o valor unitário de cada peça 2. 
		//Calcule e mostre o valor a ser pago
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int cod1 , qtd1 , cod2 , qtd2;
		double pca1 , pca2 , soma;
		cod1 = sc.nextInt();
		qtd1 = sc.nextInt();
		pca1 = sc.nextDouble();
		
		cod2 = sc.nextInt();
		qtd2 = sc.nextInt();
		pca2 = sc.nextDouble();
		soma = qtd1 * pca1 + qtd2 * pca2;
		System.out.printf("Valor a pagar R$ %.2f%n " , soma );
		
		sc.close();

	}

}
