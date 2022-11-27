import java.util.ArrayList;
import java.util.List;
public class Principal {

	public static void main(String[] args){
		List<Cliente> clientes = new ArrayList<Cliente>();
		List<TransacaoBancaria> transacoes = new ArrayList<TransacaoBancaria>();

		Cliente pedro = new Cliente("Pedro", 400, "Brasil");
		Cliente maria = new Cliente("Maria", 1000, "Claro");
		Cliente denis = new Cliente("Denis", 170, "Claro");
		Cliente tunico = new Cliente("Tunico", 1, "Santander");
		Cliente yago = new Cliente("Yago", 1060, "Oi");
		Cliente mendes = new Cliente("Mendes", 1000, "Claro");
		Cliente nicolax = new Cliente("Nicolax", 100, "Pipa");

		clientes.add(pedro);
		clientes.add(maria);
		clientes.add(denis);
		clientes.add(tunico);
		clientes.add(yago);
		clientes.add(mendes);
		clientes.add(nicolax);

		TransacaoBancaria mariaToPedroC = new Cheque(maria, pedro, 200);
		TransacaoBancaria pedroToDenisC = new Cheque(pedro, denis, 100);
		TransacaoBancaria pedroToMendesC = new Cheque(pedro, mendes, 400);

		transacoes.add(mariaToPedroC);
		transacoes.add(pedroToDenisC);
		transacoes.add(pedroToMendesC);


		System.out.println(pedro.getNome()+pedro.getDinheiro());

		Efetuante.efetua(transacoes);

		System.out.println(pedro.getNome()+pedro.getDinheiro());


	}
	
}