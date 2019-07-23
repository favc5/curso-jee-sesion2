package cl.ibm.pkmn;

public class Pokemon implements Fabrica{
<<<<<<< HEAD
 
		private String nombre;
		private int energia;
		private Habilidad habilidades;
		private Tipo tipo;
		
	
	public Pokemon(String nombre, int energia, Habilidad habilidades, Tipo tipo) {
			super();
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



	public void setEnergia() {
		int vida= (int)(Math.floor(Math.random()*(150-80+1)+80));
		this.energia = vida;
	}



	public Habilidad getHabilidades() {
		return habilidades;
	}



	public void setHabilidades(Habilidad habilidades) {
		this.habilidades = habilidades;
	}



	public Tipo getTipo() {
		return tipo;
	}



	public void setTipo(Tipo tipo) {
		this.tipo = tipo;
	}



	public void crearcaterpie() {
		
	}
	
	public void crearsquirtle() {
		
	}

	public void crearcharmander() {
	
	}
	
=======
	
	public class pokemon
	{
		
		public String nombre;
		public int energia;
		public Habilidad habilidades;
		public Tipo tipo;
	}
		
	

	@Override
	public void crearcaterpie() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearsquirtle() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void crearcharmander() {
		// TODO Auto-generated method stub
		
	}
	

>>>>>>> 4ff053488c1a44fe688ceeb11fc2a7a99d6d4907
}
