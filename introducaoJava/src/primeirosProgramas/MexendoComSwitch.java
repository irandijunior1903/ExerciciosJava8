package primeirosProgramas;

import javax.swing.JOptionPane;

public class MexendoComSwitch {
	
	public static void main(String []agrs) {
		String dia = JOptionPane.showInputDialog("Qual o dia da semana?");
		switch (dia) {
		case "SEGUNDA":
		case "TER�A":
		case "QUARTA":
		case "QUINTA":
			System.out.println("Bom dia de trabalho!");
			break;
		case "SEXTA":
			System.out.println("Boa sexta-feira!");
			break;
		case "S�BADO":
		case "DOMINGO":
			System.out.println("Bom fim de semana!");
			break;
		default:
			System.out.println("Dia inv�lido!");
		}

	}

}
