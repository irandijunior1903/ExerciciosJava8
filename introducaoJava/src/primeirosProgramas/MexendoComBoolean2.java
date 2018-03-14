package primeirosProgramas;

public class MexendoComBoolean2 {
	
	public static void main(String []agrs) {
		double nota = 1;
		if (nota >= 7) {
			System.out.println("Estou feliz. Fui aprovado :)");
		} else if (nota < 7 && nota >= 4) {
			System.out.println("Vixe. Estou na final");
		} else {
			System.out.println("Estou triste. Fui reprovado "
					+"por média :(");
		}
	}

}
