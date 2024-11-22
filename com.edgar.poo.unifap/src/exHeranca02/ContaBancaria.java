package exHeranca02;

public class ContaBancaria {
	
	private String nomeCliente;
	private String numConta;
	private double saldo;
	private boolean sacar;
	
	public ContaBancaria(String nomeCliente, String numConta, double saldo) {
		this.nomeCliente = nomeCliente;
		this.numConta = numConta;
		this.saldo = saldo;
	}
	
	public void depositar(double valor) {
		saldo += valor;
	}
  
	
	public boolean sacar(double valor) {
		if(this.sacar = 1) {
			System.out.println("Saque aprovado" + sacar);
		}else {
			System.out.println("Saque não aprovado");
		}
		return true;
	}
	
	@Override
	public String toString() {
		String info = String.format("Nome do cliente:%s\n Numero da Conta:%s\n Saldo:%f",nomeCliente,numConta,saldo);
		return info;
	}

	public String getNomeCliente() {
		return nomeCliente;
	}

	public String getNumConta() {
		return numConta;
	}

	public double getSaldo() {
		return saldo;
	}
	
	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public int getSacar() {
		return sacar;
	}
	
	
	
	
	
 
	

}
