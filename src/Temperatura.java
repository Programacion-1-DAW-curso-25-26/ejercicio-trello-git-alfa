public class Temperatura {

    private double valor;
    private String unidad; // "C" o "F"

    public Temperatura(double valor, String unidad) {
        this.valor = valor;
        this.unidad = unidad;
    }

    public double convertirACelsius() {
        if (unidad.equals("F")) {
            return (valor - 32) * 5 / 9;
        }
        return valor;
    }

    public double convertirAFahrenheit() {
        if (unidad.equals("C")) {
            return (valor * 9 / 5) + 32;
        }
        return valor;
    }

    public String mostrar() {
        return valor + " " + unidad;
    }
}