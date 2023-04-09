
public class Principal {
	public static void main(String args[]) {
		Vetor v = new Vetor();
		Hash h = new Hash();
		v.setValorPorIndice(22, h.retornaIndiceMetodoDaDivisao(22, 13));
		v.setValorPorIndice(27, h.retornaIndiceMetodoDaDivisao(27, 13));
		System.out.println(v.verificarValorPorIndice(22, h.retornaIndiceMetodoDaDivisao(22, 13)));
		
		v.imprimirVetor();
		
	}
}
