package ddd;
import java.util.Scanner;
public class Ex05 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, reais;
		
		System.out.printf("Quantos d�lares voc� quer converter em reais?: ");
		a = ler.nextDouble();
		
		System.out.printf("Qual a cota��o atual?: ");
		b = ler.nextDouble();
		
		reais = a * b;
		
		System.out.printf("O seu dinheiro em d�lares para reais foi: %.2f", reais);

			//Nicks o Mais Brabo
		
	}

}