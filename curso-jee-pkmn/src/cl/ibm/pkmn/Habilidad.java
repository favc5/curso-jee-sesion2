package cl.ibm.pkmn;

public class Habilidad extends Pokemon {
	
	public String NombreHabilidad;
	public int PuntosdeDaņo[];

<<<<<<< HEAD
	public Habilidad(String nombre, int energia, Habilidad habilidades, Tipo tipo) {
		super(nombre, energia, habilidades, tipo);
		// TODO Auto-generated constructor stub
	}

=======
	public Habilidad(String nombre, int energia, Habilidad habilidades, Tipo tipo, String nombreHabilidad,
			int[] puntosdeDaņo) {
		super(nombre, energia, habilidades, tipo);
		NombreHabilidad = nombreHabilidad;
		PuntosdeDaņo = puntosdeDaņo;
	}

	public String getNombreHabilidad() {
		return NombreHabilidad;
	}

	public void setNombreHabilidad(String nombreHabilidad) {
		NombreHabilidad = nombreHabilidad;
	}

	public int[] getPuntosdeDaņo() {
		return PuntosdeDaņo;
	}

	public void setPuntosdeDaņo(int[] puntosdeDaņo) {
		PuntosdeDaņo = puntosdeDaņo;
	}
	
	
>>>>>>> f44d47046a277e1ecb7f94b02ed4e8081e798803
}
