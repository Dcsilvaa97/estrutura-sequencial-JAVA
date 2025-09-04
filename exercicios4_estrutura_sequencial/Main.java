package exercicios4_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		int funcionario, horas;
		double hrt, soma;
		funcionario = sc.nextInt();
		horas = sc.nextInt();
		hrt = sc.nextDouble();
		soma = hrt * horas;
		System.out.println("Numero do funcionario " + funcionario);
		System.out.printf("Salario do funcionario %.2f%n", soma);
		sc.close();
	}

}
