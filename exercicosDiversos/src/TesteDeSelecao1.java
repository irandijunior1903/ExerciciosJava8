import java.util.Scanner;

public class TesteDeSelecao1 {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		String [] numeros = scan.nextLine().split(" ");
		int A = Integer.parseInt(numeros[0]);
		int B = Integer.parseInt(numeros[1]);
		int C = Integer.parseInt(numeros[2]);
		int D = Integer.parseInt(numeros[3]);
		boolean condicao = (B>C && D >A) && (C+D > A+B) && (C > 0 && D >0) && A==C;
		
		if (condicao == true) {
			System.out.println("Valores aceitos");
		} else {
			System.out.println("Valores nao aceitos");
		
		}
		scan.close();
		
		
		
	}

}
