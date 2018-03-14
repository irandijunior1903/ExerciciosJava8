package primeirosProgramas;

import javax.swing.JOptionPane;

public class FazendoContas {
	
	public static void main(String []agrs) {
		double num1 = Double.parseDouble(JOptionPane.showInputDialog("Qual o primeiro número"));
		double num2 = Double.parseDouble(JOptionPane.showInputDialog("Qual o segundo número"));
		double soma = num1 + num2;
		double diferenca = num1 - num2;
		double produto = num1 * num2;
		double quociente = num1 / num2;
		
		System.out.printf("Soma: %.2f\n", soma);
		System.out.printf("Diferença: %.2f\n", diferenca);
		System.out.printf("Produto: %.2f\n", produto);
		System.out.printf("Quociente: %.2f\n", quociente);		
		
	}

}
