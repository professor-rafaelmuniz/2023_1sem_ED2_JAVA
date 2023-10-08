 
public class Ordenacao {
	
	// Método de ordenação BUBBLE SORT
	public int[] bubbleSort(int[] vetor) {
		System.out.println("Ordenado pelo Bubble Sort");	
		int cont=1;
		   for(int j=vetor.length-1; j > 0; j--) {
			   System.out.println("Iteração: " + cont);
			   cont++;
			 for(int i=0; i < j; i++){
				 System.out.print(vetor[i] + " > " + vetor[i+1] + " ??? ");
				if (vetor[i] > vetor[i+1]) {
					int aux = vetor[i];
					vetor[i] = vetor[i+1];
					vetor[i+1] = aux;
					System.out.println(" - TROCOU");
				}else {
					System.out.println(" ");
				}
			 }
		   }
		return vetor;
		
	}
	// Método de ordenação SELECTION SORT
	public int[] selectionSort(int[] vet) {
		System.out.println("Ordenado pelo Seleciont Sort");
		int menorValor, indiceMenorValor;
		for(int i=0; i < vet.length; i++) {
			menorValor = vet[i];
			indiceMenorValor = i;
			for(int j = i; j < vet.length; j++) {
				if (vet[j] < menorValor) {
					menorValor 		 = vet[j];
					indiceMenorValor = j;
				}
			}
			int aux = vet[indiceMenorValor];
			vet[indiceMenorValor] = vet[i];
			vet[i] = aux;
		}

		return vet;
		
	}
	
	public int[] insertSort(int[] vet) {
		System.out.println("\n #### INSERT SORT #####");
		int i, j, aux;
		for(i=1; i < vet.length; i++ ) {
			aux = vet[i];
			for (j = i-1; j >= 0; j++) {
				if(aux < vet[j]) {
					vet[j+1] = vet[j];
					vet[j] = aux;
				}else{
					break;
				}
			}
		
		}
		return vet;
	}	
}
