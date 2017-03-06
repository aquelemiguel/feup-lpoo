
public class Pendular extends Comboio {

	public Pendular(String nome) {
		this.nome = nome;
		ServicoSemEnjoos sse = new ServicoSemEnjoos();
		this.servico = sse;
	}

}
