package primeirosProgramas;

import javax.swing.JOptionPane;

public class ToLowerCase {
	
	public static void main(String [] agrs) {
		
		String nome = JOptionPane.showInputDialog("Digite seu nome: ").toLowerCase();
		JOptionPane.showMessageDialog(null, "Seu nome em minúsculo é: "+nome);
	}

}

