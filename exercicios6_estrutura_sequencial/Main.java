package exercicios6_estrutura_sequencial;

import java.util.Locale;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		double a , b , c , triangulo , circulo , trapzio , quadrado , retangulo;
		a = sc.nextDouble();
		b = sc.nextDouble();
		c = sc.nextDouble();
		
		triangulo = (a * c) / 2;
		System.out.println("Triangulo: " + triangulo);
		
		circulo = 3.14159 * c * c;
		System.out.printf("Circulo %.3f%n" , circulo);
		
		trapzio = (a + b) / 2.0 * c;
		System.out.printf("Trapezio %.3f%n " , trapzio);
		
		quadrado = b * b;
		System.out.printf("Quadrado %.3f%n " , quadrado);
		
		retangulo = a * b;
		System.out.printf("Retangulo %.3f%n " , retangulo);
		sc.close();

	}

}
