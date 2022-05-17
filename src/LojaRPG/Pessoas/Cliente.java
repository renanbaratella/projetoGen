package LojaRPG.Pessoas;


import java.util.Random;




public class Cliente extends Pessoa
{

	Random rand = new Random();
	
	public int crf;
	public double saldo;
//	public List<Item> pocoesCliente = new ArrayList<>();
	
	
	public Cliente() {
	}
	
	public Cliente(String raca, String classe) {
		super(raca, classe);
		this.crf = geradorCRF();
	}
	
	public int geradorCRF()
	{
		return this.crf = rand.nextInt(100000,999999);
		
	}

	public int getCrf() {
		return crf;
	}

	public void setCrf(int crf) {
		this.crf = crf;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}


	public String status() {
		return getClasse() + "\n" + getRaca() + "\n" + getCrf() + "\n" + getSaldo();
	}
	


	
}