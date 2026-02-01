package myBasic.myTests;

import java.util.Arrays;
import java.util.stream.IntStream;

/*
 * NOTAS DE ESTUDIO - STREAMS EN JAVA
 * 
 * ¿Qué son los Streams?
 * - API introducida en Java 8 para procesar colecciones de datos
 * - Permiten operaciones funcionales sobre secuencias de elementos
 * - NO modifican la fuente original (inmutables)
 * - Se procesan de forma declarativa (qué hacer, no cómo hacerlo)
 * 
 * Características principales:
 * - Lazy evaluation: las operaciones intermedias no se ejecutan hasta una operación terminal
 * - Pipeline: encadenar múltiples operaciones
 * - Un stream solo se puede usar UNA VEZ (después se consume)
 * 
 * TIPOS DE OPERACIONES:
 * 
 * 1. OPERACIONES INTERMEDIAS (retornan un nuevo Stream):
 *    - filter(predicado): filtra elementos que cumplen una condición
 *    - map(función): transforma cada elemento
 *    - peek(acción): ejecuta una acción sin modificar el stream (útil para debug)
 *    - sorted(): ordena elementos
 *    - distinct(): elimina duplicados
 *    - limit(n): limita a n elementos
 * 
 * 2. OPERACIONES TERMINALES (retornan un resultado final):
 *    - toArray(): convierte a array
 *    - collect(): recolecta en una colección
 *    - count(): cuenta elementos
 *    - forEach(): ejecuta una acción para cada elemento
 *    - reduce(): combina elementos en un solo valor
 *    - anyMatch/allMatch/noneMatch(): verifican condiciones
 * 
 * SINTAXIS LAMBDA:
 * - n -> n * 2: función lambda (parámetro -> expresión)
 * - System.out::println: method reference (referencia a método)
 * 
 * IMPORTANTE:
 * - Los streams se consumen después de una operación terminal
 * - Necesitas crear un nuevo stream para procesarlo nuevamente
 */

public class streams {
    static void main(String[] args) {
        
        // Array de datos original
        int[] data = {1,2,3,4,5};

        // ========== EJEMPLO 1: Pipeline completo con filter, map y peek ==========
        
        // Crear un stream desde el array
        IntStream stream = Arrays.stream(data);
        
        // Pipeline de operaciones:
        // 1. filter(n -> n % 2 == 0): filtra solo números pares (2, 4)
        // 2. map(n -> n * 2): multiplica cada número por 2 (4, 8)
        // 3. peek(System.out::println): imprime cada elemento (para debug)
        // 4. toArray(): convierte el resultado a array [4, 8]
        int[] streamFiltered = stream
            .filter(n -> n % 2 == 0)      // Filtra pares: [2, 4]
            .map(n -> n * 2)              // Multiplica por 2: [4, 8]
            .peek(System.out::println)    // Imprime: 4, 8
            .toArray();                   // Convierte a array
        
        // Resultado: streamFiltered = [4, 8]

        System.out.println("////////////////////////////////////////////////////////////////");

        // ========== EJEMPLO 2: Nuevo stream (el anterior ya se consumió) ==========
        
        // IMPORTANTE: Necesitamos crear un NUEVO stream porque el anterior ya se usó
        // Intentar reutilizar 'stream' causaría: IllegalStateException
        IntStream stream2 = Arrays.stream(data);

        // Pipeline más simple:
        // 1. map(n -> 2 * n): multiplica cada número por 2 (2, 4, 6, 8, 10)
        // 2. peek(System.out::println): imprime cada elemento
        // 3. toArray(): convierte a array [2, 4, 6, 8, 10]
        int[] watchingData = stream2
            .map(n -> 2 * n)              // Multiplica por 2: [2, 4, 6, 8, 10]
            .peek(System.out::println)    // Imprime: 2, 4, 6, 8, 10
            .toArray();                   // Convierte a array
        
        // Resultado: watchingData = [2, 4, 6, 8, 10]

        // ========== CÓDIGO COMENTADO: Ejemplos de errores comunes ==========

        // ERROR 1: No se puede usar peek() en un array (solo en streams)
        // int[] result = streamFiltered.peek(n -> System.out.println(n)).toArray();
        // streamFiltered es un int[], no un Stream

        // ERROR 2: No se puede usar count() en un array (solo en streams)
        // System.out.println(streamFiltered.count());
        // streamFiltered es un int[], no un Stream
        
        // CORRECTO: Para procesar streamFiltered, crear un nuevo stream:
        // IntStream newStream = Arrays.stream(streamFiltered);
        // long count = newStream.count();  // Retorna: 2
        
        // Otros ejemplos útiles de operaciones terminales:
        // - sum(): suma todos los elementos
        // - average(): calcula el promedio
        // - max()/min(): encuentra el máximo/mínimo
        // - findFirst(): obtiene el primer elemento
    }
}
