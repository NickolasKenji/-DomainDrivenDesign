package exercicios_ddd;

import java.util.Scanner;

public class Ex13 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);

		int a, b, c;

		System.out.println("Digite o primeiro valor");
		a = ler.nextInt();
		
		System.out.println("Digite o segundo valor");
		b = ler.nextInt();
		
		System.out.println("Digite o terceiro valor");
		c = ler.nextInt();
		
		if ((a > b) && (a > c))
			System.out.println("A é o maior");
		else if ((b > a) && (b > c))
			System.out.println("B é o maior");
		else
			System.out.println("C é o maior");
		
					
		/*
		
		if (a > b) {
			if (a > c) 
				System.out.println("A é o maior");
			else 
				System.out.println("C é o maior");
		}
		else {
			if (b > c)
				System.out.println("B é o maior");
			else
				System.out.println("C é o maior");
			}
			*/
		}
}