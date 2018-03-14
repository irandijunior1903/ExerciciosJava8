import java.util.Scanner;

public class SistemasDeJogosTxt {
	
	public static void main(String []agrs) {
		
		Scanner scan = new Scanner(System.in);
		System.out.println("Quantos times serão cadastrados?");
		int numTimes = Integer.parseInt(scan.nextLine());
		String [] times = new String [numTimes];
		int [] golsTimes = new int[numTimes];
		for (int k=0; k<times.length; k++) {
			System.out.println("Qual o nome do time a cadastrar");
			times[k]= scan.nextLine();
			System.out.println("Quantos gols fez no total o time?");
			golsTimes[k] = Integer.parseInt(scan.nextLine());
			System.out.println("Time " + times[k] +" cadastrado");
			
			
		}
		boolean acabou = false;
		while(acabou == false) {
			System.out.println("Digite uma opção:\n1.Ver maior número de gols\n"+
					"2.Ver time com mais gols\n3.Ver times com a letra...\n" +
					"4.Sair");
			int opcao = Integer.parseInt(scan.nextLine());
			if (opcao == 1) {
				int maisGols = calculaMaiorNumeroDeGols(golsTimes);
				System.out.println("Maior número de gols: "+maisGols);
				
			} else if (opcao ==2) {
				String timeMaisGols = pesquisaTimeComMaisGols(times,golsTimes);
				System.out.println("Time com mais gols: "+timeMaisGols);
				
			} else if (opcao == 3) {
				System.out.println("Qual a letra a pesquisar?");
				String letraString = scan.nextLine();
				imprimeTimesIniciadosComALetra(times, letraString);
				
			} else {
				acabou = true;
				System.out.println("Até mais!");
			}

		}
		scan.close();
		
	}
	public static void imprimeTimesIniciadosComALetra(String [] times, String letraString) {
		for (int k=0; k<times.length; k++) {
			if (times[k].startsWith(letraString)) {
				System.out.println(times[k]);
				
			}
			
		}
		
	}
	public static String pesquisaTimeComMaisGols(String [] times, int [] golsTimes) {
		int maiorNumeroGols = 0;
		String timeComMaisGols = "";
		for (int k=0; k< golsTimes.length; k++) {
			if (golsTimes[k] >= maiorNumeroGols) {
				maiorNumeroGols = golsTimes[k];
				timeComMaisGols = times[k];
				
			}
		}
		return timeComMaisGols;
	}
	public static int calculaMaiorNumeroDeGols(int [] golsTimes) {
		int maisGols = 0;
		for (int k=0; k<golsTimes.length; k++) {
			maisGols += golsTimes[k];
			
		}
		return maisGols;
	}

}
