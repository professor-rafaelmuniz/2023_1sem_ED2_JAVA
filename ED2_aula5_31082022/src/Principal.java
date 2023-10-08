import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor vetor = new Vetor();
		
		vetor.preencherVetor();
		vetor.imprimirVetor();
		
		int vet[] = vetor.getVetor();
		//BubbleSort bs = new BubbleSort();
		//vet = bs.ordenaVetor(vet);
		//vetor.imprimirVetor(vet);
		Ordenacao ordenacao = new Ordenacao();
		//vet = ordenacao.bubbleSort(vet);
		vet = ordenacao.selectionSort(vet);
		//JOptionPane.showMessageDialog(null, vet);
		vetor.setVetor(vet);
		vetor.imprimirVetor();
	}

}
