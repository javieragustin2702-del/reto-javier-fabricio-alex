package elMain;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;
import java.util.random.RandomGenerator;

import clases.Barco;
import clases.Lancha;
import clases.Motor;

public class reto {

	public static void main(String[] args) {
		RandomGenerator rng = RandomGenerator.getDefault();
		Scanner sc = new Scanner(System.in).useLocale(Locale.US);
		ArrayList<Motor> listaMotores = new ArrayList<>();
		ArrayList<Barco> listaBarcos = new ArrayList<>();
		Puerto Marina = new Puerto(listaBarcos);
		for(int a = 1; a <= 5; a++) {
			Motor m = new Motor("motor" + a, rng.nextInt(300,501),(rng.nextDouble(5,11) * 100.0) / 100.0);
			listaMotores.add(m);
		}
		for(int a = 1; a <= 2; a++) {
			Lancha l = new Lancha("Lancha" + listaMotores.get(rng.nextInt(0,4)), a, null, false)
		}
	}

}
