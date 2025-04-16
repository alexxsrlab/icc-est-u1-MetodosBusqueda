import java.util.Arrays;

import controllers.MetodosBusqueda;
import controllers.MetodosBusquedaBinaria;
import models.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        Persona[] personas = new Persona[7];
        personas[0] = new Persona(101, "Juan");
        personas[1] = new Persona(102, "Maria");
        personas[2] = new Persona(103, "Carlos");
        personas[3] = new Persona(104, "Ana");
        personas[4] = new Persona(105, "Luis");
        personas[5] = new Persona(106, "Sofia");
        personas[6] = new Persona(107, "Pedro");

       
        //MetodosBusqueda busqueda = new MetodosBusqueda(personas);
        MetodosBusquedaBinaria mBB = new MetodosBusquedaBinaria(personas);
        

        mBB.showPersonByCode();
        mBB.showPersonByName();

        

        /*
         * 
         * 
         * public static void main(String[] args) throws Exception {
         * MetodosBusqueda busqueda = new MetodosBusqueda();
         * int[] numeros = {3, 7, 9, 2, 14, 6};
         * int valor = 14;
         * 
         * int resultado = busqueda.busquedaLineal(numeros, valor);
         * 
         * System.out.print("EL arreglo es: ");
         * System.out.println( Arrays.toString(numeros));
         * System.out.println("Valor a buscar es: " + valor);
         * if (resultado != -1) {
         * System.out.println("Valor encontrado en la posición: " + resultado);
         * } else {
         * System.out.println("Valor no encontrado en el arreglo.");
         * }
         * }
         */

    }
}
