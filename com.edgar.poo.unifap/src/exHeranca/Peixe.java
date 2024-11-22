package exHeranca;

public class Peixe extends Animal{
	
	private String caracteristcas;
	
  public Peixe(String nome, String cor, String ambiente,String caracteristicas, int numPatas, double comprimento, double velocidade) {
		super(nome, cor = "Cinza", ambiente = "Aquatico", numPatas = 0, comprimento, velocidade);
		this.caracteristcas = caracteristicas;
	}

  public String getCaracteristcas() {
	return caracteristcas;
}

  public void setCaracteristcas(String caracteristcas) {
	this.caracteristcas = caracteristcas;
}
  @Override
  public String toString() {
	  String inforPeixe = super.toString();
	  String infor = String.format("Nome:(%s)-Cor(%s)-Ambiente(%s)-caracteristicas(%s)-Numero de patas(%d)-Comprimento(%f) - Velocidade(%f)",getNome(),getCor(),getAmbiente(),caracteristcas,getNumPatas(),getComprimento(),getVelocidade());
	return infor;
  }
  
 
  
  


  
  
	
	

}
