import javax.swing.JOptionPane;

public class Vetor {
	private int vetor[];
	
	Vetor(){
		int qtd = Integer.parseInt(JOptionPane.showInputDialog("Digite o tamanho do vetor:"));
		vetor = new int[qtd];
	}
	
	public void preencherVetor() {
		for (int i=0; i < vetor.length;i++) {
			vetor[i] = Integer.parseInt(JOptionPane.showInputDialog("Digite o "+ (i+1) + "° número:"));
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
	
	public void setVetor(int[] vetor) {
		this.vetor = vetor;
	}

	public void imprimirVetor(int vet[]) {
		for (int i=0; i < vet.length; i++) {
			System.out.println(" " + vet[i]);
		}
		JOptionPane.showMessageDialog(null, vet);
	}
	
}
