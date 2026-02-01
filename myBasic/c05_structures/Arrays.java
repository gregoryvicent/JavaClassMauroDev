package myBasic.c05_structures;

/*
 * NOTAS DE ESTUDIO - ARRAYS EN JAVA
 * 
 * ¿Qué es un Array?
 * - Estructura de datos que almacena múltiples valores del MISMO tipo
 * - Tamaño FIJO (no se puede cambiar después de crearlo)
 * - Los elementos se acceden mediante índices (empiezan en 0)
 * 
 * Valores por defecto:
 * - int/byte/short/long: 0
 * - float/double: 0.0
 * - boolean: false
 * - String/objetos: null
 */

public class Arrays {
    static void main(String[] args) {
        
        // ========== ARRAYS DE ENTEROS ==========
        
        // Forma 1: Inicialización directa con valores
        // El tamaño se determina automáticamente (5 elementos)
        int[] intArray = {1,2,3,4,5};
        
        // Forma 2: Declaración con tamaño específico
        // Se reserva espacio para 5 elementos con valor inicial 0
        int[] intArray2 = new int[5];
        intArray2[0] = 0;  // Asignación individual por índice
        intArray2[1] = 1;
        intArray2[2] = 2;
        intArray2[3] = 3;
        intArray2[4] = 4;  // Último índice válido: length - 1

        // Propiedad length: retorna el número total de elementos
        System.out.println(intArray.length);  // Imprime: 5
        
        // Acceso por índice (índice 3 = 4º elemento)
        System.out.println(intArray2[3]);  // Imprime: 3
        
        // ⚠️ IMPORTANTE: Acceder fuera del rango causa ArrayIndexOutOfBoundsException
        // System.out.println(intArray2[5]); // Error en tiempo de ejecución

        // ========== ARRAYS DE STRINGS ==========
        
        // Array con valores iniciales
        String[] myStringArray = {"Gregory", "Juan", "Anna", "Isabel"};
        
        // Array vacío (valores por defecto: null)
        String[] myStringArray2 = new String[4];

        System.out.println(myStringArray[0]);   // Imprime: Gregory
        System.out.println(myStringArray2[0]);  // Imprime: null (valor por defecto)

        // ========== ARRAYS DE BOOLEANOS ==========
        
        // Valor por defecto para boolean: false
        boolean[] myBooleanArray = new boolean[3];

        System.out.println(myBooleanArray[0]);  // Imprime: false
    }
}
