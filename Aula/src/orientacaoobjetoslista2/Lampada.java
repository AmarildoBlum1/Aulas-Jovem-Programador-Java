package orientacaoobjetoslista2;

public class Lampada {
	
	private String marca;
	private String tipo;
	private double potência;
	private double vidautil;
	private boolean ligada;
	
	
	Lampada(String marca, String tipo, double potência, double vidautil, boolean ligada) {	
		
	this.marca = marca;
	this.tipo = tipo;
	this.potência = potência;
	this.vidautil = vidautil;
	this.ligada = ligada;
	}
	
	public void ligarlampada() {
		this.ligada = true;
		}
		
	public void desligarLampada() {
		this.ligada = false;
		
		
	}

	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	public double getPotência() {
		return potência;
	}

	public void setPotência(double potência) {
		this.potência = potência;
	}

	public double getVidautil() {
		return vidautil;
	}

	public void setVidautil(double vidautil) {
		this.vidautil = vidautil;
	}

	public boolean isLigada() {
		return ligada;
	}

	public void setLigada(boolean ligada) {
		this.ligada = ligada;
	}
}




