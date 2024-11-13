import java.util.*;

public class App {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Seleccione el primer reino: Inglaterra, Francia, Castilla-Aragon, Moros, Sacro Imperio Romano-Germánico");
        String nombreReino1 = scanner.nextLine();
        System.out.println("Seleccione el segundo reino: Inglaterra, Francia, Castilla-Aragon, Moros, Sacro Imperio Romano-Germánico");
        String nombreReino2 = scanner.nextLine();

        Mapa mapa = new Mapa();
        System.out.println("Mapa creado, entorno: " + mapa.getEntorno());

        Reino reino1 = new Reino(nombreReino1, getEntornoFavorable(nombreReino1), mapa);
        Reino reino2 = new Reino(nombreReino2, getEntornoFavorable(nombreReino2), mapa);

        reino1.comprobarEntorno(mapa.getEntorno());
        reino2.comprobarEntorno(mapa.getEntorno());

        boolean enMenu = true;
        while (enMenu) {
            System.out.println("1. Ver datos de los reinos");
            System.out.println("2. Iniciar batalla");
            System.out.println("3. Salir");
            int opcion = scanner.nextInt();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Reino: " + reino1.getNombre() + ", Vida Total: " + reino1.getNivelVidaTotal() + ", Daño Total: " + reino1.getDanioTotal());
                    for (Ejercito ejercito : reino1.getEjercitos()) {
                        System.out.println("Ubicación Ejército: " + ejercito.getPosicion());
                    }
                    System.out.println("Reino: " + reino2.getNombre() + ", Vida Total: " + reino2.getNivelVidaTotal() + ", Daño Total: " + reino2.getDanioTotal());
                    for (Ejercito ejercito : reino2.getEjercitos()) {
                        System.out.println("Ubicación Ejército: " + ejercito.getPosicion());
                    }
                }
                case 2 -> {
                    int poder1 = reino1.getNivelVidaTotal() - reino2.getDanioTotal();
                    int poder2 = reino2.getNivelVidaTotal() - reino1.getDanioTotal();
                    int ganador = new Random().nextInt(poder1 + poder2) + 1;
                    System.out.println((ganador <= poder1 ? reino1.getNombre() : reino2.getNombre()) + " gana la guerra");
                }
                case 3 -> enMenu = false;
            }
        }
        scanner.close();
    }

    private static String getEntornoFavorable(String nombreReino) {
        return switch (nombreReino) {
            case "Inglaterra", "Sacro Imperio Romano-Germánico" -> "bosque";
            case "Francia" -> "campo abierto";
            case "Castilla-Aragon" -> "montaña";
            case "Moros" -> "desierto";
            default -> "";
        };
    }
}