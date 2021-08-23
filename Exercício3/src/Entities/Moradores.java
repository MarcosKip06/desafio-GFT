package Entities;

public class Moradores {
	
	private String telefone;
	private Integer numResidencia;
	
	
	public Moradores(String telefone, Integer numResidencia) {
		this.telefone = telefone;
		this.numResidencia = numResidencia;
	}


	public String getTelefone() {
		return telefone;
	}


	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}


	public Integer getNumResidencia() {
		return numResidencia;
	}


	public void setNumResidencia(Integer numResidencia) {
		this.numResidencia = numResidencia;
	}
	
	
	
	

}
