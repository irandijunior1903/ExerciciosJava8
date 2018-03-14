import java.util.Scanner;

public class SalarioComBonus {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		String nome = scan.nextLine();
		double salariofixo = Double.parseDouble(scan.nextLine());
		double totalvenda = Double.parseDouble(scan.nextLine());
		double total = salariofixo + (totalvenda*0.15);
		System.out.printf("TOTAL = R$ %.2f\n", total);
		scan.close();
		
		
	}

}
