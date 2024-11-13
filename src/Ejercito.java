import java.util.ArrayList;
import java.util.Random;

class Ejercito {
    private String reino;
    private ArrayList<Soldado> soldados;

    public Ejercito(String reino, Mapa mapa) {
        this.reino = reino;
        this.soldados = new ArrayList<>();
        Random random = new Random();
        int numSoldados = random.nextInt(10) + 1;
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

    public int getNumeroSoldados() {
        return soldados.size();
    }
}
