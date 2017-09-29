import java.io.BufferedReader;
import java.io.InputStreamReader;

public class SerieApp {
	
	public static void main(String[] args) {
		BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
		try{
			System.out.println("Serie 1:");
			System.out.println("Todo por defecto");
			System.out.println("------------------------");
			System.out.println();
			System.out.println("Serie 2:");
			System.out.println("Sólo título y creador");
			System.out.println("Titulo:");
			String titulo2 = buffer.readLine();			
			System.out.println("Creador:");
			String creador2 = buffer.readLine();
			System.out.println("------------------------");
			System.out.println();
			
			
			System.out.println("Serie 3:");
			System.out.println("Título:");
			String titulo3 = buffer.readLine();
			System.out.println("Temporadas:");
			int temporadas3= Integer.parseInt(buffer.readLine());
			int[] captemporadas3 = new int [temporadas3];
			for(int i =0; i<temporadas3; i ++){
				System.out.println("Capítulos por temporada " + (i+1) +":");
				captemporadas3[i]= Integer.parseInt(buffer.readLine());						
			};
			System.out.println("Género:");
			String genero3 = buffer.readLine();
			System.out.println("Creador:");
			String creador3 = buffer.readLine();
			System.out.println("------------------------");
			System.out.println();
			
			
			Serie s1 = new Serie();
			Serie s2 = new Serie(titulo2, creador2);
			Serie s3 = new Serie(titulo3, temporadas3, captemporadas3, genero3, creador3);
			
			
			
			System.out.println("Serie 1:");
			System.out.println("Todo por defecto");
			System.out.println("Título: " +s1.getTitulo());
			System.out.println("Temporadas:" +s1.getTemporadas());
			int[] aux = s1.getCaptemporadas();
			for(int i =0; i<s1.getTemporadas(); i++){
				System.out.println("Temporada " +(i+1)+": " +aux[i]);
			}
			System.out.println("Género: " +s1.getGenero());
			System.out.println("Creador: " +s1.getCreador());
			System.out.println("------------------------");
			System.out.println();
			System.out.println("Serie 2:");
			System.out.println("Sólo título y creador");
			System.out.println("Título: " +s2.getTitulo());
			System.out.println("Temporadas: " +s2.getTemporadas());
			aux = s2.getCaptemporadas();
			for(int i =0; i<s2.getTemporadas(); i++){
				System.out.println("Temporada " +(i+1)+": " +aux[i]);
			}
			System.out.println("Género: " +s2.getGenero());
			System.out.println("Creador: " +s2.getCreador());
			System.out.println("------------------------");
			System.out.println();
			System.out.println("Serie 3:");
			System.out.println("Título: " +s3.getTitulo());
			System.out.println("Temporadas: " +s3.getTemporadas());
			aux = s3.getCaptemporadas();
			for(int i =0; i<s3.getTemporadas(); i++){
				System.out.println("Temporada " +(i+1)+": " +aux[i]);
			}
			System.out.println("Género: " +s3.getGenero());
			System.out.println("Creador: " +s3.getCreador());
			
		}
		catch (Exception e){
			System.out.println("Error " + e);
		}
		
		
	}
	
}
