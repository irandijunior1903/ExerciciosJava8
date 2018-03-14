import java.util.Scanner;

public class Lanche {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		String [] numeros = scan.nextLine().split(" ");
		int X = Integer.parseInt(numeros[0]);
		int Y = Integer.parseInt(numeros[1]);
		if (X==1) {
			System.out.printf("Total R$ %.2f\n", Y*4.00);		
		} else if (X==2) {
			System.out.printf("Total R$ %.2f\n", Y*4.50);	
		} else if (X==3) {
			System.out.printf("Total R$ %.2f\n", Y*5.00);	
		} else if (X==4) {
			System.out.printf("Total R$ %.2f\n", Y*2.00);	
		} else if (X==5) {
			System.out.printf("Total R$ %.2f\n", Y*1.50);	
		}
		scan.close();
	}

}
