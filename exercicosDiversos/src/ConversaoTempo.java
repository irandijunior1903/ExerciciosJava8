import java.util.Scanner;

public class ConversaoTempo {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int N = Integer.parseInt(scan.nextLine());
		int horas = N/3600;
		int minutos = (N%3600)/60;
		int segundos = (N%3600)%60%60;
		System.out.printf("%d:%d:%d", horas, minutos, segundos);
		scan.close();
	
	}
	
	

}
