package cl.ibm.pkmn;

public class Habilidad extends Pokemon {
	
	public String NombreHabilidad;
	public int PuntosdeDaño[];

<<<<<<< HEAD
	public Habilidad(String nombre, int energia, Habilidad habilidades, Tipo tipo) {
		super(nombre, energia, habilidades, tipo);
		// TODO Auto-generated constructor stub
	}

=======
	public Habilidad(String nombre, int energia, Habilidad habilidades, Tipo tipo, String nombreHabilidad,
			int[] puntosdeDaño) {
		super(nombre, energia, habilidades, tipo);
		NombreHabilidad = nombreHabilidad;
		PuntosdeDaño = puntosdeDaño;
	}

	public String getNombreHabilidad() {
		return NombreHabilidad;
	}

	public void setNombreHabilidad(String nombreHabilidad) {
		NombreHabilidad = nombreHabilidad;
	}

	public int[] getPuntosdeDaño() {
		return PuntosdeDaño;
	}

	public void setPuntosdeDaño(int[] puntosdeDaño) {
		PuntosdeDaño = puntosdeDaño;
	}
	
	
>>>>>>> f44d47046a277e1ecb7f94b02ed4e8081e798803
}
