package prova1606;

public class Disciplina {
	
	private int codigoCurso;
	private String nomeDisciplina;
	private int CargaHoraria;
	
	public Disciplina(String nomeDisciplina, int codigoCurso, int cargaHoraria) {
		codigoCurso = codigoCurso;
		nomeDisciplina = nomeDisciplina;
		CargaHoraria = cargaHoraria;
	}
	public int getCodigoCurso() {
		return codigoCurso;
	}
	public void setCodigoCurso(int codigoCurso) {
		this.codigoCurso = codigoCurso;
	}
	public String getNomeCurso() {
		return nomeDisciplina;
	}
	public void setNomeCurso(String nomeCurso) {
		this.nomeDisciplina = nomeCurso;
	}
	public int getCargaHoraria() {
		return CargaHoraria;
	}
	public void setCargaHoraria(int cargaHoraria) {
		CargaHoraria = cargaHoraria;
	}
}
