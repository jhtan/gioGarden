
public class Jardin {
	private int numDeArboles;
	private int numDeBancas;
	private int numDeCaminos;
	private int numDeFlores;
	private int numDeInsectos;
	private int numDeAguas;
	private Arbol[] arboles;
	private Banca[] bancas;
	private Camino[] caminos;
	private Flor[] flores;
	private Insecto[] insectos;
	private Agua[] aguas;

	public Jardin() {
		arboles = new Arbol [100];
		bancas = new Banca [100];
		caminos = new Camino [100];
		flores = new Flor [100];
		insectos = new Insecto[100];
		aguas = new Agua[100];
	}
	
	public void addArbol(Arbol a) {
		Arbol V[] = this.getArboles();
		int n = this.getNumDeArboles();
		V[n] = a;
		n++;
		this.setArboles(V);
		this.setNumDeArboles(n);
	}
	
	public void addBanca(Banca b) {
		Banca V[] = this.getBancas();
		int n = this.getNumDeBancas();
		V[n] = b;
		n++;
		this.setBancas(V);
		this.setNumDeBancas(n);
	}
	
	public void addCamino(Camino c) {
		Camino V[] = this.getCaminos();
		int n = this.getNumDeCaminos();
		V[n] = c;
		n++;
		this.setCaminos(V);
		this.setNumDeCaminos(n);
	}
	
	public void addFlor(Flor f) {
		Flor V[] = this.getFlores();
		int n = this.getNumDeFlores();
		V[n] = f;
		n++;
		this.setFlores(V);
		this.setNumDeFlores(n);
	}
	
	public void addInsecto(Insecto I) {
		Insecto V[] = this.getInsectos();
		int n = this.getNumDeInsectos();
		V[n] = I;
		n++;
		this.setInsectos(V);
		this.setNumDeInsectos(n);
	}
	
	public void addAgua(Agua A) {
		Agua V[] = this.getAguas();
		int n = this.getNumDeAguas();
		V[n] = A;
		n++;
		this.setAguas(V);
		this.setNumDeAguas(n);
	}
	
	public int getNumDeCaminos() {
		return numDeCaminos;
	}
	public void setNumDeCaminos(int numDeCaminos) {
		this.numDeCaminos = numDeCaminos;
	}
	public int getNumDeBancas() {
		return numDeBancas;
	}
	public void setNumDeBancas(int numDeBancas) {
		this.numDeBancas = numDeBancas;
	}	public Arbol[] getArboles() {
		return arboles;
	}

	public void setArboles(Arbol[] arboles) {
		this.arboles = arboles;
	}

	public Banca[] getBancas() {
		return bancas;
	}

	public void setBancas(Banca[] bancas) {
		this.bancas = bancas;
	}

	public Camino[] getCaminos() {
		return caminos;
	}

	public void setCaminos(Camino[] caminos) {
		this.caminos = caminos;
	}

	public Flor[] getFlores() {
		return flores;
	}

	public void setFlores(Flor[] flores) {
		this.flores = flores;
	}
	
	public int getNumDeArboles() {
		return numDeArboles;
	}

	public void setNumDeArboles(int numDeArboles) {
		this.numDeArboles = numDeArboles;
	}

	public int getNumDeFlores() {
		return numDeFlores;
	}

	public void setNumDeFlores(int numDeFlores) {
		this.numDeFlores = numDeFlores;
	}	
	
	public int getNumDeInsectos() {
		return numDeInsectos;
	}

	public void setNumDeInsectos(int numDeInsectos) {
		this.numDeInsectos = numDeInsectos;
	}

	public int getNumDeAguas() {
		return numDeAguas;
	}

	public void setNumDeAguas(int numDeAguas) {
		this.numDeAguas = numDeAguas;
	}
	
	public Insecto[] getInsectos() {
		return insectos;
	}

	public void setInsectos(Insecto[] insectos) {
		this.insectos = insectos;
	}

	public Agua[] getAguas() {
		return aguas;
	}

	public void setAguas(Agua[] aguas) {
		this.aguas = aguas;
	}

}
