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

    public void mostrarMapa() {
        System.out.println("   A  B  C  D  E  F  G  H  I  J");
        for (int i = 0; i < 10; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < 10; j++) {
                if (mapa[i][j] != null) {
                    Ejercito ejercito = mapa[i][j];
                    System.out.print(ejercito.getReino().substring(0, 2).toUpperCase() + ejercito.getNumeroSoldados() + " ");
                } else {
                    System.out.print("---- ");
                }
            }
            System.out.println();
        }
    }
}
