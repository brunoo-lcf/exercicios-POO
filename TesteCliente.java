package POO;

public class TesteCliente {

	public static void main(String[] args) {
		
		Cliente cliente1 = new Cliente("Bruno","Masculino",22,1.80,73);
		
		cliente1.visualizar();
		
		Cliente cliente2 = new Cliente("Bianca","Feminino",20,1.57,55);
		
		cliente2.visualizar();

	}

}
