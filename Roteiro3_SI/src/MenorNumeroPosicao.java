import java.util.Scanner;

public class MenorNumeroPosicao {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		int quant = Integer.parseInt(scan.nextLine());
		String [] numerosStr = scan.nextLine().split(" ");
		int [] numeros = new int [quant];
		for (int k=0; k<quant; k++) {
			numeros [k] = Integer.parseInt(numerosStr[k]);
			
		}
		int menor = numeros[0];
		int menorPosicao = 0;
		for (int k=1; k<quant; k++) {
			if (numeros[k]<menor) {
				menor = numeros[k];
				menorPosicao = k;
			}
		}
		System.out.println("Menor valor: "+menor);
		System.out.println("Posição: "+menorPosicao);
		scan.close();
	
	}

}
