package myBasic.c07_functions;

/*
 * NOTAS DE ESTUDIO - FUNCIONES (MÉTODOS) EN JAVA
 * 
 * ¿Qué son las funciones?
 * - Bloques de código reutilizables que realizan una tarea específica
 * - En Java se llaman "métodos"
 * - Ayudan a organizar el código y evitar repetición
 * - Pueden recibir datos (parámetros) y devolver resultados (retorno)
 * 
 * SINTAXIS BÁSICA:
 * modificadorAcceso static tipoRetorno nombreFuncion(parámetros) {
 *     // código
 *     return valor; // si tipoRetorno no es void
 * }
 * 
 * TIPOS DE FUNCIONES:
 * 
 * 1. SIN PARÁMETROS NI RETORNO (void):
 *    - No reciben datos
 *    - No devuelven nada
 *    - Solo ejecutan acciones
 * 
 * 2. CON PARÁMETROS, SIN RETORNO (void):
 *    - Reciben datos para procesar
 *    - No devuelven nada
 *    - Ejecutan acciones con los datos recibidos
 * 
 * 3. CON PARÁMETROS Y CON RETORNO:
 *    - Reciben datos
 *    - Procesan los datos
 *    - Devuelven un resultado
 * 
 * SOBRECARGA DE MÉTODOS (Overloading):
 * - Crear múltiples funciones con el MISMO NOMBRE
 * - Pero con DIFERENTES parámetros (cantidad o tipo)
 * - Java elige automáticamente cuál ejecutar según los argumentos
 * 
 * MODIFICADORES:
 * - public: accesible desde cualquier clase
 * - static: pertenece a la clase, no a instancias (necesario para llamar desde main)
 * - void: no retorna ningún valor
 * - Otros tipos (int, String, etc.): especifican qué tipo de dato retorna
 * 
 * IMPORTANTE:
 * - Los parámetros son variables locales (solo existen dentro de la función)
 * - return finaliza la ejecución de la función y devuelve el valor
 * - Una función puede tener múltiples return, pero solo se ejecuta uno
 */

public class Functions {
    static void main(String[] args) {
        
        // ========== LLAMADAS A FUNCIONES SIN PARÁMETROS ==========
        
        // Llamar a la función sayHello() 5 veces usando un bucle
        for (int i = 0; i < 5; i++) {
            sayHello();  // Imprime "Hello" en cada iteración
        }

        // Llamada individual a la función
        sayHello();  // Imprime "Hello"

        // ========== LLAMADAS A FUNCIONES CON PARÁMETROS ==========
        
        // Llamar a sendEmail() con diferentes mensajes
        // Cada llamada pasa un String diferente como argumento
        sendEmail("Hello my friend");
        sendEmail("How are you?");
        sendEmail("I'm fine");
        sendEmail("It's cold here, we are going to your home on September sixth.");
        sendEmail("See you soon");

        // ========== SOBRECARGA: Llamada con 2 parámetros ==========
        
        // Java automáticamente llama a la versión de sendEmail con 2 parámetros
        sendEmail("Hola mi estimado", "Un caluroso saludo");

        // ========== SOBRECARGA: Llamada con array de Strings ==========
        
        // Crear un array de mensajes
        String[] messagesList = {
                "Hola camarada, debe unirse hoy al servicio militar.",
                "Pago de impuestos hoy a las 8 pm.",
                "Información adicional adjunta en el link adjunto.",
                "Fuiste el ganador de una rifa.",
        };

        // Java llama a la versión de sendEmail que acepta un array
        sendEmail(messagesList);

        // ========== FUNCIONES CON RETORNO ==========
        
        // add() retorna un int, podemos imprimirlo directamente
        System.out.println(add(3, 5));      // Imprime: 8
        System.out.println(add(4, 2));      // Imprime: 6
        System.out.println(add(9, 1));      // Imprime: 10
        System.out.println(add(23, 224));   // Imprime: 247
        
        // También podemos guardar el resultado en una variable:
        // int resultado = add(3, 5);
        // System.out.println(resultado);
    }

    // ========== FUNCIÓN SIN PARÁMETROS NI RETORNO ==========
    
    /**
     * Función simple que imprime "Hello"
     * - public: accesible desde cualquier clase
     * - static: se puede llamar sin crear un objeto de la clase
     * - void: no retorna ningún valor
     * - No recibe parámetros (paréntesis vacíos)
     */
    public static void sayHello() {
        System.out.println("Hello");
    }

    // ========== FUNCIÓN CON PARÁMETROS, SIN RETORNO ==========
    
    /**
     * Función que recibe un mensaje y lo imprime
     * @param message - String que se imprimirá
     */
    public static void sendEmail(String message) {
        // %s = marcador para String, %n = salto de línea
        System.out.printf("Message: %s%n", message);
    }

    // ========== SOBRECARGA DE FUNCIONES (Overloading) ==========
    
    /**
     * Versión sobrecargada de sendEmail con 2 parámetros
     * Mismo nombre, diferentes parámetros
     * @param message - Cuerpo del mensaje
     * @param subject - Asunto del mensaje
     */
    public static void sendEmail(String message, String subject) {
        System.out.printf("Subject: %sMessage: %s%n", subject, message);
    }

    /**
     * Versión sobrecargada de sendEmail que acepta un array
     * Mismo nombre, tipo de parámetro diferente (array en lugar de String simple)
     * @param messages - Array de mensajes a imprimir
     */
    public static void sendEmail(String[] messages) {
        // for-each: itera sobre cada elemento del array
        for (String message : messages) {
            System.out.printf("Message: %s%n", message);
        }
    }

    // ========== FUNCIÓN CON PARÁMETROS Y RETORNO ==========
    
    /**
     * Función que suma dos números y retorna el resultado
     * - int (antes del nombre): especifica que retorna un entero
     * - return: devuelve el valor calculado
     * @param num1 - Primer número a sumar
     * @param num2 - Segundo número a sumar
     * @return La suma de num1 + num2
     */
    public static int add(int num1, int num2) {
        return num1 + num2;  // Calcula y retorna la suma
    }
    
    // Otros ejemplos de funciones con retorno:
    // public static String concatenar(String a, String b) { return a + b; }
    // public static boolean esPar(int n) { return n % 2 == 0; }
    // public static double calcularPromedio(int[] numeros) { ... }
}
