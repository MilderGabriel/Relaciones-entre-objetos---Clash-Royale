package agregacion;

import asociacion.Jugador;

public class Mazo {
    private Jugador jugador;
    private Carta[] cartas;
    private double promedio;

    public Mazo(Carta[] cartas, Jugador jugador) {
        this.cartas = cartas;
        this.jugador = jugador;
    }

    public void mostrarCartas(Carta[] cartas) {
        System.out.println("Las cartas del mazo de " + jugador.getNombre() + " son: ");
        if (cartas.length == 8) {
            for (Carta carta : cartas) {
                System.out.println(carta.getNombre());
            }
        } else System.out.println("El mazo no puede tener menos o más de 8 cartas");
    }

    public void promedioMazo(Carta[] cartas) {
        double sumaTotal = 0;
        for (int i = 0; i < 8; i++) {
            sumaTotal += cartas[i].getCostoElixir();
        }
        System.out.println("El costo del mazo es " + sumaTotal/8);
    }
    public void usarCarta(Carta[] cartas) {
        System.out.println("El jugador " + jugador.getNombre() + " ha usado la carta " + cartas[1].getNombre());
    }
}