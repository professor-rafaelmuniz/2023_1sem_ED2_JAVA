
public class BubbleSort {
	
	public int[] ordenaVetor(int vetor[]) {
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
}
