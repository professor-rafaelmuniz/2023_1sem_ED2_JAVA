import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor v = new Vetor();
		v.preencherVetor();
		v.imprimirVetor();
		
		int buscar = Integer.parseInt(JOptionPane.showInputDialog("Digite o número desejado:"));
		
		BuscaBinaria bb = new BuscaBinaria();
		bb.realizarBuscaBinaria(v.getVetor(), buscar);
	}

}
