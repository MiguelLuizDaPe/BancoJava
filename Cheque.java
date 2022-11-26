public class Cheque extends TransacaoBancaria{
	Cliente fornecedor;
	Cliente recebedor;
	int valorDoCheque;

	public Cheque(Cliente fornecedor, Cliente recebedor, int valorDoCheque){
		this.fornecedor = fornecedor;
		this. recebedor = recebedor;
		this.valorDoCheque = valorDoCheque;
	}

	public void transacao(Cliente fornecedor, Cliente recebedor, int quanto){
		super.transacao(fornecedor, recebedor, quanto);
	}

	@Override
	public String detalhar(){
		return "Cheque escrito por "+this.fornecedor.getNome()+" do valor de "
					 +this.valorDoCheque+" foi recebido por "+this.recebedor.getNome()+" com sucesso.";
	}
}
