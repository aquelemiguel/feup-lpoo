
public class TGV extends Comboio {

	public TGV(String nome) {
		this.nome = nome;
		ServicoPrioritario sp = new ServicoPrioritario();
		this.servico = sp;
	}
	
}
