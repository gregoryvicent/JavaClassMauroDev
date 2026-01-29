package myBasic.c00_hello_world;

import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class HelloWorldExercises {
	public static void main(String[] args) {

        // 1. Imprime un mensaje que diga tu nombre en lugar de "¡Hola Mundo!".

        // 2. Imprime dos líneas: "Hola" y luego "Mundo" con un solo println.

        // 3. Añade un comentario sobre lo que hace cada línea del programa.

        // 4. Crea un comentario en varias líneas.

        // 5. Imprime tu edad, tu color favorito y tu ciudad.

        // 6. Explora los diferentes System.XXX.println(); más allá de "out".

        // 7. Utiliza varios println para imprimir una frase.

        // 8. Imprime un diseño ASCII (por ejemplo, una cara feliz usando símbolos).

        // 9. Intenta ejecutar el programa sin el método main y observa el error.

        //10. Intenta cambiar el nombre del archivo a uno diferente del de la clase y compílalo. ¿Qué pasa?

        /*
            Esto es un comentario
            multilínea, para contestar al ejercicio
            número 4
        */

        // Esta línea muestra en pantalla un mensaje de '¡Hello Gregory!'
        System.out.println("¡Hello Gregory!");
        // Esta línea muestra dos líneas en terminal, una línea con Hello y otra con Gregory
        System.out.println("Hola\nGregory");
        // Esto es un error
        System.err.println("Esto es un error!");
        // Edad y color favorito
        System.out.println("Mi color favorito es el azul y mi edad es 26 años");

    }
}
