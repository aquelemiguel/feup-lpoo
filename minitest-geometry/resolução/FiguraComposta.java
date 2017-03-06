package geometria;

public class FiguraComposta extends Figura implements Countable {
	
	Figura[] figuras;
	double area, perimetro;
	
	public FiguraComposta(Figura[] figuras) {
		this.figuras = figuras;
		for (int i = 0; i < figuras.length; i++){
			this.area += figuras[i].area;
		}
	}
	
	public double getArea(){
		return area;
	}
	
	public double getPerimetro(){
		return perimetro;
	}

	public int count() {
		return figuras.length;
	}

}
