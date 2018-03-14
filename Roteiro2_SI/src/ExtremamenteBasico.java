import java.util.Scanner;

public class ExtremamenteBasico {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int A = Integer.parseInt(scan.nextLine());
		int B = Integer.parseInt(scan.nextLine());
		int X = A+B;
		System.out.printf("X = %d\n", X);
		scan.close();

	}

}
