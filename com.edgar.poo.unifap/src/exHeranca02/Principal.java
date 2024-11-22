package exHeranca02;

public class Principal {

	public static void main(String[] args) {
	  ContaBancaria conta =new ContaBancaria("Edgar","0001",300);
	  System.out.println(conta);
	  conta.depositar(100);
	  conta.sacar(50);
	  System.out.println(conta);
	  
	  ContaPoupanca poupanca = new ContaPoupanca("Edgar","0001",300,7);
	  System.out.println(poupanca);
	  poupanca.depositar(100);
	  poupanca.calcularNovoSaldo(100);
	  System.out.println(poupanca);
	  
     //Não consegui rodar o codigo da conta especial
	  

	}

}
