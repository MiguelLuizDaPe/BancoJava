public abstract class TransacaoBancaria {
	
	public void transacao(Cliente fornecedor, Cliente recebedor, int quanto){
		int fornDin = fornecedor.getDinheiro();
		int receDin = recebedor.getDinheiro();

		fornDin -= quanto;
		receDin += quanto;

		fornecedor.setDinheiro(fornDin);
		recebedor.setDinheiro(receDin);
	}

	public String detalhar(){
		return "yes";
	};

}
