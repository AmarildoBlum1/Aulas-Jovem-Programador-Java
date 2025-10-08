package prova1606;

public abstract class Funcionario {
	
	protected String nomeFunc;
	protected String endereco;
	protected String telefone;
	protected String cpf;
	protected double salario;
	
	public Funcionario(String nome, String endereco, String telefone, String cpf, double salario) {
		super();
		this.nomeFunc = nome;
		this.endereco = endereco;
		this.telefone = telefone;
		this.cpf = cpf;
		this.salario = salario;
	}
	public String getNome() {
		return nomeFunc;
	}
	public void setNome(String nome) {
		this.nomeFunc = nome;
	}
	public String getEndereco() {
		return endereco;
	}
	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public double getSalario() {
		return salario;
	}
	public void setSalario(double salario) {
		this.salario = salario;
	}
	public void calcsalario() {
	}
}
