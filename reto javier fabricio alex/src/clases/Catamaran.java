package clases;

public class Catamaran extends Barco{
	protected Motor motorSecundario;
	@Override
	protected double calcularAutonomia() {
		return (capacidadCombustible/motor.consumo + capacidadCombustible/motorSecundario.consumo)/2;
	}
	public Catamaran(String nombre, double capacidadCombustible, Motor motor, Motor motorSecundario) {
		super(nombre, capacidadCombustible, motor);
		this.motorSecundario = motorSecundario;
	}
	public Motor getMotorSecundario() {
		return motorSecundario;
	}
	public void setMotorSecundario(Motor motorSecundario) {
		this.motorSecundario = motorSecundario;
	}
	@Override
	public String toString() {
		return "Catamaran [motorSecundario=" + motorSecundario + "]";
	}
	
}
