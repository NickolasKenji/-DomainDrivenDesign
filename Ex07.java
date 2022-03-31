package ddd;
import java.util.Scanner;
public class Ex07 {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		double a, b, c, d, e, troco, total, pago;
		
		System.out.printf("Digite o primeiro valor: ");
		a = ler.nextDouble();
		
		System.out.printf("Digite o segundo valor: ");
		b = ler.nextDouble();
		
		System.out.printf("Digite o terceiro valor: ");
		c = ler.nextDouble();
		
		System.out.printf("Digite o quarto valor: ");
		d = ler.nextDouble();
		
		System.out.printf("Digite o quinto valor: ");
		e = ler.nextDouble();
		
		System.out.printf("Digite o valor pago: ");
		pago = ler.nextDouble();
		
		total = a + b + c + d + e;
		troco = a + b + c + d + e - pago;
		
		if (troco < 0)
		troco = troco * (-1);
		
		System.out.printf("O total é %.1f", total);
		System.out.printf("O troco é %.1f", troco);

		}
	
			//Nicks o Mais Brabo
	
}
