import javax.swing.JOptionPane;

public class ArrayNomes {
	
	public static void main(String []agrs) {
		
		int quantNomes = 3;
		String [] nomes = new String [3];
		for (int k=0; k<quantNomes; k++) {
			nomes[k] = JOptionPane.showInputDialog("Digite um nome");
			
		}
		JOptionPane.showMessageDialog(null, "O primeiro nome lido foi: " +nomes[0]);
		JOptionPane.showMessageDialog(null, "O último nome lido foi: "+nomes[nomes.length-1]);
	}

}
