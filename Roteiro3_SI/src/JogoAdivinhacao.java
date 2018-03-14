import java.util.Scanner;

public class JogoAdivinhacao {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int numProcurado = Integer.parseInt(scan.nextLine());
		int numLido = Integer.parseInt(scan.nextLine());
		boolean adivinhou = false;
		int pontos = 100;
		while (adivinhou == false)  {
			if (numLido > numProcurado) {				
				System.out.println("O número digitado é maior que o número a procurar!");
				pontos -= 1;
			} else if (numLido < numProcurado) {
				System.out.println("O número digitado é menor que o número a procurar!");
				pontos -= 1;
			} else if (numLido == numProcurado && pontos == 100) {
				System.out.printf("Você acertou de primeira e ganhou %d pontos!", pontos);
				break;
			} else {
				System.out.printf("Você ganhou %d pontos!", pontos);
				break;
			}
			numLido = Integer.parseInt(scan.nextLine());
		} 
		scan.close();
		
		
		
	}

}
