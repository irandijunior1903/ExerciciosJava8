package primeirosProgramas;

public class ImprimeMultiplosDe3DoWhile {
	
	public static void main(String []agrs) {
		System.out.println("Imprimindo os m�ltiplos de 3 at� 100");
		int k = 1;
		do {
			if (k%3==0) {
				System.out.println(k);
			}
			k++;
		} while (k<=100);
		
		}
	
	}

