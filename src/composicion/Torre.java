package composicion;

public class Torre {
    private int nivel;
    private String tipoTorre;

    public Torre(int nivel, String tipoTorre) {
        this.nivel = nivel;
        this.tipoTorre = tipoTorre;
    }

    public void infoTorre() {
        System.out.println("La torre es del tipo: " + tipoTorre + " y tiene un nivel de " + nivel);
    }

    public int getNivel() {
        return nivel;
    }

    public String getTipoTorre() {
        return tipoTorre;
    }
}
