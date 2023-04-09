package ed2.aula4;
import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Vetor v = new Vetor();
		v.preencherVetor();
		v.imprimirVetor();
		
		//int buscar = Integer.parseInt(JOptionPane.showInputDialog("Digite o n�mero desejado:"));
		
		//BuscaBinaria bb = new BuscaBinaria();
		//bb.realizarBuscaBinaria(v.getVetor(), buscar);
		v.imprimirVetor();
		Ordenacao ordenacao = new Ordenacao();
		ordenacao.selectionSort(v.getVetor());
		v.imprimirVetor(); 
	}

}
