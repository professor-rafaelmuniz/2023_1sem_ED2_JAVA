
public class Vetor {
	private int vet[];
	
	Vetor(){
		vet = new int[13];
	}
	
	public void imprimirVetor() {
		System.out.print("[");
		for (int i : vet) {
			System.out.print(i+" ");
		}
		System.out.println("]");
	}
	
	public void setValorPorIndice(int valor, int indice) {
		vet[indice] = valor;
	}
	
	public boolean verificarValorPorIndice(int valor, int indice){
		if (vet[indice] == valor) {
			return true;
		}else {
			return false;
		}
	}
	
}
