import java.util.Scanner;

public class URI2057 {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		String [] numeroString = scan.nextLine().split(" ");
		int horaSaida = Integer.parseInt(numeroString[0]);
		int tempoViagem = Integer.parseInt(numeroString[1]);
		int fusoHor = Integer.parseInt(numeroString[2]);
		int horaChegada = (horaSaida+tempoViagem+fusoHor)%24;
		if (horaChegada < 0) {
			horaChegada = 24+horaChegada;
		}
		System.out.println(horaChegada);
		scan.close();
		
		
	}

}
