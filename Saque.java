public class Saque extends TransacaoBancaria{
	String bancoDoCliente;
	String bancoDoValorTirado;
	Cliente cliente;
	int valorTirado;

	public Saque(String bancoDoCliente, String bancoDoValorTirado, Cliente cliente, int valorTirado){
		this.bancoDoCliente = bancoDoCliente;
		this.bancoDoValorTirado = bancoDoValorTirado;
		this.cliente = cliente;
		this.valorTirado = valorTirado;
	}

	@Override
	public void transacao(){
		int clienteDin = this.cliente.getDinheiro();
		clienteDin -= this.valorTirado;
		this.cliente.setDinheiro(clienteDin);
	}

	@Override
	public String detalhar(){
		return "O cliente ("+this.cliente.getNome()+") do banco "+this.bancoDoCliente+" sacou "+this.valorTirado+
					 " reais no caixa do banco"+this.bancoDoValorTirado;
	}
	
}
