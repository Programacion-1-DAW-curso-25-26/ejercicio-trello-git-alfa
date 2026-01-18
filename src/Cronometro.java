public class Cronometro {

    private int segundos;
    private boolean enMarcha;

    public Cronometro() {
        segundos = 0;
        enMarcha = false;
    }

    public void iniciar() {
        enMarcha = true;
    }

    public void pausar() {
        enMarcha = false;
    }

    public void reiniciar() {
        segundos = 0;
    }

    public void tic() {
        // TODO: solo sumar si está en marcha
    }

    public String mostrarTiempo() {
        return "Tiempo: " + segundos + "s";
    }
}