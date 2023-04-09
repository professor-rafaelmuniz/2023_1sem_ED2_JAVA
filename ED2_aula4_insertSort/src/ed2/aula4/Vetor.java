package ed2.aula4;
import javax.swing.JOptionPane;

public class Vetor {
	private int vetor[];
	
	Vetor(){
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		vetor = new int[qtd];
	}
	
	public void preencherVetor() {
		for (int i=0; i < vetor.length;i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i+1) + "� n�mero:"));
		}
	}
	
	public int[] getVetor() {
		return vetor;
	}

	public void imprimirVetor() {
		for (int i=0; i < vetor.length; i++) {
			System.out.println(" " + vetor[i]);
		}
	}
	
}
