import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        Reino reino1 = new Reino("Inglaterra", "bosque");
        Reino reino2 = new Reino("Francia", "campo abierto");
        
        Mapa mapa = new Mapa();
        
        System.out.println("Mapa creado. Entorno: " + mapa.getEntorno());
        
        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Mostrar datos de los reinos");
            System.out.println("2. Mostrar mapa");
            System.out.println("3. Iniciar guerra");
            System.out.println("4. Salir");
            System.out.print("Elija una opción: ");
            
            int opcion = scan.nextInt();
            
            switch (opcion) {
                case 1:
                    mostrarDatosReinos(reino1, reino2);
                    break;
                case 2:
                    mapa.mostrarMapa();
                    break;
                case 3:
                    iniciarGuerra(reino1, reino2);
                    break;
                case 4:
                    System.out.println("Saliendo...");
                    return;
                default:
                    System.out.println("Opción no válida");
            }
        }
    }

    public static void mostrarDatosReinos(Reino reino1, Reino reino2) {
        System.out.println("Reino 1: " + reino1.getNombre());
        System.out.println("Total vida: " + reino1.getNivelVidaTotal());
        System.out.println("Total daño: " + reino1.getDanioTotal());
        
        System.out.println("Reino 2: " + reino2.getNombre());
        System.out.println("Total vida: " + reino2.getNivelVidaTotal());
        System.out.println("Total daño: " + reino2.getDanioTotal());
    }

    public static void iniciarGuerra(Reino reino1, Reino reino2) {
        int poderReino1 = reino1.getNivelVidaTotal() + reino1.getDanioTotal();
        int poderReino2 = reino2.getNivelVidaTotal() + reino2.getDanioTotal();
        
        if (poderReino1 > poderReino2) {
            System.out.println("Gana " + reino1.getNombre() + " con poder: " + poderReino1);
        } else if (poderReino1 < poderReino2) {
            System.out.println("Gana " + reino2.getNombre() + " con poder: " + poderReino2);
        } else {
            System.out.println("Empate entre los reinos");
        }
    }
}
