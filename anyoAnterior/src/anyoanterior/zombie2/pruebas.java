
import anyoanterior.zombie2.Zombie;


public class pruebas {
	 public static void main(String[] args) {

		 Superviviente[] Equipo = new Superviviente[5];
		 Equipo[0] = new Superviviente(3, 0, "user1", SkillsPersonaje.FORTACHON);
	     Equipo[1] = new Superviviente(3, 0, "user2", SkillsPersonaje.RAPIDO);
	     Equipo[2] = new Superviviente(3, 0, "user3", SkillsPersonaje.ESCURRIDIZO);
	     Equipo[3] = new Superviviente(3, 0, "user4", SkillsPersonaje.BUSCADOR);
	     Equipo[4] = new Superviviente(3, 0, "user5", SkillsPersonaje.AMBIDIESTRO);
	     
	     
	     for (Superviviente a:Equipo) {
	            a.bonificacionSkill();
	            a.showInfoSuper2();
	        }
	     
	     int numeroZombiesPorPlanta=8;
	     System.out.println();
	     System.out.println("----------");
	     Zombie[] planta1 = new Zombie[numeroZombiesPorPlanta];
	        for (int i = 0; i < numeroZombiesPorPlanta; i++) {
	            planta1[i] = new Zombie(1, 1, 1, TipoZombie.CAMINANTE, "planta1", 5);
	        }
	        
	        for (Zombie a:planta1) {
	            a.showInfoZombie();
	        }
	        System.out.println();
		     System.out.println("----------");
	        
	        /*for (int i=0; i<8;i++){
	        	System.out.println(i % 4);
	        }*/
	        //public Zombie(int dano, int vida, int movimiento, TipoZombie tipo, String nombreHorda, int numRespawn)
	        Zombie[] planta2 = new Zombie[numeroZombiesPorPlanta];
	        for (int i = 0; i < numeroZombiesPorPlanta; i++) {
	            if (i % 4 == 0) {
	                planta2[i] = new Zombie(1, 2, 2, TipoZombie.GORDO, "planta2", 5);
	            } else {
	                planta2[i] = new Zombie(1, 1, 1, TipoZombie.CAMINANTE, "planta2", 5);
	            }
	        }

	        for (Zombie a:planta2) {
	            a.showInfoZombie();
	        }
	        System.out.println();
		     System.out.println("----------");
		     
		     Zombie[] planta3 = new Zombie[numeroZombiesPorPlanta];
		        for (int i = 0; i < numeroZombiesPorPlanta; i++) {
		            if (i % 4 == 0) {
		                planta3[i] = new Zombie(1, 2, 2, TipoZombie.GORDO, "planta3", 5);
		            } else {
		                if (i == 7) { //ERROR AQU�, NO SALDR�A NUNCA UNA WITCH
		                    planta3[i] = new Zombie(3, 2, 2, TipoZombie.WITCH, "planta3", 5);
		                } else {
		                    planta3[i] = new Zombie(1, 1, 1, TipoZombie.CAMINANTE, "planta3", 5);
		                }
		            }
		        }
	        
		        for (Zombie a:planta3) {
		            a.showInfoZombie();
		        }
		        System.out.println();
			     System.out.println("----------");
	        
	}
}
