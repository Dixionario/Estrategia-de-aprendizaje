import java.util.Scanner;

public class Menu {
    public static int mostrarMenu(Scanner scanner) {
        System.out.println("\n=== Seleccione un algoritmo de ordenamiento ===");
        System.out.println("1. Ordenamiento por Selección");
        System.out.println("2. Ordenamiento por Inserción");
        System.out.println("3. Ordenamiento Burbuja");
        System.out.println("4. Ordenamiento por Mezcla (Merge Sort)");
        System.out.println("5. Ordenamiento Rápido (Quick Sort)");
        System.out.print("Opción: ");

        int opcion = scanner.nextInt();
        while (opcion < 1 || opcion > 5) {
            System.out.print("Opción inválida. Intente de nuevo: ");
            opcion = scanner.nextInt();
        }
        return opcion;
    }
}
