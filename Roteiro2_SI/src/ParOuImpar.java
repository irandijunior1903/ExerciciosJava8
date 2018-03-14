import java.util.Scanner;

public class ParOuImpar {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		for(int k = 0; k<n; k++) {
			int numero = Integer.parseInt(scan.nextLine());
			if (numero == 0) {
				System.out.println("NULL");
			} else if (numero %2 == 0 && numero < 0) {
				System.out.println("EVEN NEGATIVE");
			} else if (numero %2 == 0 && numero > 0) {
				System.out.println("EVEN POSITIVE");
			} else if (numero < 0) {
				System.out.println("ODD NEGATIVE");
			} else {
				System.out.println("ODD POSITIVE");
			}
		}
		scan.close();
	}

}
