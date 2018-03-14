import java.util.Scanner;

public class QuantidadeNotas {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int notas = Integer.parseInt(scan.nextLine());
		int notasCem = notas/100;
		int notasCinquenta = (notas%100)/50;
		int notasVinte = ((notas%100)%50)/20;
		int notasDez = (((notas%100)%50)%20)/10;
		int notasCinco = ((((notas%100)%50)%20)%10)/5;
		int notasDois = (((((notas%100)%50)%20)%10)%5)/2;
		int notasUm = ((((((notas%100)%50)%20)%10)%5)%2)/1;		

		System.out.println(notasCem+" notas(s) de R$ 100.00");
		System.out.println(notasCinquenta+" notas(s) de R$ 50.00");
		System.out.println(notasVinte+" notas(s) de R$ 20.00");
		System.out.println(notasDez+" notas(s) de R$ 10.00");
		System.out.println(notasCinco+" notas(s) de R$ 5.00");
		System.out.println(notasDois+" notas(s) de R$ 2.00");
		System.out.println(notasUm+" notas(s) de R$ 1.00");
		scan.close();
		
	}

}
