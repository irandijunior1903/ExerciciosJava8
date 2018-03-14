import java.util.Scanner;

public class URI1014 {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int X = Integer.parseInt(scan.nextLine());
		double Y = Double.parseDouble(scan.nextLine());
		double consumo = X/Y;
		System.out.printf("%.3f km/l\n", consumo);
		scan.close();
	}

}
