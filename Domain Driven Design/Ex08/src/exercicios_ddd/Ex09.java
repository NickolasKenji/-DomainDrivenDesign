package exercicios_ddd;

import java.util.Scanner;

public class Ex09 {

	public static void main(String[] args) {
		Scanner ler = new Scanner (System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro n�mero: ");
		a = ler.nextDouble();
		
		System.out.println("Digite o segundo n�mero: ");
		b = ler.nextDouble();
		
		if (a < b)
			System.out.println("A � o menor n�mero ");
		else 
			System.out.println("B � o menor n�mero ");
	}

}
