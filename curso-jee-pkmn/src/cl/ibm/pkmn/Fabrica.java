package cl.ibm.pkmn;

import java.util.Arrays;
import java.util.List;

public class Fabrica {

	public Pokemon crearcaterpie()	{
		
		
		String nombre="Caterpie";
		int vida= (int)(Math.floor(Math.random()*(150-80+1)+80));
		
		List<String> habilidad= Arrays.asList("Placaje", "Absorber", "Fortaleza", "Disparo Veneno") ;
	
		Tipo tipo= new Tipo("Hoja");
		
		Pokemon p1 = new Pokemon(nombre, vida, habilidad, tipo);
		return p1;
	}
	
	public Pokemon crearcharmander() {
		String nombre="Charmander";
		int vida= (int)(Math.floor(Math.random()*(150-80+1)+80));
		
		List<String> habilidad= Arrays.asList("Lanzallamas", "Ascuas", "Placaje", "Aro de Fuego") ;
	
		Tipo tipo= new Tipo("Fuego");
		
		Pokemon p2 = new Pokemon(nombre, vida, habilidad, tipo);
		return p2;
		
	}
	
	public Pokemon crearsquirtle() {
		String nombre="Squirtle";
		int vida= (int)(Math.floor(Math.random()*(150-80+1)+80));
		
		List<String> habilidad= Arrays.asList("Pistola de Agua", "Placaje", "Bomba de Agua", "Surf") ;
	
		Tipo tipo= new Tipo("Agua");
		
		Pokemon p3 = new Pokemon(nombre, vida, habilidad, tipo);
		return p3;
	}
}
