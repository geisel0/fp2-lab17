import java.util.Random;

class Mapa {
    private String entorno;
    private Ejercito[][] mapa;

    public Mapa() {
        String[] tiposDeEntorno = {"bosque", "campo abierto", "montaña", "desierto", "playa"};
        Random random = new Random();
        this.entorno = tiposDeEntorno[random.nextInt(tiposDeEntorno.length)];
        this.mapa = new Ejercito[10][10];
    }

    public String getEntorno() {
        return entorno;
    }

    public boolean posicionOcupada(int fila, int columna) {
        return mapa[fila][columna] != null;
    }

    public void agregarEjercito(int fila, int columna, Ejercito ejercito) {
        if (!posicionOcupada(fila, columna)) {
            mapa[fila][columna] = ejercito;
        }
    }

    public Ejercito[][] getMapa() {
        return mapa;
    }
}
