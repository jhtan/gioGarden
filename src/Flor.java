
public class Flor extends Planta {
	private int numDePetalos;
	private int color;
	private Petalo[] petalos;
	
	public Flor() {
		
	}
	
	public int getNumDePetalos() {
		return numDePetalos;
	}
	public void setNumDePetalos(int numDePetalos) {
		this.numDePetalos = numDePetalos;
	}
	public int getColor() {
		return color;
	}
	public void setColor(int color) {
		this.color = color;
	}

	public Petalo[] getPetalos() {
		return petalos;
	}

	public void setPetalos(Petalo[] petalos) {
		this.petalos = petalos;
	}
}
