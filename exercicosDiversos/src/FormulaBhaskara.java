import java.util.Scanner;

public class FormulaBhaskara {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		String [] numeros = scan.nextLine().split(" ");
		double A = Double.parseDouble(numeros[0]);
		double B = Double.parseDouble(numeros[1]);
		double C = Double.parseDouble(numeros[2]);
		double delta = ((B*B))-(4*A*C);
		double raizquad = Math.sqrt(delta);
		double raiz1 = (-B+(raizquad))/(2*A);
		double raiz2 = (-B-(raizquad))/(2*A);
		if (A == 0 || delta < 0) {
			System.out.println("Impossível calcular");
		} else {
			System.out.printf("R1 = %.5f\n", raiz1);
			System.out.printf("R2 = %.5f\n", raiz2);
		}
		scan.close();
	}

}
