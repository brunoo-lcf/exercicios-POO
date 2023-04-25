package POO;

import java.text.NumberFormat;

public class Funcionario {
	
	private String nome;
	private String cargo;
	private String setor;
	private double salario;
	private int idade;
	
	
	public Funcionario(String nome, String cargo, String setor, double salario, int idade) {
		super();
		this.nome = nome;
		this.cargo = cargo;
		this.setor = setor;
		this.salario = salario;
		this.idade = idade;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getCargo() {
		return cargo;
	}


	public void setCargo(String cargo) {
		this.cargo = cargo;
	}


	public String getSetor() {
		return setor;
	}


	public void setSetor(String setor) {
		this.setor = setor;
	}


	public double getSalario() {
		return salario;
	}


	public void setSalario(double salario) {
		this.salario = salario;
	}


	public int getIdade() {
		return idade;
	}


	public void setIdade(int idade) {
		this.idade = idade;
	}
	
	public String formatarMoeda() {
		NumberFormat nf = NumberFormat.getCurrencyInstance();
		nf.setMinimumFractionDigits(3);
		String formatoMoeda = nf.format(salario);
		return formatoMoeda;
	}
	
	public void visualizar() {
		System.out.println("Funcionario [nome=" + nome + ", cargo=" + cargo + ", setor=" + setor + ", salario= "+this.formatarMoeda()+", idade=" + idade + "]");
				
	}
	
	
	
}
