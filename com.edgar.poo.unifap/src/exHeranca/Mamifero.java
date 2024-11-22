package exHeranca;

public class Mamifero extends Animal {
	
	private String alimento;
	
	public Mamifero(String nome, String cor, String ambiente,String alimento, int numPatas, double comprimento, double velocidade) {
		super(nome, cor = "Preto", ambiente = "Terrestre", numPatas = 4, comprimento, velocidade);
		this.alimento = "Carne";
		
	}

	public String getAlimento() {
		return alimento;
	}

	public void setAlimento(String alimento) {
		this.alimento = "racao";
	}
	
	@Override
	public String toString() {
		String inforMamifero = super.toString();
		  String infor = String.format("Nome:(%s)-Cor(%s)-Ambiente(%s)- Alimento(%s)-Numero de patas(%d)-Comprimento(%f) - Velocidade(%f)",
				  getNome(),
				  getCor(),
				  getAmbiente(),
				  alimento,
				  getNumPatas(),
				  getComprimento(),
				  getVelocidade());
		return infor;
	}
	
	


	


	
	
	

}
