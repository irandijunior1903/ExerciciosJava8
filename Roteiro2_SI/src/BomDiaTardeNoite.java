import javax.swing.JOptionPane;

public class BomDiaTardeNoite {

	public static void main(String []agrs) {
		
		String nome = JOptionPane.showInputDialog("Qual o seu nome?");
		JOptionPane.showMessageDialog(null, "Olá "+nome);
		String horasString = JOptionPane.showInputDialog("Que horas são?");
		int horas = Integer.parseInt(horasString);
		if (horas >= 0 && horas <= 5) {
			JOptionPane.showMessageDialog(null, "Boa madrugada!");	
		} else if (horas < 12) {
			JOptionPane.showMessageDialog(null, "Bom dia!");
		} else if (horas < 18) {
			JOptionPane.showMessageDialog(null, "Boa tarde!");
		} else if (horas <= 23) {
			JOptionPane.showMessageDialog(null, "Boa noite!");
		} else {
			JOptionPane.showMessageDialog(null, "Essa hora é inválida!!!");
			
		}
	}
}