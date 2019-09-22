package cc.code;
import cc.code.model.Pessoa;
import cc.code.service.ImpressaoService;

import java.util.*;

/**
 * Relatório de pessoas
 * @author Deus
 */
public class Application {

	/**
	 * codigo principal
	 * @param args
	 */
	public static void main(String[] args) {
		List<Pessoa> listPessoas = new ArrayList<>();
		
		Pessoa p = new Pessoa();
		p.setName("Roberto");
		p.setCpf("02579742026");
		ArrayList<String> pessoaTelefonesFixos = new ArrayList<String>();
		pessoaTelefonesFixos.add("5134031195");
		p.setTelefonesFixos(pessoaTelefonesFixos);
		ArrayList<String> pessoaTelefonesCelulares = new ArrayList<String>();
		pessoaTelefonesCelulares.add("5199668550");
		p.setTelefonesCelulares(pessoaTelefonesCelulares);
		listPessoas.add(p);

		Pessoa p2 = new Pessoa();
		p2.setName("Rafaella");
		p2.setCpf("02579742025");
		p2.setTelefonesCelulares(pessoaTelefonesFixos);
		listPessoas.add(p2);

		ImpressaoService service = new ImpressaoService();
		service.imprimirPessoas(listPessoas);
	}
}