package br.edu.ifsp.bra.ed2;

public class NoBB {
	
	private int valor;
	private NoBB esquerda;
	private NoBB direita;
	
	NoBB(int valor){
		this.valor = valor;
		this.esquerda = null;
		this.direita=null;
	}
	
	public static void montaArvore(NoBB novo, NoBB arvore){
		if (arvore ==null){
			arvore = novo;	
		}else{
			if (novo.valor != arvore.valor) {
				if (novo.valor < arvore.valor){
					if (arvore.esquerda == null){
						arvore.esquerda = novo;
					}else{
						montaArvore(novo, arvore.esquerda);
					}
				}else{
					if (arvore.direita == null){
						arvore.direita =  novo;
					}else{
						montaArvore(novo, arvore.direita);
					}
				}
			}else {
				System.out.println("Número já existe na árvore");
			}
	}
}
	
	public static void imprimirPreOrdem(NoBB n){
		System.out.print(n.valor + " ");
		if (n.esquerda != null){
			imprimirPreOrdem(n.esquerda);
		}
		if (n.direita != null){
			imprimirPreOrdem(n.direita);
		}
	}
	
}