public class Saque extends TransacaoBancaria{
	Efetuante bancoDoCliente;
	Efetuante bancoDoValorTirado;
	Cliente cliente;
	int valorTirado;

	public Saque(Efetuante bancoDoCliente, Efetuante bancoDoValorTirado, Cliente cliente, int valorTirado){
		this.bancoDoCliente = bancoDoCliente;
		this.bancoDoValorTirado = bancoDoValorTirado;
		this.cliente = cliente;
		this.valorTirado = valorTirado;
	}

	@Override
	public String detalhar(){
		return "O cliente ("+this.cliente+") do banco "+this.bancoDoCliente+" sacou "+this.valorTirado+
					 " reais no caixa do banco"+this.bancoDoValorTirado;
	}
	
}
