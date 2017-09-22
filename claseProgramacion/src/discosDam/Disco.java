/*
 * Definición de Disco
 */
package discosdam;

/**
 *
 * @author DAM
 */
public class Disco {
    
    private String titulo;
    private String artista;
    private int canciones;
    private double duracion;

    public Disco(String titulo, String artista, int canciones, double duracion) {
        this.titulo = titulo;
        this.artista = artista;
        this.canciones = canciones;
        this.duracion = duracion;
    }
    

    public double getDuracion() {
        return duracion;
    }

    public void setDuracion(double duracion) {
        this.duracion = duracion;
    }


    public int getCanciones() {
        return canciones;
    }

    public void setCanciones(int canciones) {
        this.canciones = canciones;
    }


    public String getArtista() {
        return artista;
    }

    public void setArtista(String artista) {
        this.artista = artista;
    }


    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}