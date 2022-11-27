public class TransferenciaDeFundos extends TransacaoBancaria{
	Cliente fornecedor;
	Cliente recebedor;
	int valorDaTransferencia;

	public TransferenciaDeFundos(Cliente fornecedor, Cliente recebedor, int valorDaTransferencia){
		this.fornecedor = fornecedor;
		this. recebedor = recebedor;
		this.valorDaTransferencia = valorDaTransferencia;
	}

	@Override
	public void transacionar(){
		int fornDin = this.fornecedor.getDinheiro();
		int receDin = this.recebedor.getDinheiro();

		fornDin -= this.valorDaTransferencia;
		receDin += this.valorDaTransferencia;

		this.fornecedor.setDinheiro(fornDin);
		this.recebedor.setDinheiro(receDin);
	}

	@Override
	public String detalhar(){
		return "Transferencia de fundos feita por "+this.fornecedor.getNome()+" no valor de "
					 +this.valorDaTransferencia+" foi recebido por "+this.recebedor.getNome()+" com sucesso.";
	}

}
