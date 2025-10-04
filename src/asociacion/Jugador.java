package asociacion;

public class Jugador {
    private String nombre;
    private int nivel;
    private boolean tienePass;
    private int trofeos;


    public Jugador(String nombre, int nivel, boolean tieneClan, int trofeos) {
        this.nombre = nombre;
        this.nivel = nivel;
        this.tienePass = tieneClan;
        this.trofeos = trofeos;
    }

    public String getNombre() {
        return nombre;
    }
}
