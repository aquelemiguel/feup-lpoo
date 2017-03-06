import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

public class Comboio {

	protected String nome, descricaoServico;
	protected int numPassageiros;
	protected ArrayList<Carruagem> carruagens = new ArrayList<Carruagem>();
	protected ServicoABordo servico;
	
	public Comboio(){
		super();
	}
	
	public Comboio(String nome) {
		this.nome = nome;
		ServicoRegular sr = new ServicoRegular();
		this.servico = sr;
	}

	public String getNome() {
		return nome;
	}

	public int getNumLugares() {
		int capacidade = 0;
		for (int i = 0; i < carruagens.size(); i++){
			capacidade += carruagens.get(i).getNumLugares();
		}
		return capacidade;
	}
	
	public int getNumCarruagens() {
		return carruagens.size();
	}

	public void addCarruagem(Carruagem a1) {
		carruagens.add(a1);
	}

	public Carruagem getCarruagemByOrder(int index) {
		return carruagens.get(index);
	}

	public void removeAllCarruagens(int capacidade) {
		for (int i = 0; i < carruagens.size(); i++){
			if (carruagens.get(i).getNumLugares() == capacidade){
				carruagens.remove(i);
				i--;
			}
		}
		return;
	}

	public int getNumPassageiros() {
		return numPassageiros;
	}

	public int getLugaresLivres() {
		return getNumLugares() - numPassageiros;
	}

	public void addPassageiros(int passageiros) throws PassengerCapacityExceeded {
		if (getLugaresLivres() < passageiros){
			throw new PassengerCapacityExceeded();
		}
		numPassageiros += passageiros;
		return;
	}

	public void removePassageiros() {
		numPassageiros = 0;
		return;
	}
	
	public void removePassageiros(int passageiros) {
		numPassageiros -= passageiros;
		return;
	}
	
	@Override
	public String toString(){
		String message = getClass().getName() + " " + this.nome + ", " + this.getNumCarruagens();
		
		if (this.getNumCarruagens() == 1){
			message += " carruagem, ";
		}else{
			message += " carruagens, ";
		}
		
		message += getNumLugares();
		if (this.getNumLugares() == 1){
			message += " lugar, ";
		}else{
			message += " lugares, ";
		}
		
		message += getNumPassageiros();
		if (this.getNumPassageiros() == 1){
			message += " passageiro";
		}else{
			message += " passageiros";
		}
		return message;
	}
	
	@Override
	public boolean equals(Object obj){
		Comboio that = (Comboio) obj;
		
		if (this.getNumCarruagens() == that.getNumCarruagens() && this.getNumLugares() == this.getNumLugares()){
			for (int i = 0; i < this.getNumCarruagens(); i++){
				if (this.getCarruagemByOrder(i).getNumLugares() != that.getCarruagemByOrder(i).getNumLugares()){
					return false;
				}
			}
			return true;
		}
		return false;
	}

	public ServicoABordo getServicoABordo() {
		return this.servico;
	}

	public Object getDescricaoServico() {
		return this.servico.getDescricao();
	}

	public void setServicoABordo(ServicoPrioritario servicoPrioritario) {
		this.servico = servicoPrioritario;
		return;
	}
	
}
