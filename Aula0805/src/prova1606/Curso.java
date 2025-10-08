package prova1606;

public class Curso {
	
	protected String codigo;
	protected String nomeCurso;
	public Curso(String codigo, String nomeCurso) {
		super();
		this.codigo = codigo;
		this.nomeCurso = nomeCurso;
	}
	public String getCodigo() {
		return codigo;
	}
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	public String getNomeCurso() {
		return nomeCurso;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeCurso = nomeCurso;
	}
	public void verInfo() {
		System.out.println("Curso: " + nomeCurso + " código: " + codigo);
	}
}
