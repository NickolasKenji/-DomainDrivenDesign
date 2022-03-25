package exercicios_ddd;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro número: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo número: ");
		b = ler.nextDouble();
		
		if (a < b)
			System.out.println("A é o menor número ");
		else 
			System.out.println("B é o menor número ");
	}

}
