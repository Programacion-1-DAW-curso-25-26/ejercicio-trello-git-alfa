public class Contador {

    private int valor;

    public Contador() {
        valor = 0;
    }

    public void incrementar() {
        valor++;
    }

    public void decrementar() {
        if (valor > 0) {
            valor--;
        }
    }

    public void reset() {
        valor = 0;
    }

    public String mostrar() {
        return "Valor: " + valor;
    }
}
