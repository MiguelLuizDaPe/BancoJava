import java.util.ArrayList;
import java.util.List;

public class Efetuante {
	static ArrayList<String> log;

	public void efetua(List<TransacaoBancaria> transacoes){
		for(TransacaoBancaria t: transacoes){
			t.transacao();
			log.add(t.detalhar());
		}
	}
}
