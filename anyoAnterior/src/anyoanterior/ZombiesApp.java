import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class ZombiesApp {
	public static void main(String[] args) {

		// Zombie 1 constructor por defecto
		Zombies zombie1 = new Zombies();
		String Informacion = zombie1.mostrarInformacion();
		System.out.println(Informacion);

		try {
			// Zombie 2
			ArrayList<Integer> personas_convertidas = new ArrayList<Integer>();
			BufferedReader buff = new BufferedReader(new InputStreamReader(System.in));
			System.out.println("Introduce tu nombre");
			String nombre = buff.readLine();
			int nivel;
			do {
				System.out.println("Introduce tu nivel");
				nivel = Integer.parseInt(buff.readLine());
			} while (nivel > 10 || nivel < 0);

			System.out.println("Introduce los años que has vivido como zombie");
			int contador = 0;
			int anyosZombie;
			anyosZombie = Integer.parseInt(buff.readLine());
			boolean exit = false;
			System.out.println("Introduce las personas convertidas cada año");
			System.out.println("Para salir, escribe la palabra 'exit'");
			while (exit == false) {
				if (contador < anyosZombie) {
					System.out.println("Introduce las personas que has convertido el año : " + (contador + 1));
					String cadenaNumero = buff.readLine();
					if (cadenaNumero.toLowerCase().equals("exit"))
						exit = true;
					else {
						int numero = Integer.parseInt(cadenaNumero);
						personas_convertidas.add(numero);
					}
				} else {
					exit = true;
				}
				contador++;
			}
			Zombies zombie2 = new Zombies(nombre, nivel, personas_convertidas);
			System.out.println("---------------------------------------");
			System.out.println("Información");
			System.out.println("Nombre: " + zombie2.getNombre());
			if (anyosZombie == 0)
				System.out.println("Todavía eres humano");
			else {
				System.out.println("Mejor año de conversiones: " + zombie2.mejorAnyo());
				System.out.println("Años como zombie: " + anyosZombie);
				System.out.println("Máximas conversiones en un año " + zombie2.maxConveriones());
				System.out.println("Media de conversiones por año " + zombie2.mediaConversiones());
				System.out.println(
						"Total de conversiones a lo largo de la vida como zombie " + zombie2.totalConversiones());
				System.out.println("¿Has convertido alguna vez? " + zombie2.haConvertido());
				System.out.println("¿Eres un jefe zombie? " + zombie2.esJefe());
			}
		} catch (Exception e) {

		}

	}
}
