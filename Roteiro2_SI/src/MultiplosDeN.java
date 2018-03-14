import java.util.Scanner;

public class MultiplosDeN {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Digite o valor de n");
		int n = Integer.parseInt(scan.nextLine());
		for (int k=1; k<=100; k++) {
			if (k%n==0) {
				System.out.println(k);
				
			}
			
		}
		scan.close();
	}

}