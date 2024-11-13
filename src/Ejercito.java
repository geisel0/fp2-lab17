import java.util.ArrayList;
import java.util.Random;

class Ejercito {
    private String reino;
    private ArrayList<Soldado> soldados;

    public Ejercito(String reino) {
        this.reino = reino;
        Random random = new Random();
        int numSoldados = random.nextInt(10) + 1;
        soldados = new ArrayList<>();
        for (int i = 0; i < numSoldados; i++) {
            soldados.add(new Soldado());
        }
    }

    public String getReino() {
        return reino;
    }

    public ArrayList<Soldado> getSoldados() {
        return soldados;
    }

    public int getNivelVidaTotal() {
        int totalNivelVida = 0;
        for (Soldado soldado : soldados) {
            totalNivelVida += soldado.getNivelVida();
        }
        return totalNivelVida;
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
}
