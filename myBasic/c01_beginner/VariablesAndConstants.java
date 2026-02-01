package myBasic.c01_beginner;

/*
 * NOTAS DE ESTUDIO - VARIABLES Y CONSTANTES EN JAVA
 * 
 * VARIABLES:
 * - Contenedores que almacenan datos que PUEDEN cambiar
 * - Sintaxis: TipoDato nombreVariable = valor;
 * - Nombres en camelCase (primera palabra minúscula, siguientes con mayúscula inicial)
 * - Pueden ser reasignadas con nuevos valores
 * 
 * CONSTANTES:
 * - Contenedores que almacenan datos que NO PUEDEN cambiar
 * - Se declaran con la palabra clave 'final'
 * - Sintaxis: final TipoDato NOMBRE_CONSTANTE = valor;
 * - Por convención se escriben en MAYÚSCULAS con guiones bajos (_)
 * - Intentar modificarlas causa error de compilación
 * 
 * VAR (Inferencia de tipo):
 * - Palabra clave introducida en Java 10
 * - El compilador deduce automáticamente el tipo de dato
 * - Solo se puede usar con variables locales (dentro de métodos)
 * - Debe inicializarse en la misma línea de declaración
 * - Hace el código más conciso pero menos explícito
 */

public class VariablesAndConstants {
    public static void main(String[] args) {
        
        // ========== VARIABLES ==========
        
        // Declaración e inicialización de una variable String
        // Las variables PUEDEN cambiar su valor
        String dataString = "patata";
        System.out.println(dataString);  // Imprime: patata
        
        // Reasignación: cambiamos el valor de la variable
        dataString = "potato";
        System.out.println(dataString);  // Imprime: potato
        
        // Variable de tipo entero
        int dataInt = 1;
        System.out.println(dataInt);  // Imprime: 1

        // ========== CONSTANTES ==========
        
        // 'final' indica que el valor NO puede cambiar después de la asignación
        // Convención: nombres en MAYÚSCULAS para constantes
        final int AGE = 26;
        System.out.println(AGE);  // Imprime: 26
        
        // ⚠️ Intentar modificar una constante causa error de compilación
        // AGE = 27;  // Error: cannot assign a value to final variable AGE
        // System.out.println(AGE);

        // ========== VAR (Inferencia de tipo) ==========
        
        // 'var' permite que Java deduzca automáticamente el tipo
        // En este caso, Java infiere que 'any' es de tipo String
        var any = "String data";
        System.out.println(any);  // Imprime: String data
        
        // Nota: 'any' sigue siendo de tipo String, no puede cambiar de tipo
        // any = 123;  // Error: incompatible types
    }
}
