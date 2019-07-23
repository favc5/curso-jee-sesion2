package cl.ibm.pkmn;

import java.util.Arrays;
import java.util.List;

public class Habilidad {
	
	public String nombreHabilidad;
	public List<Integer> puntosdeDano;

	
	public Habilidad(String nombreHabilidad, List<Integer> puntosdeDaño) {
		this.nombreHabilidad = nombreHabilidad;
		this.puntosdeDano = puntosdeDaño;
	}

	public String getNombreHabilidad() {
		return nombreHabilidad;
	}

	public void setNombreHabilidad(String nombreHabilidad) {
		this.nombreHabilidad = nombreHabilidad;
	}

	public List<Integer> getPuntosdeDano() {
		return puntosdeDano;
	}

	public void setPuntosdeDano(List<Integer> puntosdeDano) {
		List<Integer> ptsdano = Arrays.asList(10, 5, 10, 10);
		this.puntosdeDano = ptsdano;
	}
	
	

}
