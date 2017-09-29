import java.util.ArrayList;

public class Serie {
	
//atributos
	private String titulo ="default";
	private int temporadas = 3;
	private int[] captemporadas = new int [temporadas];
	private boolean entregado = false;
	private String genero ="default";
	private String creador ="default";
	
	//constructores
	public Serie(){ //contructor por defecto (vacío)
		}

	public Serie( String titulo, String creador){ // Un constructor con el título y creador. El resto por defecto.
		this.titulo = titulo;
		this.creador = creador;
	}
	
	public Serie( String titulo, int temporadas, int[] captemporadas, String genero, String creador){ //Un constructor con todos los atributos, excepto de entregado.
		this.titulo = titulo;
		this.temporadas = temporadas;
		this.captemporadas = new int[temporadas];
		this.captemporadas= captemporadas;
		this.genero = genero;
		this.creador = creador;
	}
	
	
	//getters y setters
	public String getTitulo() {
		return titulo;
	}
	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}
	
	public int getTemporadas() {
		return temporadas;
	}
	public void setTemporadas(int temporadas) {
		this.temporadas = temporadas;
	}
	
	public String getGenero() {
		return genero;
	}
	public void setGenero(String genero) {
		this.genero = genero;
	}
	
	public String getCreador() {
		return creador;
	}
	public int[] getCaptemporadas() {
		return captemporadas;
	}
	
	public void setCaptemporadas(int[] captemporadas) {
		this.captemporadas = captemporadas;
	}
	
	public void setCreador(String creador) {
		this.creador = creador;
	}
}