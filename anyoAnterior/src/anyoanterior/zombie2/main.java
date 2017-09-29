
import anyoanterior.zombie2.Zombie;


public class main {
	public static void main(String[] args) {

		// CREAMOS EL EQUIPO DE SUPERVIVIENTES EN UN ARRAY
		//ASIGNAMOS NOMBRE Y SKILL (R�PIDO POR DEFECTO)
		Superviviente[] Equipo = new Superviviente[5];
		Equipo[0] = new Superviviente(3, 0, "SUPER1", SkillsPersonaje.FORTACHON);
		Equipo[1] = new Superviviente(3, 0, "SUPER2", SkillsPersonaje.RAPIDO);
		Equipo[2] = new Superviviente(3, 0, "SUPER3", SkillsPersonaje.ESCURRIDIZO);
		Equipo[3] = new Superviviente(3, 0, "SUPER4", SkillsPersonaje.BUSCADOR);
		Equipo[4] = new Superviviente(3, 0, "SUPER5", SkillsPersonaje.AMBIDIESTRO);

		// CREAMOS ARMAS (LAS PODR�AMOS TRUCAR SI QUISI�RAMOS ;)
		Arma pistola = new Arma(1, 2, TipoArma.PISTOLA);
		Arma escopeta = new Arma(1, 2, TipoArma.ESCOPETA);
		Arma katana = new Arma(2, 1, TipoArma.KATANA);
		Arma hacha = new Arma(2, 1, TipoArma.HACHA);
		// ASIGNAMOS ARMAS A CADA SUPER
		Equipo[0].setArma(hacha);
		Equipo[1].setArma(escopeta);
		Equipo[2].setArma(katana);
		Equipo[4].setArma(pistola);

		// ASIGNAMOS N�MERO DE ZOMBIES POR PLANTA (8 SON DEMASIADO POCOS, PR�CTICAMENTE NO HAY POSIBILIDAD DE FRACASAR)
		int numeroZombiesPorPlanta = 8;
		System.out.println();
		System.out.println("------------------�LTIMOS SUPERVIVIENTES DEL PLANETA-----------------------------");
		System.out.println();
		for (Superviviente SupervivienteActual : Equipo) {
			SupervivienteActual.bonificacionSkill(); //ASIGNAMOS LA BONIFICACI�N DE LA SKILL
			SupervivienteActual.showInfoSuper2(); //MOSTRAMOS LA INFO COMPLETA
		}

		// PLANTA 1, S�LO CAMINANTES

		System.out.println("COMENZAMOS LA ESCAPADA");
		System.out.println();
		System.out.println("|||||||||||||||||PLANTA 3||||||||||||||||||||");
		System.out.println();
		Zombie[] planta1 = new Zombie[numeroZombiesPorPlanta]; //ARRAY-HORDA DE ZOMBIES
		for (int i = 0; i < numeroZombiesPorPlanta; i++) {
			planta1[i] = new Zombie(1, 1, 1, TipoZombie.CAMINANTE, "PLANTA 3", 5); //CREAMOS LOS ZOMBIES Y LOS METEMOS EN SU HORDA
		}
		boolean EquipoHaSobrevivido; //NO HAR�A FALTA EN ESTA PRIMERA PLANTA, PERO POR SI ACASO
		EquipoHaSobrevivido = batalla(Equipo, planta1); //A LAS ARMAS!
		resultadoBatalla(Equipo, planta1); //RESULTADO

		if (EquipoHaSobrevivido) {
			System.out.println("�Facil�simo! �Seguimos adelante!");
			System.out.println("�Adelante Babieca!");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("|||||||||||||||||PLANTA 2||||||||||||||||||||");
		} else {
			System.out.println("Menudos pusil�nimes, todos muertos");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("GAME OVER");
			System.exit(0);
		}

		Zombie[] planta2 = new Zombie[numeroZombiesPorPlanta]; //SE LE ASIGNA EL MISMO N�MERO DE ZOMBIES POR PLANTA, AUNQUE PODR�AMOS ALTERARLO INDIVIDUALMENTE
		for (int i = 0; i < numeroZombiesPorPlanta; i++) {
			if (i % 4 == 0) { //NO ES TOTALMENTE RANDOM, PERO GUARDA BASTANTE BIEN LA PROPORCI�N AUNQUE AUMENT�RAMOS EL N�MERO DE ZOMBIES
				planta2[i] = new Zombie(1, 2, 2, TipoZombie.GORDO, "PLANTA 2", 5);
			} else {
				planta2[i] = new Zombie(1, 1, 1, TipoZombie.CAMINANTE, "PLANTA 2", 5);
			}
		}

		EquipoHaSobrevivido = batalla(Equipo, planta2); //PARA ACTIVAR O NO EL BOOLEANO DE SUPERVIVENCIA
		resultadoBatalla(Equipo, planta2);
		
		if (EquipoHaSobrevivido) {
			System.out.println("ugh, cof, cof... Un poco de sangre no nos detendr�");
			System.out.println("�Avanti!");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("|||||||||||||||||PLANTA 1||||||||||||||||||||");
		} else {
			System.out.println("Menudos pusil�nimes, todos muertos en planta 2");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("GAME OVER");
			System.exit(0);
		}

		System.out.println();
		System.out.println();
		System.out.println();
		System.out.println();
		Zombie[] planta3 = new Zombie[numeroZombiesPorPlanta];
		for (int i = 0; i < numeroZombiesPorPlanta; i++) {
			if (i % 4 == 0) {
				planta3[i] = new Zombie(1, 2, 2, TipoZombie.GORDO, "PLANTA 1", 5);
			} else {
				if (i == 7) { //OBLIGATORIO UN WITCH SEG�N LA PR�CTICA (LO PONGO �LTIMO, PARA MEDRAR EN LAS ESPERANZAS DEL GRUPO)
					planta3[i] = new Zombie(3, 2, 2, TipoZombie.WITCH, "PLANTA 1", 5);
				} else {
					planta3[i] = new Zombie(1, 1, 1, TipoZombie.CAMINANTE, "PLANTA 1", 5);
				}
			}
		}
		EquipoHaSobrevivido = batalla(Equipo, planta3);
		resultadoBatalla(Equipo, planta3);

		if (EquipoHaSobrevivido) {
			System.out.println("... ugh... por las barbas de merl�n... ");
			System.out.println("�Lo conseguimos!");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("Continuar�...");
		} else {
			System.out.println("Menudos pusil�nimes, todos muertos ya casi a las puertas...");
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println();
			System.out.println("GAME OVER");
			System.exit(0);
		}

	}

