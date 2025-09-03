package exercicios1_estrutura_sequencial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		//Faça um programa para ler dois valores
		//inteiros, e depois mostrar na tela 
		//a soma desses números.
		
		int x , y , soma;
		x = sc.nextInt();
		y = sc.nextInt();
		soma = x + y;
		System.out.println("Soma = " + soma);
		sc.close();

	}

}
