
public class PanelDePruebas {

    public static void main(String[] args) {

        // TODO: llamar a métodos de prueba
        probarTemperatura();
        probarContador();
        probarMensaje();
        probarCronometro();
    }

    public static void probarTemperatura() {
        // TODO: crear objetos y mostrar resultados
    }

    public static void probarContador() {
        // TODO: probar incrementar, decrementar, reset
    }

    public static void probarMensaje() {
        Mensaje hola = new Mensaje("Buenos Días compañero");
        System.out.println(hola.mostrar());
        System.out.println(hola.contarPalabras());
        System.out.println(hola.aMayusculas());
        System.out.println(hola.aMinusculas());
    }

    public static void probarCronometro() {
        // TODO: iniciar, tic, pausar, mostrarTiempo
    }
}