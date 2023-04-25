package POO;

public class TesteFuncionario {

	public static void main(String[] args) {
		
		Funcionario funcionario1 = new Funcionario("Bruno","Junior","DevWeb",5.700,22);
		
		funcionario1.visualizar();
		
		Funcionario funcionario2 = new Funcionario("\nBianca","Pleno","DevWeb",9.700,20);
		
		funcionario2.visualizar();
	}

}
