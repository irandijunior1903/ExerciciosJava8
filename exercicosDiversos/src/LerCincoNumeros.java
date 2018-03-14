import javax.swing.JOptionPane;

public class LerCincoNumeros {
	
	public static void main(String [] agrs) {
		
		double soma = 0;
		double maior = 0;
		double [] listaNum = new double[5];
		for (int k=0; k<listaNum.length; k++) {
			 listaNum[k] = Double.parseDouble(JOptionPane.showInputDialog("Digite a nota do índice ("+k+"):"));
			
		}
		for (int k=0; k<listaNum.length; k++) {
			soma += listaNum[k];
			
		}
		for (int k=0; k<listaNum.length; k++) {
			if (listaNum[k] >= maior) {
				maior = listaNum[k];
				
			}
		}
		JOptionPane.showMessageDialog(null, "A soma das notas é igual a: " + soma + 
		" e maior nota foi: " + maior);
	}

}
