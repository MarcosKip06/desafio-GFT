package entities;

public class Colaborador_escola extends Colaborador {
	
	private String escola;

	public Colaborador_escola(String nome, Integer matricula, String escola) {
		super(nome, matricula);
		this.escola = escola;
	}

	public String getEscola() {
		return escola;
	}

	public void setEscola(String escola) {
		this.escola = escola;
	}
	
	
	
}


