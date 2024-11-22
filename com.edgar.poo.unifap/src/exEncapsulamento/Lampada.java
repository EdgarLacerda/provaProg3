package exEncapsulamento;

public class Lampada {
	
	private String marca;
	private String modelo;
	private String tipo;
	private String cor;
	private double voltz;
	private double preco;
	private boolean ligada;
	
	
	public Lampada(String marca, String modelo, String tipo, String cor, double voltz, double preco,boolean ligada) {

		this.marca = marca;
		this.modelo = modelo;
		this.tipo = tipo;
		this.cor = cor;
		this.voltz = voltz;
		this.preco = preco;
		this.ligada = ligada;
	}


	public String getMarca() {
		return marca;
	}


	public void setMarca(String marca) {
		this.marca = marca;
	}


	public String getModelo() {
		return modelo;
	}


	public void setModelo(String modelo) {
		this.modelo = modelo;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getCor() {
		return cor;
	}


	public void setCor(String cor) {
		this.cor = cor;
	}


	public double getVoltz() {
		return voltz;
	}


	public void setVoltz(double voltz) {
		this.voltz = voltz;
	}


	public boolean isLigada() {
		return ligada;
	}

    
	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
    

	public double getPreco() {
		return preco;
	}
	
	
	public void ligar() {
		setLigada(true);
	}
	
	public void Desligar() {
		setLigada(false);
	}
	
	public void mudarEstado() {
	if(this.ligada) {
		Desligar();
	}else {
		ligar();
	}
}
	
	public void mostrarEstado() {
		if(this.ligada) {
			System.out.println("Lampada ligada");
		}else {
			System.out.println("Lampada desligada");
		}
	}
	
	

	public void mostrarInfo() {
		System.out.println("Marca: " + marca);
		System.out.println("Modelo: " + modelo);
		System.out.println("Tipo: " + tipo);
		System.out.println("Cor: " + cor);
		System.out.println("Voltagem: " + voltz);
		System.out.println("Preço: " + preco);
	}
	

}
