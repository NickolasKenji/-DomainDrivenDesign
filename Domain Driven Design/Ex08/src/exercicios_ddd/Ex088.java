package exercicios_ddd;

import java.util.Scanner;

public class Ex088 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo valor");
		b = ler.nextDouble();
		
		if (a > b)
			System.out.println("O primeir número é o maior");			
		else  
			System.out.println("O segundo número é o maior");
		
	}

}
