package AtividadesAula5;

public class ObjetoVeiculo {
	
	public static void main(String[] args) {
		
		Ferrari ferrari = new Ferrari();
		ferrari.ligar();
		ferrari.desligar();
		ferrari.acelerar();
		ferrari.engatar();
		ferrari.manobrar();
		ferrari.frear();
		
		System.out.println();
		
		Onibus onibus = new Onibus();
		onibus.ligar();
		onibus.desligar();
		onibus.acelerar();
		onibus.engatar();
		onibus.manobrar();
		onibus.frear();	
	}

}
