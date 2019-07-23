package cl.ibm.pkmn;

public class Tipo extends Pokemon {

	protected String tipos;
	private float factorDano;
	private String debilidad;
	
	public Tipo(String nombre, int energia, Habilidad habilidades, Tipo tipo, String tipos, float factorDano, String debilidad) {
		super(nombre, energia, habilidades, tipo);
		this.tipos=tipos;
		this.factorDano=factorDano;
		this.debilidad= debilidad;
		
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

	public float getFactorDaño() {
		return factorDano;
	}

	public void setFactorDaño(float factorDano) {
		this.factorDano = factorDano;
	}

	public String getDebilidad() {
		return debilidad;
	}

	public void setDebilidad(String debilidad) {
		this.debilidad = debilidad;
	}


	
}
