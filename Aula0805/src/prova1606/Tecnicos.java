package prova1606;

public class Tecnicos extends Funcionario {
	
	private String cargo;
	double auxTransporte = 250;
	double auxAlimentacao = 1000;
	double quantHoras = 100;
	

	public Tecnicos(String nomeFunc, String endereco, String telefone, String cpf, double salario, String cargo) {
		super(nomeFunc, endereco, telefone, cpf, salario);
		this.cargo = cargo;
	}

	public String getCargo() {
		return cargo;
	}

	public void setCargo(String cargo) {
		this.cargo = cargo;
	}
	public void calcsalario() {
		setSalario(getSalario() + auxTransporte + auxAlimentacao);
	}
	public double calcsalario(double quantHoras, double valorHoras) {
		double valorHora = 20;
		return salario = salario + auxTransporte + auxAlimentacao + (quantHoras * valorHora);
	}
	public void verInfo() {
		System.out.println("Nome do Tecnico: " + nomeFunc + " salario: " + salario);
	}
}
