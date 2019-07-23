package cl.ibm.pkmn;

import java.util.List;

public class Pokemon{
 
		private String nombre;
		private int energia;
		private List<String> habilidades;
		private Tipo tipo;
		
	public Pokemon(String nombre, int energia, List<String> habilidades, Tipo tipo) {
			this.nombre = nombre;
			this.energia = energia;
			this.habilidades = habilidades;
			this.tipo = tipo;
		}


	public String getNombre() {
		return nombre;
	}



	public void setNombre(String nombre) {
		this.nombre = nombre;
	}



	public int getEnergia() {
		return energia;
	}



	public void setEnergia(int energia) {
		this.energia = energia;
	}



	public List<String> getHabilidades() {
		return habilidades;
	}



	public void setHabilidades(List<String> habilidades) {
		this.habilidades = habilidades;
	}



	public Tipo getTipo() {
		return tipo;
	}



	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}
	

}
