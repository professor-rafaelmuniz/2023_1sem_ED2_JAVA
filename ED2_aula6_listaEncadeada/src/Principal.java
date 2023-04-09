
public class Principal {
	public static void main(String args[]) {
		No no1 = new No();
		no1.setValor(10);
		No no2 = new No();
		no2.setValor(20);
		No no3 = new No();
		no3.setValor(30);
		
		no1.setProx(no2);
		no2.setProx(no3);
		no3.setProx(null);
		
		No inicio = new No();
		inicio.setProx(no1);

		inicio.imprimirLista(inicio.getProx());
	
	}
}
