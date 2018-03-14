import java.util.Scanner;

public class TipoDeCombustivel {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int n = Integer.parseInt(scan.nextLine());
		int alcool = 0;
		int gasolina = 0;
		int diesel = 0;
		while(n != 4) {
			if (n == 1) {
				alcool++;
			} else if (n == 2) {
				gasolina++;
			} else if (n == 3) {
				diesel++;
			}
			n = Integer.parseInt(scan.nextLine());
		}
		System.out.println("MUITO OBRIGADO");
		System.out.println("Alcool: "+alcool);
		System.out.println("Gasolina: "+gasolina);
		System.out.println("Diesel: "+diesel);
		scan.close();
		
	} 	

}