	public static boolean batalla(Superviviente[] Team, Zombie[] Horda) {
		for (Superviviente SupervivienteActual : Team) {
			SupervivienteActual.resetPuedoEscapar(); //CON ESTO RESETEO LA HABILIDAD DE ESCURRIDIZO
		} 

		int objetivo; //A QUI�N APUNTAMOS
		int punteria; // PUNTER�A. HIT 1, MISS 0
		int contadorSupMuertos = 0;
		int contadorZombieMuertos = 0;
		while (contadorSupMuertos != Team.length && contadorZombieMuertos != Horda.length) { //LO EJECUTAREMOS MIENTRAS CUALQUIER MIEBRO DE LOS ARRAY QUEDE VIVO
			int index = 0; // POSICI�N DEL SUPERVIVIENTE ACTUAL
			for (Superviviente supervivienteActual : Team) { // RECCORREMOS ARRAY SUP
				if (Team[index].getVidas() != 0) { // SI NO EST� MUERTO, ENTRA
					for (int i = 0; i < supervivienteActual.getArma().getAtaques(); i++) { //CON ESTO EJECUTAMOS LOS ATAQUES
						if (contadorZombieMuertos != Horda.length) {
							do {
								objetivo = (int) (Math.random() * Horda.length); // TARGET A UN MIEMBRO DE LA HORDA - RANDOM
							} while (Horda[objetivo].getVida() == 0); // REPETIMOS SI EL ZOMBIE MUERE
							punteria = (int) (Math.random() * 2); // PROBABILIDAD DE ACIERTO
							if (punteria == 1) { // HIT
								if (supervivienteActual.getArma().getDanyo() >= Horda[objetivo].getVida()) { // CON ESTO MIRAMOS SI PODEMOS HACER DA�O AL ZOMBIE CON EL ARMA ACTUAL
									Horda[objetivo].setVida(0); // SI ENTRA, MATAMOS AL ZOMBIE
									contadorZombieMuertos++; 
								} else { // SI NO ENRA, EL ARMA VALE MENOS QUE LA VIDA DEL ZOMBIE
								}
							} else { //FALLA LA PUNTER�A
							}
						}
					}
					index++; // POSICI�N +1
				} else {
					index++; // SI NO ENTRA, SUPERVIVIENTE MUERTO Y PASAMOS AL SIGUIENTE DEL ARRAY
				}
			}
			index = 0; // RESETEAMOS LA POSICI�N PARA ZOMBIES
			for (Zombie zombieActual : Horda) { //RECORREMOS HORDA
				if (Horda[index].getVida() != 0) { // SI HAY ZOMBIE QUE NO EST� MUERTO, ENTRA
					if (contadorSupMuertos != Team.length) {
						do {
							objetivo = (int) (Math.random() * Team.length); // APUNTAMOS DE MANERA RANDOM A UNO DEL ARRAY SUP
						} while (Team[objetivo].getVidas() == 0);
						punteria = (int) (Math.random() * 2); // PUNTER�A
						if (punteria == 1) { // HIT
							if (Team[objetivo].getPuedoEscapar()) {
								Team[objetivo].setPuedoEscapar(false);
							} else {
								if (Team[objetivo].getVidas() <= zombieActual.getDano()) { // ATAQUE DE ZOMBIE, SE COMPARA VIDA SUP Y DA�O ZOMBIE
									Team[objetivo].setVidas(0); // Y ENTONCES, SE LE SETEA LA VIDA
									contadorSupMuertos++;
								} else {
									Team[objetivo].setVidas(Team[objetivo].getVidas() - zombieActual.getDano()); // O SE LE RESTA
								}
							}
						}
						index++;
					} else {
						index++;
					}
				}
			}
		}
		if (contadorSupMuertos == Team.length) {
			return false; //SUP MUERTOS
		} else {
			return true; // SUP VIVOS
		}
	}

	public static void resultadoBatalla(Superviviente[] Team, Zombie[] Horda) {
		System.out.println("-------------------------SUPERVIVIENTES--------------------------------");
		System.out.println();
		for (Superviviente elemento : Team) {
			elemento.showInfoSuper();
			System.out.println();
			System.out.println();
		}
		System.out.println(" ------------------------------ZOMBIES---------------------------------");
		System.out.println();
		for (Zombie elemento : Horda) {
			elemento.showInfoZombie();
			System.out.println();
			System.out.println();
		}
	}

}
