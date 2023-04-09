package aula;

public class Principal {
	public static void main(String args[]) {
		No raiz = new No();
		raiz.setLetra('A');
		No letraB = new No ('B');
		No letraC = new No ('C');
		No letraD = new No ('D');
		No letraE = new No ('E');
		No letraF = new No ('F');
		No letraG = new No ('G');
		raiz.setEsq(letraB);
		raiz.setDir(letraC);
		letraB.setEsq(letraD);
		letraB.setDir(letraE);
		letraC.setEsq(letraF);
		letraC.setDir(letraG);
		letraD.setEsq(null);
		letraD.setDir(null);
		letraE.setEsq(null);
		letraE.setDir(null);
		letraF.setEsq(null);
		letraF.setDir(null);
		letraG.setEsq(null);
		letraG.setDir(null);
		
		
	}
}
