import java.util.Scanner;

public class Media2 {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		double A = Double.parseDouble(scan.nextLine());
		double B = Double.parseDouble(scan.nextLine());
		double C = Double.parseDouble(scan.nextLine());
		double MEDIA = ((A*2)+(B*3)+(C*5))/10;
		System.out.printf("MEDIA = %.1f\n", MEDIA);
		scan.close();
		
	}

}
