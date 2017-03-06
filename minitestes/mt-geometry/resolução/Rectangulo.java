package geometria;

public class Rectangulo extends Figura {

	int x1, y1, x2, y2;
	
	public Rectangulo(int x1, int y1, int x2, int y2) {
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
		this.area = Math.abs(x2-x1) * Math.abs(y2-y1);
		this.perimetro = 2 * Math.abs(x2-x1) + 2 * Math.abs(y2-y1);
	}

}
