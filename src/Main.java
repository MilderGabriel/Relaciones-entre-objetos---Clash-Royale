import asociacion.Clan;
import asociacion.Jugador;
import agregacion.Carta;
import agregacion.Mazo;
import composicion.Arena;

public class Main {
    public static void main(String[] args) {
        Jugador[] jugadores = new Jugador[4];
        jugadores[0] = new Jugador("Morrissj2", 42, false, 9300);
        jugadores[1] = new Jugador("Siofernax", 27, true, 15000);
        jugadores[2] = new Jugador("Valele", 1, true, 4000);
        jugadores[3] = new Jugador("GaryFrancoC", 31, true, 6000);

        Clan clan1 = new Clan( jugadores,"Los Tilinesios", jugadores[0]);

        clan1.mostrarJugadores(jugadores);
        clan1.mostrarLider(jugadores[0]);

        Jugador jugador1 = new Jugador("Eltilin88", 50, true, 15000);
        System.out.println("Hay un jugador llamado " + jugador1.getNombre());

        Carta[] cartas = new Carta[8];
        cartas[0] = new Carta("Pekka","Epica", 7, 15);
        cartas[1] = new Carta("Ariete", "Especial",4, 14);
        cartas[2] = new Carta("Bandida", "Legendaria",3, 13);
        cartas[3] = new Carta("Arquero Magico", "Legendaria",4, 13);
        cartas[4] = new Carta("Fantasma Real", "Legendaria",3, 14);
        cartas[5] = new Carta("Veneno", "Épica",4, 14);
        cartas[6] = new Carta("Mago Electrico", "Legendaria",4, 14);
        cartas[7] = new Carta("Tronco", "Legendaria",2, 14);

        Mazo mazo = new Mazo(cartas,jugador1);
        mazo.promedioMazo(cartas);
        mazo.mostrarCartas(cartas);

        Arena arena = new Arena("Arena Legendaria");
        arena.mostrarArena();

        mazo.usarCarta(cartas);

    }
}