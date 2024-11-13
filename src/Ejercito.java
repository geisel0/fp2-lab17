import java.util.ArrayList;
import java.util.Random;

class Ejercito {
    private ArrayList<Soldado> soldados;
    private int fila;
    private int columna;

    public Ejercito(Mapa mapa) {
        Random random = new Random();
        int numSoldados = random.nextInt(10) + 1;
        soldados = new ArrayList<>();
        for (int i = 0; i < numSoldados; i++) {
            soldados.add(new Soldado());
        }
        posicionarEjercito(mapa);
    }

    private void posicionarEjercito(Mapa mapa) {
        Random random = new Random();
        do {
            fila = random.nextInt(10);
            columna = random.nextInt(10);
        } while (mapa.posicionOcupada(fila, columna));
        mapa.agregarEjercito(fila, columna, this);
    }

    public int getTotalDanio() {
        int totalDanio = 0;
        for (Soldado soldado : soldados) {
            totalDanio += soldado.getDanio();
        }
        return totalDanio;
    }

    public int getTotalDefensa() {
        int totalDefensa = 0;
        for (Soldado soldado : soldados) {
            totalDefensa += soldado.getDefensa();
        }
        return totalDefensa;
    }

    public int getNivelVidaTotal() {
        int totalVida = 0;
        for (Soldado soldado : soldados) {
            totalVida += soldado.getNivelVida();
        }
        return totalVida;
    }

    public String getPosicion() {
        return "(" + fila + "," + columna + ")";
    }

    public Soldado[] getSoldados() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getSoldados'");
    }
}
