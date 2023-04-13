package aula;

public class No {
	private char letra;
	private No esq;
	private No dir;
	
	No(){
		
	}
	No (char letra){
		this.letra = letra;
	}
	No (No esq, No dir){
		this.esq = esq;
		this.dir = dir;
	}
	
	public void preOrdem(No raiz) {
		if(raiz != null) {
			System.out.print(raiz.getLetra()+ " ");
			preOrdem(raiz.getEsq());
			preOrdem(raiz.getDir());
		}
	}
	
	public void emOrdem(No raiz) {
		if(raiz != null) {
			preOrdem(raiz.getEsq());
			System.out.print(raiz.getLetra() + " ");
			preOrdem(raiz.getDir());
		}
	}
	
	public void posOrdem(No raiz) {
		if(raiz != null) {
			preOrdem(raiz.getEsq());
			preOrdem(raiz.getDir());
			System.out.print(raiz.getLetra()+ " ");
		}
	}
	
	
	public char getLetra() {
		return letra;
	}
	public void setLetra(char letra) {
		this.letra = letra;
	}
	public No getEsq() {
		return esq;
	}
	public void setEsq(No esq) {
		this.esq = esq;
	}
	public No getDir() {
		return dir;
	}
	public void setDir(No dir) {
		this.dir = dir;
	}
	
	
	
}
