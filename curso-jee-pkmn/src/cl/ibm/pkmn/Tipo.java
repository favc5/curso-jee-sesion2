package cl.ibm.pkmn;

public class Tipo {

	protected String tipos;
	//private float factorDano;
	//private String debilidad;
	
	public Tipo(String tipos) {
		this.tipos=tipos;
		//this.factorDano=factorDano;
		//this.debilidad= debilidad;	
	}

	public String getTipos() {
		return tipos;
	}

	public void setTipos(String tipos) {
		this.tipos = tipos;
	}

	/*
	 * public float getFactorDa�o() { return factorDano; }
	 * 
	 * public void setFactorDa�o(float factorDano) { this.factorDano = factorDano; }
	 * 
	 * public String getDebilidad() { return debilidad; }
	 * 
	 * public void setDebilidad(String debilidad) { this.debilidad = debilidad; }
	 * 
	 */
	
}
