package elMain;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.random.RandomGenerator;

import clases.Barco;
import clases.Catamaran;
import clases.Lancha;
import clases.Motor;
import clases.Yate;
import clases.Puerto;

public class reto {

	public static void main(String[] args) {
		RandomGenerator rng = RandomGenerator.getDefault();
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		ArrayList<Motor> listaMotores = new ArrayList<>();
		ArrayList<Barco> listaBarcos = new ArrayList<>();
		double mayor = 0;
		double menor = 1000000000;
		String barcoGrande = "";
		String barcoPeque = "";
		for (int a = 1; a <= 5; a++) {
			Motor m = new Motor("motor" + a, rng.nextInt(300, 501), (rng.nextDouble(5, 11) * 100.0) / 100.0);
			listaMotores.add(m);
		}
		for (int a = 1; a <= 2; a++) {
			Lancha l = new Lancha("Lancha" + a, rng.nextInt(500, 1001), listaMotores.get(rng.nextInt(0, 4)), false);
			Yate y = new Yate("Yate" + a, rng.nextInt(500, 1001), listaMotores.get(rng.nextInt(0, 4)),
					rng.nextInt(50, 101));
			Catamaran c = new Catamaran("Catamara" + a, rng.nextInt(500, 1001), listaMotores.get(rng.nextInt(0, 4)),
					listaMotores.get(rng.nextInt(0, 4)));
			listaBarcos.add(c);
			listaBarcos.add(y);
			listaBarcos.add(l);
		}
		
		Puerto marina = new Puerto(listaBarcos);

		
		for (Barco barco : listaBarcos) {
			if(barco.calcularAutonomia() > mayor) {
				if(barco instanceof Lancha) {
					Lancha lancha = (Lancha) barco;
					barcoGrande = lancha.toString();
					
				} else if(barco instanceof Yate) {
					Yate yate = (Yate) barco;
					barcoGrande = yate.toString();
				} else {
					Catamaran catamaran = (Catamaran) barco;
					barcoGrande = catamaran.toString();
				}
				
			} else if(barco.calcularAutonomia() < menor) {
				if(barco instanceof Lancha) {
					Lancha lancha = (Lancha) barco;
					barcoPeque = lancha.toString();
					
				} else if(barco instanceof Yate) {
					Yate yate = (Yate) barco;
					barcoPeque = yate.toString();
				} else {
					Catamaran catamaran = (Catamaran) barco;
					barcoPeque = catamaran.toString();
				} 
		}
	}
		System.out.println(barcoGrande);
		System.out.println(barcoPeque);
		
		
		
		System.out.println(marina.salirBarco("Lancha1"));
		System.out.println(marina.salirBarco("Lancha3"));

	}
}
