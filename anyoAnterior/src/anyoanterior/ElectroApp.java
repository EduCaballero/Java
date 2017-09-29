import java.io.BufferedReader;
import java.io.InputStreamReader;

public class ElectroApp {
	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		try{
			
			System.out.println("Peso");
			double peso = Double.parseDouble(buffer.readLine());

			System.out.println("Precio");
			double precio = Double.parseDouble(buffer.readLine());

			System.out.println("Consumo energético (letras entre A y F)");
			char consumo = buffer.readLine().charAt(0);
			
			System.out.println("Color: (Blanco, Negro, Rojo, Azul y Gris)");
			String color = buffer.readLine();
			
			Electro e1 = new Electro();
			Electro e2 = new Electro();
			Electro e3 = new Electro();
			
			e2.setPeso(peso);
			e2.setPrecio(precio);
			
			e3.setPeso(peso);
			e3.setPrecio(precio);
			e3.setConsumo(consumo);
			e3.setColor(color);
			
			System.out.println("-----------------------------------");
			
			System.out.println("Electrodoméstico 1 (Por defecto) ");
			System.out.println("Peso e1: " + e1.getPeso());
			System.out.println("Precio base e1: " + e1.getPrecio());
			System.out.println("Consumo e1: " + e1.getConsumo());
			System.out.println("Color e1: " + e1.getColor());
			System.out.println("Precio Final e1: " + e1.precioFinal());
			System.out.println("");
			System.out.println("-------------------------------------");
			
			System.out.println("Electrodoméstico 2 (Precio y peso) ");
			System.out.println("Peso e2: " + e2.getPeso());
			System.out.println("Precio base e2: " + e2.getPrecio());
			System.out.println("Consumo e2: " + e2.getConsumo());
			System.out.println("Color e2: " + e2.getColor());
			System.out.println("Precio Final e2: " + e2.precioFinal());
			System.out.println("");
			System.out.println("-------------------------------------");

			
			System.out.println("Electrodoméstico 3 (Precio, peso, consumo y color)");
			System.out.println("Peso e3: " + e3.getPeso());
			System.out.println("Precio base e3: " + e3.getPrecio());
			System.out.println("Consumo e3: " + e3.getConsumo());
			System.out.println("Color e3: " + e3.getColor());
			System.out.println("Precio Final e3: " + e3.precioFinal());
			System.out.println("");
			
		
		}
		catch (Exception e){
			System.out.println("Error " + e);
		}
	}
}
