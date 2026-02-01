package myBasic.c05_structures;

import java.util.ArrayList;

/*
 * NOTAS DE ESTUDIO - ARRAYLIST EN JAVA
 * 
 * ¿Qué es un ArrayList?
 * - Estructura de datos dinámica (tamaño variable)
 * - Parte del paquete java.util
 * - Permite agregar, eliminar y modificar elementos
 * - Solo puede almacenar objetos (no tipos primitivos directos)
 * - Usa genéricos <Tipo> para especificar el tipo de datos
 * 
 * Diferencias con Arrays:
 * - Arrays: tamaño fijo
 * - ArrayList: tamaño dinámico (crece/decrece automáticamente)
 * 
 * Operaciones principales:
 * - add(): agregar elementos
 * - get(): acceder a elementos
 * - set(): modificar elementos
 * - remove(): eliminar elementos
 * - size(): obtener tamaño
 * - contains(): buscar elementos
 * - clear(): vaciar la lista
 */

public class Lists {
    static void main(String[] args) {

        // ========== DEFINICIÓN DE ARRAYLIST ==========
        
        // Forma explícita: especificando el tipo
        ArrayList<String> names = new ArrayList<>();
        
        // Forma con inferencia de tipo (var)
        // Nota: Integer es la clase wrapper de int (para usar en colecciones)
        var ages = new ArrayList<Integer>();

        // size() retorna el número de elementos (inicialmente 0)
        System.out.println(names.size());  // Imprime: 0
        System.out.println(ages.size());   // Imprime: 0

        // ========== AÑADIR ELEMENTOS ==========
        
        // add() agrega elementos al final de la lista
        names.add("Gregory");  // Índice 0
        names.add("Anna");     // Índice 1
        names.add("Marta");    // Índice 2

        // Imprime toda la lista: [Gregory, Anna, Marta]
        System.out.println(names);

        // ========== ACCEDER A ELEMENTOS ==========
        
        System.out.println(names.size());   // Imprime: 3
        
        // get(índice) accede al elemento en la posición especificada
        System.out.println(names.get(1));   // Imprime: Anna (índice 1)
        System.out.println(names.get(0));   // Imprime: Gregory (índice 0)
        
        // Métodos alternativos (disponibles en versiones recientes de Java)
//        System.out.println(names.getFirst());  // Primer elemento
        System.out.println(names.get(1));      // Imprime: Anna
//        System.out.println(names.getLast());   // Último elemento

        // ========== MODIFICAR ELEMENTOS ==========
        
        // set(índice, nuevoValor) reemplaza el elemento en la posición indicada
        names.set(0, "Gregory modificado");
        System.out.println(names.get(0));  // Imprime: Gregory modificado
        
        names.set(2, "Marta modificado");
        System.out.println(names.get(2));  // Imprime: Marta modificado

        // ========== ELIMINAR ELEMENTOS ==========
        
        // remove(índice) elimina el elemento y reorganiza los índices
        names.remove(1);  // Elimina "Anna" (índice 1)
        
        // Después de eliminar, los índices se ajustan automáticamente:
        // "Gregory modificado" sigue en índice 0
        // "Marta modificado" ahora está en índice 1 (antes era 2)
        System.out.println(names.get(0));  // Imprime: Gregory modificado
        System.out.println(names.get(1));  // Imprime: Marta modificado
        System.out.println(names.size());  // Imprime: 2
        
        // ⚠️ Intentar acceder al índice 2 causaría IndexOutOfBoundsException
//        System.out.println(names.get(2));

        // ========== BUSCAR ELEMENTOS ==========
        
        // contains(elemento) retorna true si el elemento existe en la lista
        System.out.println(names.contains("Gregory modificado"));  // Imprime: true

        // ========== LIMPIAR ARRAYLIST ==========
        
        // clear() elimina todos los elementos de la lista
        names.clear();
        System.out.println(names.size());  // Imprime: 0
    }
}
