package primeirosProgramas;

public class ImprimeMultiplosDe3DoWhile {
	
	public static void main(String []agrs) {
		System.out.println("Imprimindo os múltiplos de 3 até 100");
		int k = 1;
		do {
			if (k%3==0) {
				System.out.println(k);
			}
			k++;
		} while (k<=100);
		
		}
	
	}

