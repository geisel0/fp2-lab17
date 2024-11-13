import java.util.Random;

class Soldado {
    private int nivelVida;
    private int danio;
    private int defensa;

    public Soldado() {
        Random random = new Random();
        this.nivelVida = random.nextInt(5) + 1;
        this.danio = random.nextInt(5) + 1;
        this.defensa = random.nextInt(5) + 1;
    }

    public int getNivelVida() {
        return nivelVida;
    }

    public void incrementarVida() {
        this.nivelVida += 1;
    }

    public int getDanio() {
        return danio;
    }

    public int getDefensa() {
        return defensa;
    }
}
