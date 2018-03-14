import java.util.Scanner;

public class ArrayTestes {
	
	public static void main(String []agrs) {
		Scanner scan = new Scanner(System.in);
		String [] nomes = {"Vanessa", "Ana", "Paula"};
		int tamanho = nomes.length;
		int quantNomes = 0;
		System.out.println("Qual o nome a buscar?");
		String nomePesquisar = scan.nextLine();
		for (int k=0; k<nomes.length; k++) {
			if (nomes[k].equals(nomePesquisar)) {
				quantNomes +=1;
				nomePesquisar = nomes[k];
			}
		}
		System.out.println("A quantidade de nomes existente é: "+tamanho);
		System.out.println("A quantidade de nomes " + nomePesquisar + " é: "+quantNomes);
		scan.close();
	}
	
}
			 
			

	
				
				
			
			
		
			
		
	
	



