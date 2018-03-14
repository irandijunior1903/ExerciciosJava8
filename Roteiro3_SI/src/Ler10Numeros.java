import java.util.Scanner;

public class Ler10Numeros {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int [] numeros = new int [10];
		for (int k=0; k<10; k++) {
			int num = Integer.parseInt(scan.nextLine());
			if (num <=0) {
				numeros[k] = 1;
			} else {
				numeros[k] = num;
			}
		
		}
		for (int k=0; k<10; k++) {
			System.out.println("X["+k+"] = "+numeros[k]);
		}
		scan.close();
	}

}
