package geometria;

public class Circulo extends Figura {

	Ponto centro;
	int raio;
	
	public Circulo(Ponto centro, int raio) {
		if (raio < 0){
			throw new IllegalArgumentException();
		}
		this.centro = centro;
		this.raio = raio;
		this.area = Math.PI * Math.pow(this.raio, 2);
	}

	public int getRaio() {
		return raio;
	}

	public Ponto getCentro() {
		return centro;
	}

}
