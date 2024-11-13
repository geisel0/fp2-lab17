import java.util.ArrayList;
import java.util.Random;

class Reino {
    private String nombre;
    private ArrayList<Ejercito> ejercitos;
    private String entornoFavorable;

    public Reino(String nombre, String entornoFavorable, Mapa mapa) {
        this.nombre = nombre;
        this.entornoFavorable = entornoFavorable;
        Random random = new Random();
        int numEjercitos = random.nextInt(10) + 1;
        ejercitos = new ArrayList<>();
        for (int i = 0; i < numEjercitos; i++) {
            ejercitos.add(new Ejercito(mapa));
        }
    }

    public void comprobarEntorno(String entornoMapa) {
        if (entornoFavorable.equals(entornoMapa)) {
            for (Ejercito ejercito : ejercitos) {
                for (Soldado soldado : ejercito.getSoldados()) {
                    soldado.incrementarVida();
                }
            }
            System.out.println("Entorno " + entornoMapa + " favorable, +1 de vida");
        }
    }

    public int getNivelVidaTotal() {
        int totalNivelVida = 0;
        for (Ejercito ejercito : ejercitos) {
            totalNivelVida += ejercito.getNivelVidaTotal();
        }
        return totalNivelVida;
    }

    public int getDanioTotal() {
        int totalDanio = 0;
        for (Ejercito ejercito : ejercitos) {
            totalDanio += ejercito.getTotalDanio();
        }
        return totalDanio;
    }

    public ArrayList<Ejercito> getEjercitos() {
        return ejercitos;
    }

    public String getNombre() {
        return nombre;
    }
}
