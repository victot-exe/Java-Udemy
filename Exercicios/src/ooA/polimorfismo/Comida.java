package src.ooA.polimorfismo;

public abstract class Comida {//class abstract não pode ser instanceada

	private double peso;

	protected Comida(double peso) {
		setPeso(peso);
	}

	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		if (peso >= 0) {
			this.peso = peso;
		}
	}
}