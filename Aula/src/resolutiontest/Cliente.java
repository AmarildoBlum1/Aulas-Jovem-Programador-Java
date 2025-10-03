package resolutiontest;

public class Cliente {
	
	private int age;
	private String cpf;
	private String name;
	private Double income;
	private String location;
	private double emprestimopretendido;
	private double juros;
	
	public Cliente(int age, String cpf, String name, Double income, String location, double emprestimopretendido, double juros) {
		super();
		this.age = age;
		this.cpf = cpf;
		this.name = name;
		this.income = income;
		this.location = location;
		this.emprestimopretendido = emprestimopretendido;
		this.juros = juros;
	}

	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getCpf() {
		return cpf;
	}
	public void setCpf(String cpf) {
		this.cpf = cpf;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getIncome() {
		return income;
	}
	public void setIncome(Double income) {
		this.income = income;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public double getEmprestimopretendido() {
		return emprestimopretendido;
		
	}
	public double getJuros() {
		return juros;
	}

	public void setJuros(double juros) {
		this.juros = juros;
	}

	public void setEmprestimopretendido(double emprestimopretendido) {
		this.emprestimopretendido = emprestimopretendido;
	}
	
	public Double EmprestimoPessoal() {
		double emprestimoPessoal = (emprestimopretendido * 0.04);
		return emprestimoPessoal + emprestimopretendido;
	}
	
	public Double EmprestimoConsignado() {
		double emprestimoconsignado = (emprestimopretendido * 0.02);
		return emprestimoconsignado + emprestimopretendido;
	}
	
	public Double EmprestimoComGarantia() {
		double emprestimocomgarantia = (emprestimopretendido * 0.03);
		return emprestimocomgarantia + emprestimopretendido;
	}
}
