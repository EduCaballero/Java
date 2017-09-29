package anyoanterior.zombie2;



//AQU� ZOMBIE
public class Zombie {
    private int dano;
    private int vida;
    private int movimiento;
    private TipoZombie tipo;
    private Horda horda;


    public Zombie(int dano, int vida, int movimiento, TipoZombie tipo, String nombreHorda, int numRespawn) {
        this.dano = dano;
        this.movimiento = movimiento;
        this.tipo = tipo;
        this.vida = vida;
        this.horda = new Horda(nombreHorda, numRespawn);
    }

    public int getVida() {
        return vida;
    }
    public void setVida(int vida) {
        this.vida = vida;
    }
    public int getDano() {
        return dano;
    }
    public void setDano(int dano) {
        this.dano = dano;
    }
    public int getMovimiento() {
        return movimiento;
    }
    public void setMovimiento(int movimiento) {
        this.movimiento = movimiento;
    }
    public TipoZombie getTipo() {
        return tipo;
    }
    public void setTipo(TipoZombie tipo) {
        this.tipo = tipo;
    }
    public Horda getHorda() {
        return horda;
    }
    public void setHorda(Horda horda) {
        this.horda = horda;
    }

    //INFO ZOMBIE
    public void showInfoZombie(){
    	System.out.println("Tipo de Zombie : "+tipo);
        System.out.println("Danyo : "+dano);
        System.out.println("Vida : "+vida);
        System.out.println("Movimiento : "+movimiento);
        System.out.println("Horda : "+horda.getNombre());
        //System.out.println("Respawn : "+horda.getRespawn()); AL FINAL NO LO USAMOS
        System.out.println("");

    }
}
