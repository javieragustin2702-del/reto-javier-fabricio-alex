package clases;

public class Barco{
	protected String nombre;
	protected double capacidadCombustible;
	protected Motor motor;
	protected double calcularAutonomia() {
		return capacidadCombustible/motor.consumo;
	}
	public Barco(String nombre, double capacidadCombustible, Motor motor) {
		super();
		this.nombre = nombre;
		this.capacidadCombustible = capacidadCombustible;
		this.motor = motor;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public double getCapacidadCombustible() {
		return capacidadCombustible;
	}
	public void setCapacidadCombustible(double capacidadCombustible) {
		this.capacidadCombustible = capacidadCombustible;
	}
	public Motor getMotor() {
		return motor;
	}
	public void setMotor(Motor motor) {
		this.motor = motor;
	}
	@Override
	public String toString() {
		return "Barco [nombre=" + nombre + ", capacidadCombustible=" + capacidadCombustible + ", motor=" + motor + "]";
	}
	
	}
