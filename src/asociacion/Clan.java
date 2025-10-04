package asociacion;

public class Clan {
    private Jugador[] jugadores;
    private String nombreClan;
    private Jugador lider;

    public Clan(Jugador[] jugadores, String nombre, Jugador lider) {
        this.jugadores = jugadores;
        this.nombreClan = nombre;
        this.lider = lider;
    }

    public void mostrarJugadores(Jugador[] jugadores) {
        System.out.println("Los jugadores del clan " + nombreClan);
        int NUMERO_MAXIMO = 50;
        if (jugadores.length < NUMERO_MAXIMO) {
            for (Jugador jugador : jugadores) {
                System.out.println(jugador.getNombre());
            }
        }
        else System.out.println("El clan solo puede teer hasta 50 jugadores");
    }
    public void mostrarLider(Jugador lider) {
        System.out.println("El lider del clan " + nombreClan + " es " + lider.getNombre());
    }
}

