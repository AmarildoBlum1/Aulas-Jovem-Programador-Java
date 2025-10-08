package prova1606;

public class Professor extends Funcionario {
	
	private String intitulacao;
	double valorDedicacaoExclusiva = 200;
	double retribTitulacao = 150;

	public Professor(String nome, String endereco, String telefone, String cpf, double salario, String intitulacao) {
		super(nome, endereco, telefone, cpf, salario);
		this.intitulacao = intitulacao;
	}
	public String getIntitulacao() {
		return intitulacao;
	}
	public void setIntitulacao(String intitulacao) {
		this.intitulacao = intitulacao;
	}
	public double getValorDedicacaoExclusiva() {
		return valorDedicacaoExclusiva;
	}
	public void setValorDedicacaoExclusiva(double valorDedicacaoExclusiva) {
		this.valorDedicacaoExclusiva = valorDedicacaoExclusiva;
	}
	public double getRetribTitulacao() {
		return retribTitulacao;
	}
	public void setRetribTitulacao(double retribTitulacao) {
		this.retribTitulacao = retribTitulacao;
	}
	public void calcasalario() {
		setSalario(getSalario() + valorDedicacaoExclusiva + retribTitulacao);
		
	}
	public void mostrarInfo() {
	System.out.println("Nome do professor : " + nomeFunc + " salario: " + salario);
	}
}
