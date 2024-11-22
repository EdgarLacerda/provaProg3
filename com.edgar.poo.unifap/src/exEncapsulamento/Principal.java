package exEncapsulamento;

public class Principal {

	public static void main(String[] args) {
		
		Lampada lampada = new Lampada("Elgin","parede","led","branca",30, 12.90 ,true);
		
		lampada.mostrarInfo();
		
		lampada.ligar();
		lampada.mostrarEstado();
		
		lampada.Desligar();
		lampada.mostrarEstado();

	}

}
