package composicion;

import java.util.ArrayList;

public class Arena {
    private String nombre;
    private ArrayList<Torre> torresAliadas;
    private ArrayList<Torre> torresEnemigas;

    public Arena(String nombre) {
        this.nombre = nombre;
        this.torresAliadas = new ArrayList<>();
        crearTorresAliadas();
        this.torresEnemigas = new ArrayList<>();
        crearTorresEnemigas();
    }
    private void crearTorresAliadas() {
        torresAliadas.add(new Torre(11, "Torre de rey"));
        torresAliadas.add(new Torre(11, "Torre de princesa"));
        torresAliadas.add(new Torre(11, "Torre de princesa"));
    }
    private void crearTorresEnemigas() {
        torresEnemigas.add(new Torre(12, "Torre de rey"));
        torresEnemigas.add(new Torre(12, "Torre de princesa"));
        torresEnemigas.add(new Torre(12, "Torre de princesa"));
    }

    public void mostrarArena() {
        System.out.println("Bienvenido a la arena: " + nombre);
        System.out.println("Se crea la arena con las siguientes torres: ");
        for (Torre torre : torresAliadas) {
            System.out.println(torre.tipoTorre + " " + torre.nivel);
        }
        for (Torre torre : torresEnemigas) {
            System.out.println(torre.tipoTorre + " " + torre.nivel);
        }
    }
    private class Torre {
        private int nivel;
        private String tipoTorre;

        public Torre(int nivel, String tipoTorre) {
            this.nivel = nivel;
            this.tipoTorre = tipoTorre;
        }

        public void infoTorre() {
            System.out.println("La torre es del tipo: " + tipoTorre + " y tiene un nivel de " + nivel);
        }
    }
}
