//HORDA
public class Horda {
    private String nombre;
    private int respawn;
    private int newRespawn = respawn; //AL FINAL NO SE UTILIZA PARA NADA

    public Horda(String nombre, int respawn) {
        this.nombre = nombre;
        this.respawn = respawn;
        caminar();
    }

    //GETTERS
    public String getNombre() {
        return nombre;
    }
    public int getRespawn() {
        return respawn;
    }
    
    
    //SETTERS
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public void setRespawn(int respawn) {
        this.respawn = respawn;
    }
    
    
    //MÉTODOS QUE SE IBAN A IMPLEMENTAR
    public void caminar(){
        respawn--;
        if(respawn == 0){
            morder();
        }
    }

    public void morder(){

        resetRespawn();
    }

    public void resetRespawn(){ //NO SE USA
        respawn = newRespawn;
    }

}
