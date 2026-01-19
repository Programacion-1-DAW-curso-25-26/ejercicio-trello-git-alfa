public class Mensaje {
    // ATRIBUTOS
    private String texto;

    public Mensaje(String texto) {
        this.texto = texto;
    }

    public int contarPalabras() {
        // Quitamos los espacios del inicio y del final con el trim ()
        // Con split("\\s+") dividimos el texto por espacios
        int palabras = texto.trim().split("\\s+").length;
        return palabras;
    }

    public String aMayusculas() {
        return texto.toUpperCase();
    }

    public String aMinusculas() {
        return texto.toLowerCase();
    }

    public String mostrar() {
        return texto;
    }
}