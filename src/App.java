import java.util.*;

public class App{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        Mapa mapa = new Mapa();

        Reino reino1 = new Reino("Francia", "campo abierto", mapa);
        Reino reino2 = new Reino("Inglaterra", "bosque", mapa);

        // Agregar ejércitos en posiciones aleatorias
        Random random = new Random();
        for (Reino reino : new Reino[]{reino1, reino2}) {
            for (Ejercito ejercito : reino.getEjercitos()) {
                int fila = random.nextInt(10);
                int columna = random.nextInt(10);
                mapa.agregarEjercito(fila, columna, ejercito);
            }
        }

        System.out.println("Mapa creado con entorno: " + mapa.getEntorno());
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Mostrar datos de los reinos");
            System.out.println("2. Mostrar mapa");
            System.out.println("3. Iniciar guerra");
            System.out.println("4. Salir");
            int opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Reino 1: " + reino1.getNombre());
                    System.out.println("Reino 2: " + reino2.getNombre());
                    break;
                case 2:
                    mapa.mostrarMapa();
                    break;
                case 3:
                    System.out.println("Iniciando guerra...");
                    // Aquí se puede implementar la lógica para la guerra.
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida.");
            }
        }
    }
}
