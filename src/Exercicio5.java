import java.util.Locale;
import java.util.Scanner;

public class Exercicio5 {

	public static void main(String[] args) {
		
		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.print("Código da peça 1: ");
		int codigo = ler.nextInt();
		System.out.print("Quantidade de peças: ");
		int qtd = ler.nextInt();
		System.out.print("Valor unitario: ");
		double valor = ler.nextDouble();
		System.out.print("Código da peça 2: ");
		int codigo1 = ler.nextInt();
		System.out.print("Quantidade de peças: ");
		int qtd1 = ler.nextInt();
		System.out.print("Valor unitário: ");
		double valor1 = ler.nextDouble();
		double valorFinal = (qtd * valor) + (qtd1 * valor1);
		System.out.printf("Valor a pagar: R$ %.2f %n", valorFinal);
		
	}

}
