package exHeranca02;

public class ContaEspecial extends ContaBancaria{
	
	private double limite;

	public ContaEspecial(double limite, String nomeCliente) {
		super(nomeCliente, nomeCliente, limite);
		this.limite = limite;
	}
	
	public boolean sacar(double valor){

        double saldoComLimite = this.getSaldo() + limite;

        if ((saldoComLimite-valor) >=0){
            this.setSaldo(this.getSaldo()-valor);

            return true;
        }

        return false;
    }
	
	public String toString() {
		String inforEspecial = toString();
		String infor = String.format("Conta Especial\n Conta Especial:%f",limite);
		return infor;
	}
	

}
