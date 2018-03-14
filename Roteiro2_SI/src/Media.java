import java.util.Scanner;

public class Media {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de n");
		int n = Integer.parseInt(scan.nextLine());
		double soma = 0;
		for (int k=0; k<n; k++) {
			System.out.println("Digite a próxima nota");
			double nota = Double.parseDouble(scan.nextLine());
			soma+=nota;
					
			
		}
		double media = soma/n;
		System.out.printf("Média: %.1f\n", media);
		scan.close();
	}

}