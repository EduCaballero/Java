/*
 * 2. El programa mostrará un menú con las siguientes opciones:
        1. Alta Coche
        2. Modificar Coche
        3. Borrar Coche
        4. Listado de Coches
        5. Salir
 */
package concesionario;
import java.util.Scanner;
/**
 *
 * @author alu2016425
 */
public class ConcesionarioAPP {
	public static void main(String[] args) {
            int opcion;
        //    do {
                mostrarMenu();
                opcion = selMenu("Escoge una opción:");
        //    } while {
            
        //}
            
            
        }    
        
        public static void mostrarMenu(){
            System.out.println("Concesionario STUCOM");
            System.out.println("1.- Alta coche");
            System.out.println("2.- Modificar coche");
            System.out.println("3.- Borrar coche");
            System.out.println("4.- Listado de coches");
            System.out.println("5.- Salir");
        }
        
        
        public static int selMenu(String mensaje){
            Scanner entrada=new Scanner(System.in);
            boolean error = true;
            int entero=0;//llamar a objeto entrada y pedimos introducir un Int
            do{
                System.out.println(mensaje); 
                try{
                   entero=entrada.nextInt();
                   error=false;
                } catch (java.util.InputMismatchException e) {
                    entrada.nextLine();
                    System.out.println("Debes introducir a Lionel Messi para que gane el Madrid!");
                }
            } while (error);
            return entero;
        }
        
        
}
