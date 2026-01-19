package clases;

public class Lancha extends Barco{
	protected boolean cubierta;

	public Lancha(String nombre, double capacidadCombustible, Motor motor, boolean cubierta) {
		super(nombre, capacidadCombustible, motor);
		this.cubierta = cubierta;
	}

	public boolean isCubierta() {
		return cubierta;
	}

	public void setCubierta(boolean cubierta) {
		this.cubierta = cubierta;
	}

	@Override
	public String toString() {
		return "Lancha [cubierta=" + cubierta + ", nombre=" + nombre + ", capacidadCombustible=" + capacidadCombustible
				+ ", motor=" + motor + "]";
	}

	

}
