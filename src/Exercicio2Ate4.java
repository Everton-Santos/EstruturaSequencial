import java.util.Locale;

public class Exercicio2Ate4 {

	public static void main(String[] args) {
		
		double num1 = 2.00;
		double raio = num1;
		double area = Math.PI * Math.pow(raio, 2);
		System.out.printf("Área = %.4f %n", area);
		
		double num2 = 100.64;
		double raio2 = num2;
		double area2 =  3.14159 * Math.pow(raio2, 2);
		System.out.printf("Área = %.4f %n", area2);
		
		double num3 = 150.00;
		double raio3 = num3;
		double area3 = 3.14159 * Math.pow(raio3, 2);
		System.out.printf("Área = %.4f %n", area3);
		
		int A = 5;
		int B = 6;
		int C = 7;
		int D = 8;
		int diferenca = A * B - C * D;
		System.out.println("Diferença = " + diferenca);
		
		int A1 = 5;
		int B1 = 6;
		int C1 = -7;
		int D1 = 8;
		int diferenca1 = A1 * B1 - C1 * D1;
		System.out.println("Diferença = " + diferenca1);
		
		Locale.setDefault(Locale.US);
		int numero = 25;
		int horas = 100;
		double valor = 5.50;
		double salario = 100 * 5.50;
		System.out.println("Number: " + numero);
		System.out.printf("Salary = U$ %.2f %n", salario);
		
		int numero1 = 1;
		int horas1 = 200;
		double valor1 = 20.50;
		double salario1 = horas1 * valor1;
		System.out.println("Number = " + numero1);
		System.out.printf("Salary = U$ %.2f %n", salario1);
		
		int numero2 = 6;
		int horas2 = 145;
		double valor2 = 15.55;
		double salario2 = horas2 * valor2;
		System.out.println("Number = " + numero2);
		System.out.printf("Salary = U$ %.2f %n", salario2);

	}

}
