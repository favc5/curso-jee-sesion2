package cl.ibm.pkmn;

public class Tipo extends Pokemon {

	protected String tipos;
	private float factorDa�o;
	private String debilidad;
	
	public Tipo(String nombre, int energia, Habilidad habilidades, Tipo tipo, String tipos, float factorDa�o, String debilidad) {
		super(nombre, energia, habilidades, tipo);
		this.tipos=tipos;
		this.factorDa�o=factorDa�o;
		this.debilidad= debilidad;
		
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

	public float getFactorDa�o() {
		return factorDa�o;
	}

	public void setFactorDa�o(float factorDa�o) {
		this.factorDa�o = factorDa�o;
	}

	public String getDebilidad() {
		return debilidad;
	}

	public void setDebilidad(String debilidad) {
		this.debilidad = debilidad;
	}


	
}
