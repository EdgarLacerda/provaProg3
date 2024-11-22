package exHeranca02;

import java.util.Calendar;

public class ContaPoupanca extends ContaBancaria{
	
	private int diaRendimento;
	  
	public ContaPoupanca(String nomeCliente,String  numConta,double saldo,int diaRendimento) {
		super(nomeCliente, numConta, saldo);
		this.diaRendimento = diaRendimento;
	}
	
	public boolean calcularNovoSaldo(double taxaRendimento){

        Calendar hoje = Calendar.getInstance();

        if (diaRendimento == hoje.get(Calendar.DAY_OF_MONTH)){
            this.setSaldo(this.getSaldo() + (this.getSaldo() * taxaRendimento));
            return true;
        }
        return false;
    }
	
	@Override
	public String toString() {
		String infoPoupanca = toString();
		String info = String.format("Conta Poupança\n Dia de redimento:%d",diaRendimento);
		return info;
	}
	
	
	
	

}
