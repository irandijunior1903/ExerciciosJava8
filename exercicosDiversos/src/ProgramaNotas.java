import java.util.Scanner;

public class ProgramaNotas {
	
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("CALCULANDO NOTAS DA TURMA");
		System.out.println("Quantos alunos há na turma?");
		int numAlunos = Integer.parseInt(scan.nextLine());
		String [] listaNomes = new String[numAlunos];
		double [] listaNotas = new double[numAlunos];
		for (int k = 0; k < numAlunos; k++) {
			System.out.println("Qual o nome do aluno [" + (k + 1) + "]");
			listaNomes[k] = scan.nextLine();
			System.out.println("Qual a nota do aluno [" + (k + 1) + "]");
			listaNotas[k] = Double.parseDouble(scan.nextLine());
		}
		if (numAlunos > 0) {
			System.out.println("A maior nota da turma foi:" +calculaMaiorNota(listaNotas));
			System.out.println("A quantidade de notas abaixo da média é:" +contaAlunosComNotaBaixa(listaNotas));
			System.out.println("Qual o nome a pesquisar?");
			String nomeAPesquisar = scan.nextLine();
			int quantNomes = contaAlunosComNome(listaNomes, nomeAPesquisar);
			System.out.println("A quantidade de alunos com o nome " + nomeAPesquisar + " é:" + quantNomes);
			System.out.println("Qual o prefixo a pesquisar?");
			String prefixo = scan.nextLine();
			imprimeNomesQueComecamCom(listaNomes, prefixo);
			
		}
		System.out.println("Fim do programa");
		scan.close();
	
	}
	public static double calculaMaiorNota(double [] listaNotas) {
		double maiorNota = listaNotas[0];
		for (int k=1; k<listaNotas.length; k++) {
			if (listaNotas[k] > maiorNota) {
				maiorNota = listaNotas[k];						
			}
		}
		return maiorNota;
	}
	public static int contaAlunosComNotaBaixa(double [] listaNotas) {
		int contNotas = 0;
		for (int k=0; k<listaNotas.length; k++) {
			if (listaNotas[k] < 7) {
				contNotas +=1;
			}
		}
		return contNotas;
		
	}
	public static int contaAlunosComNome(String [] listaNomes, String nomeAPesquisar) {
		int quantNomes = 0;
		for (int k=0; k<listaNomes.length; k++) {
			if (listaNomes[k].equals(nomeAPesquisar)) {
				quantNomes +=1;
				
			}
			
		}
		return quantNomes;
		
	}
	public static void imprimeNomesQueComecamCom(String [] listaNomes, String prefixo) {
		
		for (int k=0; k<listaNomes.length; k++) {
			if (listaNomes[k].startsWith(prefixo)) {
				System.out.println(listaNomes[k]);
				
				
			}
		}

		
	}

}