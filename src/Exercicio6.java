import java.util.Locale;
import java.util.Scanner;

public class Exercicio6 {

	public static void main(String[] args) {

		Locale.setDefault(Locale.US);
		Scanner ler = new Scanner(System.in);
		System.out.print("Digite valor 1: ");
		float A = ler.nextFloat();
		System.out.print("Digite valor 2: ");
		float B = ler.nextFloat();
		System.out.print("Digite valor 3: ");
		float C = ler.nextFloat();
		
		float areaTriangulo = (A * C) / 2;
		double areaCirculo = Math.PI * Math.pow(C, 2);
		float areaTrapezio = ((A + B) * C) / 2;
		float areaQuadrado = B * B;
		float areaRetangulo = A * B;
		System.out.printf("Triangulo: %.3f %n", areaTriangulo);
		System.out.printf("Circulo: %.3f %n", areaCirculo);
		System.out.printf("Trapezio: %.3f %n", areaTrapezio);
		System.out.printf("Quadrado: %.3f%n", areaQuadrado);
		System.out.printf("Retangulo: %.3f %n", areaRetangulo);
	}

}
