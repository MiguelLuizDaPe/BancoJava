public class Cliente {
	private String nome;
	private int dinheiroConta;
	String banco;

	public Cliente(String nome, int dinheiroConta, String banco){
		this.nome = nome;
		this.dinheiroConta = dinheiroConta;
		this.banco = banco;
	}

	public String getNome() {
		return nome;
	}

	public void setDinheiro(int dinheiroConta) {
		this.dinheiroConta = dinheiroConta;
	}	
	public int getDinheiro() {
		return dinheiroConta;
	}
}
