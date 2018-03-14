import java.util.Scanner;

public class URI1012 {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		String [] numerosLidos = scan.nextLine().split(" ");
		double A = Double.parseDouble(numerosLidos[0]);
		double B = Double.parseDouble(numerosLidos[1]);
		double C = Double.parseDouble(numerosLidos[2]);
		double areaTriangulo = (A*C)/2;
		System.out.printf("TRIANGULO: %.3f\n", areaTriangulo);
		double areaCirculo = 3.14159*(C*C);
		System.out.printf("CIRCULO: %.3f\n", areaCirculo);
		double areaTrapezio = ((A+B)*C)/2;
		System.out.printf("TRAPEZIO: %.3f\n", areaTrapezio);
		double areaQuadrado = (B*B);
		System.out.printf("QUADRADO: %.3f\n", areaQuadrado);
		double areaRetangulo = (A*B);
		System.out.printf("RETANGULO: %.3f\n", areaRetangulo);
		scan.close();
		
	}

}
