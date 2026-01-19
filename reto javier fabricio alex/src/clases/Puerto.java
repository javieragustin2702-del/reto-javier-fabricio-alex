package clases;

import java.util.ArrayList;
import clases.Barco;
public class Puerto {
	protected  ArrayList<Barco> puerto;
	
	
	public Puerto(ArrayList<Barco> puerto) {
		super();
		this.puerto = new ArrayList<Barco>();
	}


	public ArrayList<Barco> getPuerto() {
		return puerto;
	}


	public void setPuerto(ArrayList<Barco> puerto) {
		this.puerto = puerto;
	}


	public boolean entrarBarco(Barco b) {
		if (puerto.size() <6) {
			puerto.add(b);
			return true;
		}
		
		else {return false;}
	}
	
	public boolean salirBarco(String nombre) {
		for (Barco barco : puerto) {
			if(barco.getNombre().equals(nombre)) {
				puerto.remove(nombre); 
				return true;
			}
			else {
				return false;
			}
		}
		return false;
		}

		
	
	public double calcularPrecio(Barco b,int horas, double precioCombustible) {
		
		if (b.calcularAutonomia() < 0) {
		return -1;
	} else{
		return horas *b.getMotor().getConsumo() * precioCombustible;
	}
	
}


	@Override
	public String toString() {
		return "Puerto [puerto=" + puerto + "]";
	}
	
}
