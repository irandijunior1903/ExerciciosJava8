package primeirosProgramas;

import javax.swing.JOptionPane;

public class ToUpperCase {
	
	public static void main(String [] agrs) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ").toUpperCase();
		JOptionPane.showMessageDialog(null, "Seu nome em maiúsculo é: "+nome);
	}

}
