package agregacion;

public class Carta {
    private String nombre;
    private String calidad;
    private Integer costoElixir;
    private int level;

    public Carta(String nombre, String calidad, Integer costoElixir, int level) {
        this.nombre = nombre;
        this.calidad = calidad;
        this.costoElixir = costoElixir;
        this.level = level;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getCostoElixir() {
        return costoElixir;
    }
}
