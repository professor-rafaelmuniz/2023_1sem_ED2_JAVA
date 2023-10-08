package br.edu.ifsp.bra.ed2;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		NoBB arvore = new NoBB(7);
		NoBB.montaArvore(arvore, null);
		
		NoBB n4 = new NoBB(4);
		NoBB.montaArvore(n4, arvore);
		
		NoBB n5 = new NoBB(5);
		NoBB.montaArvore(n5, arvore);
		
		NoBB n10 = new NoBB(10);
		NoBB.montaArvore(n10, arvore);
		
		NoBB n11 = new NoBB(10);
		NoBB.montaArvore(n11, arvore);
		
		System.out.println("Pre-ordem:");
		NoBB.imprimirPreOrdem(arvore);
		System.out.println(" ");
	}

}
