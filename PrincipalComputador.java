package AtividadesAula5;

public class PrincipalComputador {
	
	public static void main(String[] args) {
		
		Gamer gamer = new Gamer();
		gamer.ligar();
		gamer.reiniciar();
		gamer.desligar();
		gamer.carregamentoSistema();
		
		System.out.println();
		
		Home home = new Home();
		home.ligar();
		home.reiniciar();
		home.desligar();
		home.carregamentoSistema();
	}

}
