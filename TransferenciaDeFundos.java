public class TransferenciaDeFundos extends TransacaoBancaria{
	Cliente fornecedor;
	Cliente recebedor;
	int valorDaTransferencia;

	public TransferenciaDeFundos(Cliente fornecedor, Cliente recebedor, int valorDaTransferencia){
		this.fornecedor = fornecedor;
		this. recebedor = recebedor;
		this.valorDaTransferencia = valorDaTransferencia;
	}

	public void transacao(Cliente fornecedor, Cliente recebedor, int quanto){
		super.transacao(fornecedor, recebedor, quanto);
	}

	@Override
	public String detalhar(){
		return "Transferencia de fundos feita por "+this.fornecedor.getNome()+" no valor de "
					 +this.valorDaTransferencia+" foi recebido por "+this.recebedor.getNome()+" com sucesso.";
	}

}
