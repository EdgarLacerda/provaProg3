package exHeranca;

public class Animal {
	
	private String nome;
	private String cor;
	private String ambiente;
	private int numPatas;
	private double comprimento;
	private double velocidade;
	
	public Animal(String nome, String cor, String ambiente, int numPatas, double comprimento, double velocidade) {
		super();
		this.nome = nome;
		this.cor = cor;
		this.ambiente = ambiente;
		this.numPatas = numPatas;
		this.comprimento = comprimento;
		this.velocidade = velocidade;
	}

	public String getNome() {
		return nome;
	}
	
	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCor() {
		return cor;
	}
	
	public void setCor(String cor) {
		this.cor = cor;
	}

	public String getAmbiente() {
		return ambiente;
	}
	
	public void setAmbiente(String ambiente) {
		this.ambiente = ambiente;
	}

	public int getNumPatas() {
		return numPatas;
	}
	
	public void setNumPatas(int numPatas) {
		this.numPatas = numPatas;
	}

	public double getComprimento() {
		return comprimento;
	}
	
	public void setComprimento(double comprimento) {
		this.comprimento = comprimento;
	}

	public double getVelocidade() {
		return velocidade;
	}
	
	public void setVelocidade(double velocidade) {
		this.velocidade = velocidade;
	}
	
	@Override
	public String toString() {
		String infor = String.format("Nome:(%s)-Cor(%s)-Ambiente(%s)-Numero de patas(%d)-Comprimento(%f) - Velocidade(%f)",nome,cor,ambiente,numPatas,comprimento,velocidade);
		return infor;
	}
	

	
	
	

}
