import java.util.ArrayList;

public class Zombies {

	//ATRIBUTOS nombre, año de conversión a zombie, nivel dentro comunidad, personas convertidas al año
    private String nombre = "default";
    private int nivel = 0;
    ArrayList<Integer> Personas_convertidas_anyo = new ArrayList<Integer>();

    //CONSTRUCTORES

    public Zombies() {
    }

    public Zombies(String nombre, int nivel, ArrayList<Integer> personas_convertidas_anyo) {
        this.nombre = nombre;
        this.nivel = nivel;
        Personas_convertidas_anyo = personas_convertidas_anyo;
    }


// GETTERS


    public String getNombre() {
        return nombre;

    }

    public int getNivel() {
        return nivel;
    }

    public ArrayList<Integer> getPersonas_convertidas_anyo() {
        return Personas_convertidas_anyo;
    }

// SETTERS


    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setNivel(int nivel) {
        this.nivel = nivel;
    }

    public void setPersonas_convertidas_anyo(ArrayList<Integer> personas_convertidas_anyo) {
        Personas_convertidas_anyo = personas_convertidas_anyo;
    }

// METODOS

    //Devuelve la información de un zombie
    public String mostrarInformacion() {
        int anyo_para_conversion = 5 - getPersonas_convertidas_anyo().size() ;

        String mostrar = "Hola, soy " + this.nombre + ", tengo "
                + getPersonas_convertidas_anyo().size() + " años de conversión y me quedan "
                + anyo_para_conversion + " para convertirme en una bonita flor ";
        return mostrar;
    }

    //Recorre el array y devuelve el mayor número (más personas convertidas)
    public int maxConveriones() {
        int mejor = Integer.MIN_VALUE;
        for (int elemento_actual : getPersonas_convertidas_anyo()) {
            if (mejor < elemento_actual) {
                mejor = elemento_actual;
            }
        }
        return mejor;
    }

    //Lo mismo pero el año
    public int mejorAnyo() {
        int i = 0;
        int pos = 0;
        int mejor = Integer.MIN_VALUE;
        for (int elemento_actual : getPersonas_convertidas_anyo()) {
            i++;
            if (mejor < elemento_actual) {
                pos = i;
                mejor = elemento_actual;
            }
        }
        return pos;
    }

    public double mediaConversiones() {
        double result = 0d;
        for (double elemento : getPersonas_convertidas_anyo()){
            result += elemento;
        }
        result /= getPersonas_convertidas_anyo().size();

        return result;
    }

    public int totalConversiones(){
        int result =  0;
        for (int elemento : getPersonas_convertidas_anyo()){
            result += elemento;
        }
        return result;
    }

        public String haConvertido (){
        int contador = 0;
        if (totalConversiones() > 0) contador++;

        if(contador > 0)
            return "Sí";
        else
            return "No";

    }

        public String esJefe (){
        if(getNivel() >= 7)
            return "Sí";
        else
            return "No";
    }

}