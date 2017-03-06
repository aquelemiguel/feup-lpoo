package geometria;

public class Ponto implements Comparable<Ponto> {

	int x, y;
	
	public Ponto(int x, int y) {
		this.x = x;
		this.y = y;
	}
	
	@Override
	public String toString(){
		return "(" + this.x + ", " + this.y + ")";
	}
	
	@Override
	public boolean equals(Object obj){
		Ponto that = (Ponto) obj;
		if (this.x == that.x && this.y == that.y){
			return true;
		}
		return false;
	}
	
	@Override
	public int compareTo(Ponto that) {
		if (this.x == that.x){
			if (this.y > that.y){
				return 1;
			}else{
				return 0;
			}
		}
		else if (this.x > that.x){
			return 1;
		}
		else if (this.x < that.x){
			return 0;
		}
		return -1;
	}

	public int getX() {
		return x;
	}

	public int getY() {
		return y;
	}

}
