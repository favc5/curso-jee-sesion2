package cl.ibm.pkmn;

public class Tipo extends Pokemon {

	protected String tipos;
	private float factorDaño;
	private String debilidad;
	
	public Tipo(String nombre, int energia, Habilidad habilidades, Tipo tipo, String tipos, float factorDaño, String debilidad) {
		super(nombre, energia, habilidades, tipo);
		this.tipos=tipos;
		this.factorDaño=factorDaño;
		this.debilidad= debilidad;
		
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

	public float getFactorDaño() {
		return factorDaño;
	}

	public void setFactorDaño(float factorDaño) {
		this.factorDaño = factorDaño;
	}

	public String getDebilidad() {
		return debilidad;
	}

	public void setDebilidad(String debilidad) {
		this.debilidad = debilidad;
	}


	
}
