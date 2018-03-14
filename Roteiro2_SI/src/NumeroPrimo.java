import java.util.Scanner;

public class NumeroPrimo {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for (int k=0; k<n; k++) {
			int numero = Integer.parseInt(scan.nextLine());
			if (numero % 1 == 0 && numero % numero == 0) {
				System.out.printf("%d eh primo", numero);
			} else {
				System.out.printf("%d nao eh primo", numero);
			}
			numero = Integer.parseInt(scan.nextLine());
			
		}
		scan.close();
	}

}
