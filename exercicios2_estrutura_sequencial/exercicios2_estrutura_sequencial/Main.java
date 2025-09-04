package exercicios2_estrutura_sequencial;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		//Faça um programa para ler o valor do raio de um círculo, 
		//e depois mostrar o valor da área deste
		Scanner sc = new Scanner(System.in);
		double rr, raio ,area ;
		rr = 3.141519;
		raio = sc.nextDouble();
		area = rr * raio * raio;
		System.out.printf("A = %.4f%n" , area);
		
		sc.close();

	}

}
