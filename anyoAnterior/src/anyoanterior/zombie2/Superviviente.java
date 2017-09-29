package anyoanterior.zombie2;


// SUPERVIVIENTE------------------------------------------------------------------------------------------
//Creamos los supervivientes
public class Superviviente {
	private int vidas;
	private int nivel;
	private String nombre;
	private SkillsPersonaje skill;
	private Arma arma;
	private boolean puedoEscapar;

	
	// Superviviente novato que pide la pr�ctica
	public Superviviente() {
		this(3, 0, "desconocido", SkillsPersonaje.RAPIDO);
	}

	public Superviviente(int vidas, int nivel, String nombre, SkillsPersonaje skill) {
		this.vidas = vidas;
		this.nivel = nivel;
		this.nombre = nombre;
		this.skill = skill;
		this.puedoEscapar = false;
		this.arma = new Arma();
	}

	// HABILIDADES-------------------------------------------------------------------------------------------------
	// Case skill y su bonificaci�n
	public void bonificacionSkill() {
		switch (this.skill) {
		case RAPIDO:
			arma.setDanyo(2);
			break;
		case BUSCADOR:
			arma.setDanyo(2);
			arma.setDistancia(1);
			arma.setTipo(TipoArma.KATANA);
			break;
		case FORTACHON:
			vidas++;
			break;
		case ESCURRIDIZO:
			puedoEscapar = true;
			break;
		case AMBIDIESTRO:
			if (arma.getTipo() == TipoArma.PISTOLA) {
				arma.setAtaques(arma.getAtaques() * 2);
			}
		}
	}

	// Habilidad de escurridizo, para regenerarla
	public void resetPuedoEscapar() {
		if (skill == SkillsPersonaje.ESCURRIDIZO) {
			puedoEscapar = true;
		}
	}
	
	// VARIOS-------------------------------------------------------------------------------
	// Verificamos si el superviviente tiene arma
		public boolean tieneArma() {
			if (this.arma != null) {
				return true;
			} else {
				return false;
			}
		}

		// Borramos el arma
		public void deleteArma() {
			this.arma = null;
		}
		
		public boolean getPuedoEscapar() {
			return puedoEscapar;
		}
	

	// INFORMACI�N-------------------------------------------------------------------------------
	// Muestra la informaci�n b�sica del superviviente
	public void showInfoSuper() {
		System.out.println("Nombre del Super. : " + nombre);
		System.out.println("Vidas restantes : " + vidas);
	}

	// Muestra la informaci�n completa del superviviente
	public void showInfoSuper2() {
		System.out.println("Nombre del Super. : " + nombre);
		System.out.println("Vidas restantes : " + vidas);
		System.out.println("Habilidad : " + skill);
		System.out.println("Arma : " + arma.getTipo());
		System.out.println("Danyo :  " + arma.getDanyo());
		System.out.println("Ataques : " + arma.getAtaques());
		System.out.println("");
	}

	

	// Getters-----------------------------------------------------------------------
	public String getNombre() {
		return nombre;
	}
	
	public int getVidas() {
		return vidas;
	}

	public int getNivel() {
		return nivel;
	}
	
	public Arma getArma() {
		return arma;
	}


	public SkillsPersonaje getSkill() {
		return skill;
	}



	// Setters---------------------------------------------------------------------------
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	
	public void setVidas(int vidas) {
		this.vidas = vidas;
	}

	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public void setSkill(SkillsPersonaje skill) {
		this.skill = skill;
	}


	public void setPuedoEscapar(boolean puedoEscapar) {
		this.puedoEscapar = puedoEscapar;
	}
}
