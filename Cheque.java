public class Cheque extends TransacaoBancaria{
	Cliente fornecedor;
	Cliente recebedor;
	int valorDoCheque;

	public Cheque(Cliente fornecedor, Cliente recebedor, int valorDoCheque){
		this.fornecedor = fornecedor;
		this. recebedor = recebedor;
		this.valorDoCheque = valorDoCheque;
	}

	@Override
	public void transacionar(){
		int fornDin = this.fornecedor.getDinheiro();
		int receDin = this.recebedor.getDinheiro();

		fornDin -= this.valorDoCheque;
		receDin += this.valorDoCheque;

		this.fornecedor.setDinheiro(fornDin);
		this.recebedor.setDinheiro(receDin);
	}

	@Override
	public String detalhar(){
		return "Cheque escrito por "+this.fornecedor.getNome()+" do valor de "
					 +this.valorDoCheque+" foi recebido por "+this.recebedor.getNome()+" com sucesso.";
	}
}
