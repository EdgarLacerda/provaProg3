package exHeranca;

public class Principal {

	public static void main(String[] args) {
		
		Animal camelo = new Animal("Camelo","Amarelo","Terrestre",4,15.0,2.0);
		System.out.println(camelo);
		
		Peixe tubarao = new Peixe("Tubarão","Cinza","","barbatanas e calda",0,300.,1.5);
		System.out.println(tubarao);
		
		Mamifero urso = new Mamifero("Urso","","","",4,1.80,0.5);
		System.out.println(urso);

	}

}
