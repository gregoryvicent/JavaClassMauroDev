package myBasic.c05_structures;

import java.util.HashSet;

/*
 * NOTAS DE ESTUDIO - SETS (CONJUNTOS) EN JAVA
 * 
 * ¿Qué es un Set?
 * - Colección que NO permite elementos DUPLICADOS
 * - NO mantiene un orden específico de los elementos (HashSet)
 * - Parte del paquete java.util
 * - Basado en la teoría matemática de conjuntos
 * 
 * Características principales:
 * - Elementos únicos: si intentas agregar un duplicado, lo ignora
 * - Sin índices: no puedes acceder por posición como en ArrayList
 * - Tamaño dinámico: crece/decrece automáticamente
 * 
 * Implementaciones comunes:
 * - HashSet: más rápido, sin orden
 * - LinkedHashSet: mantiene orden de inserción
 * - TreeSet: mantiene elementos ordenados
 * 
 * Métodos principales:
 * - add(elemento): agrega un elemento (ignora si ya existe)
 * - remove(elemento): elimina un elemento
 * - contains(elemento): verifica si existe un elemento
 * - size(): retorna el número de elementos
 * - addAll(otroSet): une dos conjuntos (unión)
 * - removeAll(otroSet): elimina elementos que están en otro conjunto (diferencia)
 * - retainAll(otroSet): mantiene solo elementos comunes (intersección)
 * - clear(): vacía el conjunto
 * 
 * Casos de uso:
 * - Eliminar duplicados de una colección
 * - Verificar membresía rápidamente
 * - Operaciones matemáticas de conjuntos (unión, intersección, diferencia)
 */

public class Sets {
    static void main(String[] args) {

        // ========== DECLARACIÓN Y CREACIÓN DE UN SET ==========
        
        // HashSet: implementación más común de Set
        // No mantiene orden, pero es muy eficiente
        HashSet<String> names = new HashSet<>();
        
        // Usando inferencia de tipo con var
        var ages = new HashSet<Integer>();

        // size() retorna el número de elementos (inicialmente 0)
        System.out.println(names.size());  // Imprime: 0
        System.out.println(ages.size());   // Imprime: 0

        // ========== AÑADIR ELEMENTOS ==========
        
        // add() agrega elementos al conjunto
        // Si el elemento ya existe, NO lo agrega (característica principal de Set)
        names.add("Gregory");
        names.add("Rosa");
        names.add("Simon");

        // El orden de impresión puede variar (HashSet no garantiza orden)
        System.out.println(names);  // Ejemplo: [Simon, Gregory, Rosa]
        System.out.println(names.size());  // Imprime: 3

        // ========== REMOVER ELEMENTOS ==========
        
        // remove(elemento) elimina el elemento especificado
        names.remove("Rosa");

        System.out.println(names);  // Imprime: [Simon, Gregory] (orden puede variar)

        // ========== ACCEDER/BUSCAR ELEMENTOS ==========
        
        // contains(elemento) verifica si el elemento existe en el conjunto
        // Retorna boolean (true o false)
        // Nota: No hay get() porque Set no tiene índices
        System.out.println(names.contains("Gregory"));  // Imprime: true

        // ========== OPERACIONES ENTRE CONJUNTOS ==========
        
        // Crear otro conjunto para demostrar operaciones
        HashSet<String> otherNames = new HashSet<>();
        otherNames.add("Laura");
        otherNames.add("Monica");
        otherNames.add("Daniel");

        System.out.println(otherNames);  // Imprime: [Daniel, Laura, Monica] (orden puede variar)

        // addAll(otroSet): UNIÓN de conjuntos
        // Agrega todos los elementos de 'names' a 'otherNames'
        // Elementos duplicados se ignoran automáticamente
        otherNames.addAll(names);

        System.out.println(otherNames);  // Imprime: [Daniel, Laura, Monica, Simon, Gregory]
        // Ahora contiene: Laura, Monica, Daniel, Gregory, Simon

        // removeAll(otroSet): DIFERENCIA de conjuntos
        // Elimina de 'otherNames' todos los elementos que están en 'names'
        otherNames.removeAll(names);

        System.out.println(otherNames);  // Imprime: [Daniel, Laura, Monica]
        // Ahora solo contiene: Laura, Monica, Daniel (los que no estaban en 'names')
        
        // Otras operaciones útiles:
        // retainAll(otroSet): INTERSECCIÓN - mantiene solo elementos comunes
        // clear(): vacía completamente el conjunto
    }
}
