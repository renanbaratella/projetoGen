package LojaRPG.Pessoas;


public class Pessoa
{
	
	private String classe;
	private String raca;

	public Pessoa() {
		
	}
	
	public Pessoa(String raca, String classe) {
		this.raca = raca;
		this.classe = classe;
	}
	
	public String getClasse() {
		return classe;
	}
	
	public void setClasse(String classe) {
		this.classe = classe;
	}

	public String getRaca() {
		return raca;
	}

	public void setRaca(String raca) {
		this.raca = raca;
	}
	
	
}
