package cl.ibm.pkmn;

public class Habilidad extends Pokemon {
	
	public String NombreHabilidad;
	public int PuntosdeDano[];

	public Habilidad(String nombre, int energia, Habilidad habilidades, Tipo tipo) {
		super(nombre, energia, habilidades, tipo);
		// TODO Auto-generated constructor stub
	}


	public Habilidad(String nombre, int energia, Habilidad habilidades, Tipo tipo, String nombreHabilidad,
			int[] puntosdeDaņo) {
		super(nombre, energia, habilidades, tipo);
		NombreHabilidad = nombreHabilidad;
		PuntosdeDano = puntosdeDaņo;
	}

	public String getNombreHabilidad() {
		return NombreHabilidad;
	}

	public void setNombreHabilidad(String nombreHabilidad) {
		NombreHabilidad = nombreHabilidad;
	}

	public int[] getPuntosdeDano() {
		return PuntosdeDano;
	}

	public void setPuntosdeDano(int[] puntosdeDaņo) {
		PuntosdeDano = puntosdeDaņo;
	}
	
	

}
