package primeirosProgramas;

import javax.swing.JOptionPane;

public class CalculaMedia {
	
	public static void main(String []agrs) {
		int quantNotas = Integer.parseInt(JOptionPane.showInputDialog("Quantas notas?"));		
		double [] notas = new double [quantNotas];
		for (int k=0; k<quantNotas; k++) {
			notas[k] = Double.parseDouble(JOptionPane.showInputDialog("Qual a pr�xima nota?"));
			
		}
		System.out.println("M�dia: "+calculaMedia(notas));
		
	}
	private static double calculaMedia(double[] notas) {
		double soma = 0;
		for (int k=0; k<notas.length; k++) {
			soma += notas[k];
		}
		return soma/notas.length;
		
	}
}
