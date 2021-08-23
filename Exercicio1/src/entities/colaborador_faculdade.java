package entities;

public class colaborador_faculdade extends Colaborador {

	private String faculdade;

	public colaborador_faculdade(String nome, Integer matricula, String faculdade) {
		super(nome, matricula);
		this.faculdade = faculdade;
	}

	public String getFaculdade() {
		return faculdade;
	}

	public void setFaculdade(String faculdade) {
		this.faculdade = faculdade;
	}
	
	
}
