public class Electro {

	//ATRIBUTOS
	private String color;
	private double precio;
	private char consumo;
	private double peso;

	//CONSTRUCTORES
	public Electro() { //cada vez que se crea, con estos valores por def
		this.peso = 5;
		this.precio = 100.00;
		this.consumo = 'F';
		this.color = "BLANCO";
	}

	public Electro(double peso, double precio) { //Un constructor con el precio y peso. El resto por defecto
		this.peso = peso;
		this.precio = precio;
		this.consumo = 'F';
		this.color = "BLANCO";	
	}
	
	public Electro(double peso, double precio, char consumo, String color){ //Un constructor con todos los atributos.
		this.peso = peso;
		this.precio = precio;
		this.consumo = consumo;
		compruebaConsumo();
		this.color = color;
		compruebaColor();	
	}
	
	//GETTERS Y SETTERS
	
	public double getPeso() {
		return peso;
	}

	public void setPeso(double peso) {
		this.peso = peso;
	}
	
	public double getPrecio() {
		return precio;
	}

	public void setPrecio(double precio) {
		this.precio = precio;
	}
	
	public char getConsumo() {
		return consumo;
	}

	public void setConsumo(char consumo) {
		this.consumo = consumo;
		compruebaConsumo();
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
		compruebaColor();
	}

	//MÉTODOS
	
	private void compruebaConsumo(){
		String consumo = Character.toString(this.consumo);
		consumo = consumo.toUpperCase();
		this.consumo = consumo.charAt(0);
		if(this.consumo != 'A' && this.consumo != 'B' && this.consumo != 'C' && this.consumo != 'D' && this.consumo != 'E' && this.consumo != 'F' ){
			this.consumo = 'F';			
		}
		
	}

	private void compruebaColor(){
		String color = this.color;
		color = color.toUpperCase();
		if(color.equals("BLANCO") || color.equals("NEGRO") || color.equals("ROJO") || color.equals("AZUL") || color.equals("GRIS")){
			this.color = color;			
		}else{
			this.color = "BLANCO";	
		}
	}
	
	public double precioFinal(){
		double precio = this.precio;
		switch(this.consumo){
		case 'A':
			precio = precio + 100;
			break;
		case 'B':
			precio = precio + 80;
			break;			
		case 'C':
			precio= precio + 60;
			break;			
		case 'D':
			precio = precio + 50;
			break;
		case 'E':
			precio = precio + 30;
			break;
		case 'F':
			precio = precio + 10;
			break;		
		}
		if(this.peso >= 0.00 && this.peso<=19.00 ){
			precio = precio + 10;
		}
		else if(this.peso > 19.00 && this.peso<=49.00 ){
			precio = precio + 50;
		}
		else if(this.peso > 49.00 && this.peso<=79.00 ){
			precio = precio + 80;
		}
		else if(this.peso > 79.00 ){
			precio = precio + 100;
		}
		
		return precio;
	}
	
}
