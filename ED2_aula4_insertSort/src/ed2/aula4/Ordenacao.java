package ed2.aula4;

public class Ordenacao {
	
	public void bubbleSort(int[] vetor) {
		System.out.println("Bubble sort");
		for (int z = vetor.length-1; z >= 0; z--) {
			for (int x= 0; x < z; x++) {
				System.out.println(vetor[x] + " > " + vetor[x+1]+ "??");
				if (vetor[x] > vetor[x+1]) {
					int aux = vetor[x];
					vetor[x] = vetor[x+1];
					vetor[x+1] = aux;
					System.out.println("TROCOU");
				}
				
			}
		}
	}
	public void selectionSort(int[] vetor) {
		System.out.println("Selection Sort");
		int menor, posMenor;
		for (int i = 0; i< vetor.length; i++) {
			menor = vetor[i];
			posMenor = i;
			for (int x = i; x < vetor.length; x++) {
				if (menor > vetor[x]) {
					menor = vetor[x];
					posMenor = x;
				}
			}
			int aux = vetor[posMenor];
			vetor[posMenor] = vetor[i];
			vetor[i] = aux;
		}
	}
	
	public void insertSort(int vet[]) {
		System.out.println("Insert Sort");
		int aux;
		for(int i=1; i< vet.length; i++) {
			aux = vet[i];
			for (int j = i-1; j>=0; j--){
				if (vet[j] > aux) {
					vet[j+1] = vet[j];
					vet[j] = aux;
				}else {
					//vet[j+1] = aux;
					break;
				}
			}
		}
	}
}






