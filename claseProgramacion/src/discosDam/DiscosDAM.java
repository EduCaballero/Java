/*
 * Solución a la parte práctica de la prueba de nivel
 */
package discosDam;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;

/**
 *
 * @author DAM
 */
public class DiscosDAM {
    
    private static ArrayList<Disco> discos;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        discos = new ArrayList<>();
        int opcion;
        do {
        mostrarMenu();
        opcion = pedirEntero("Escoge una opción: ");
        switch (opcion) {
            case 1: //Alta disco
                break;
            case 2: // Modificar disco
                break;
            case 3: //Borrar disco
                break;
            case 4: //Listas discos
                break;
            case 5: // Salir
                System.out.println("Hasta la próxima");
                break;
            default:
                System.out.println("Opción incorrecta");
        }
        } while (opcion !=5);
    }
    
    public static void altaDisco(){
        System.out.println("Datos del disco");
        String titulo = pedirTexto("Título: ");
        String artista = pedirTexto("Artista: ");
        int temas = pedirEntero("Nº de temas: ");
        double duracion = pedirDoble("Duración: ");
        Disco d = new Disco(titulo, artista, temas, duracion);
        discos.add(d);
        System.out.println("Disco dado de alta");
    }
    
    public static String pedirTexto(String mensaje){
        //No acepta cadena vacía
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String texto = "";
        boolean error = true;
        do {
            System.out.println(mensaje);
            try {
                texto = br.readLine();
                if(texto.equals("")){
                    System.out.println("No puedes dejar el dato en blanco");
                } else {
                    error = false;
                }
            } catch (IOException ex) {
                System.out.println("Error de entrada / salida " + ex.getMessage());
            }
        } while (error);
        return texto;
    }
    
    public static double pedirDoble(String mensaje){
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        double numero = 0;
        boolean error = true;
        do {
            System.out.println(mensaje);
            try{
                numero = Double.parseDouble(br.readLine());
                error = false;
            } catch (IOException ex) {
                System.out.println("Error de entrada / salida: " + ex.getMessage());                
            } catch (NumberFormatException ex) {
                System.out.println("Debes introducir un número.");
            }
        } while (error);
        return numero;
    }
    
    public static int pedirEntero(String mensaje) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int numero = 0;
        boolean error = true;
        do {
        System.out.println(mensaje);
        try {
            numero = Integer.parseInt(br.readLine());
        } catch (IOException ex) {
            System.out.println("Error de entrada salidad "+ ex.getMessage());
        } catch (NumberFormatException ex) {
            System.out.println("Debes introducir un número");
        } 
        } while (error); //esto es igual a error == true
        return numero;
    }

    public static void mostrarMenu() {
        System.out.println("DISCOGRAFIA DAM2T!!");
        System.out.println("1. Alta disco");
        System.out.println("2. Modificar disco");
        System.out.println("3. Borrar disco");
        System.out.println("4. Mostrar disco");
        System.out.println("5. Salir");
    }

}