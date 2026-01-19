package clases;

public class Yate extends Barco {
	protected int camarotes;

	public Yate(String nombre, double capacidadCombustible, Motor motor, int camarotes) {
		super(nombre, capacidadCombustible, motor);
		this.camarotes = camarotes;
	}

	public int getCamarotes() {
		return camarotes;
	}

	public void setCamarotes(int camarotes) {
		this.camarotes = camarotes;
	}

	@Override
	public String toString() {
		return "Yate [camarotes=" + camarotes + "]";
	}
	
}
