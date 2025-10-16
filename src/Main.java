import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Ingrese el tamaño del arreglo de palabras: ");
        int n = scanner.nextInt();
        scanner.nextLine();

        String[] palabras = new String[n];
        System.out.println("Ingrese " + n + " palabras:");
        for (int i = 0; i < n; i++) {
            System.out.print("Palabra " + (i + 1) + ": ");
            palabras[i] = scanner.nextLine();
        }

        // Mostrar menú y obtener opción
        int opcion = Menu.mostrarMenu(scanner);

        scanner.nextLine();

        // Ordenar según la opción
        Ordenamiento.ordenar(palabras, opcion);

        // Mostrar arreglo ordenado
        System.out.println("\nArreglo ordenado:");
        for (String palabra : palabras) {
            System.out.println(palabra);
        }

        // Búsqueda binaria
        System.out.print("\nIngrese una palabra para buscar: ");
        String palabraBuscada = scanner.nextLine();

        int resultado = BusquedaBinaria.buscar(palabras, palabraBuscada);

        if (resultado != -1) {
            System.out.println("✅ La palabra '" + palabraBuscada + "' se encontró en la posición: " + resultado);
        } else {
            System.out.println("❌ La palabra '" + palabraBuscada + "' no se encontró.");
        }

        scanner.close();
    }
}