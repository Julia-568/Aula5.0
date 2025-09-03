package AtividadesAula5;

public class PrincipalFuncionario {
	
	public static void main(String[] args) {
		Jornada funcionario1 = new Jornada(1, "Ana", "99999-1111", 101, "Rua A", 50.0, 160);
		Horista funcionario2 = new Horista(2, "Carlos", "98888-2222", 102, "Rua B", 40.0, 100);
		PessoaJuridica funcionario3 = new PessoaJuridica(3, "Empresa XYZ", "97777-3333", 103, "Av. Central", 10000.0, 2500.0);
		
		System.out.println(funcionario1.getNome() + " - Salário: R$ " + funcionario1.calculoSalario());
		System.out.println(funcionario2.getNome() + " - Salário: R$ " + funcionario2.calculoSalario());
		System.out.println(funcionario3.getNome() + " - Salário: R$ " + funcionario3.calculoSalario());
	}

}
