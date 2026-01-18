public class Temperatura {

    private double valor;
    private String unidad; // "C" o "F"

    public Temperatura(double valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }

    public double convertirACelsius() {
        // TODO: implementar conversión si la unidad es F
        return 0;
    }

    public double convertirAFahrenheit() {
        // TODO: implementar conversión si la unidad es C
        return 0;
    }

    public String mostrar() {
        return valor + " " + unidad;
    }
}