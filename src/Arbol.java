
public class Arbol {
	private int numDeRamas;
	private int numDeFrutos;
	private int nombre;
	private Rama[] ramas;
	private Fruto[] frutos;
	
	public Arbol() {
		
	}
	
	public int getNumDeRamas() {
		return numDeRamas;
	}
	public void setNumDeRamas(int numDeRamas) {
		this.numDeRamas = numDeRamas;
	}
	public int getNombre() {
		return nombre;
	}
	public void setNombre(int nombre) {
		this.nombre = nombre;
	}

	public Rama[] getRamas() {
		return ramas;
	}

	public void setRamas(Rama[] ramas) {
		this.ramas = ramas;
	}

	public int getNumDeFrutos() {
		return numDeFrutos;
	}

	public void setNumDeFrutos(int numDeFrutos) {
		this.numDeFrutos = numDeFrutos;
	}

	public Fruto[] getFrutos() {
		return frutos;
	}

	public void setFrutos(Fruto[] frutos) {
		this.frutos = frutos;
	}
}
