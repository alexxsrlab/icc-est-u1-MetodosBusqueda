public class App {
    static MetodosBusqueda busqueda = new MetodosBusqueda();

    public static void main(String[] args) throws Exception {
        
        int[] numeros = {3, 7, 9, 2, 14, 6};
        int valor = 14;

        int resultado = busqueda.busquedaLineal(numeros, valor);

        if (resultado != -1) {
            System.out.println("Valor encontrado en la posición: " + resultado);
        } else {
            System.out.println("Valor no encontrado en el arreglo.");
        }
    }
}
