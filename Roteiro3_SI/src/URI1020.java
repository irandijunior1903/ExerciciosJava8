import java.util.Scanner;

public class URI1020 {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int quantDias = Integer.parseInt(scan.nextLine());
		int anos = quantDias/365;
		int meses = (quantDias%365)/30;
		int dias = (quantDias%365)%30;
		System.out.println(anos+" ano(s)");
		System.out.println(meses+" mes(es)");
		System.out.println(dias+" dia(s)");
		scan.close();
	}

}
