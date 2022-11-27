import java.util.List;

public class Efetuante {

	static public void efetua(List<TransacaoBancaria> transacoes){
		for(TransacaoBancaria t: transacoes){
			t.transacionar();
			t.detalhar();
		}
		
	}
}
