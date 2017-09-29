//ARMAS
public class Arma {
    private int danyo;
    private int distancia;
    private int ataques;
    private TipoArma tipo;

    public Arma() { //ARMA POR DEFECTO
        this(1, 1,TipoArma.SARTEN);
    }

    public Arma(int danyo, int distancia) {
        this(danyo, distancia,  TipoArma.SARTEN);
    }

    public Arma(int dano, int distancia, TipoArma tipo) {
        this.danyo = dano;
        this.distancia = distancia;
        this.ataques = 3;
        this.tipo = tipo;
    }



    public void armarse(){ //GRITOS DE GUERRA
        System.out.println(
                "¡ARMADO 1 GRITO GUERRA!" +
                "¡ARMADO 2 GRITO GUERRA!" +
                "¡ARMADO 3 GRITO GUERRA!" +
                "¡ARMADO 4 GRITO GUERRA!"
        );
    }

    //SETERS
    public void setAtaques(int ataques) {
        this.ataques = ataques;
    }
    public void setDanyo(int danyo) {
        this.danyo = danyo;
    }
    public void setDistancia(int distancia) {
        this.distancia = distancia;
    }
    public void setTipo(TipoArma tipo) {
        this.tipo = tipo;
    }
    
    //GETTERS
    public int getDanyo() {
        return danyo;
    }
    public int getDistancia() {
        return distancia;
    }
    public TipoArma getTipo() {
        return tipo;
    }
    public int getAtaques() {
        return ataques;
    }
}
