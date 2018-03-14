import javax.swing.JOptionPane;

public class NotaPraFinal2 {
	
	public static void main(String []agrs) {
		
		double nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a 1a nota"));
		JOptionPane.showMessageDialog(null, "A nota lida foi: "+nota1);
		
	}

}