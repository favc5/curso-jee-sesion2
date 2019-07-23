package cl.ibm.pkmn;

public class Habilidad extends Pokemon {
	
	public String NombreHabilidad;
	public int PuntosdeDa�o[];

	public Habilidad(String nombre, int energia, Habilidad habilidades, Tipo tipo, String nombreHabilidad,
			int[] puntosdeDa�o) {
		super(nombre, energia, habilidades, tipo);
		NombreHabilidad = nombreHabilidad;
		PuntosdeDa�o = puntosdeDa�o;
	}

	public String getNombreHabilidad() {
		return NombreHabilidad;
	}

	public void setNombreHabilidad(String nombreHabilidad) {
		NombreHabilidad = nombreHabilidad;
	}

	public int[] getPuntosdeDa�o() {
		return PuntosdeDa�o;
	}

	public void setPuntosdeDa�o(int[] puntosdeDa�o) {
		PuntosdeDa�o = puntosdeDa�o;
	}
	
	
}
