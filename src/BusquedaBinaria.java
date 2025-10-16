


// Implementación de búsqueda binaria en un arreglo de Strings ordenado.
public class BusquedaBinaria {

    public static int buscar(String[] arr, String objetivo) {
        int izq = 0;
        int der = arr.length - 1;

        while (izq <= der) {
            int medio = izq + (der - izq) / 2;
            int cmp = arr[medio].compareTo(objetivo);

            if (cmp == 0) {
                return medio; // Encontrado
            } else if (cmp < 0) {
                izq = medio + 1; // Buscar derecha
            } else {
                der = medio - 1; // Buscar izquierda
            }
        }

        return -1; // No encontrado
    }
}
