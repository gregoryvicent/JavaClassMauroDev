package myBasic.c00_hello_world;

public class ExercisesVariablesAndConstants {
    public static void main(String[] args) {
        // 1. Declara una variable de tipo String y asígnale tu nombre.

        String myName = "Gregory Vicent";

        // 2. Crea una variable de tipo int y asígnale tu edad.

        int myAge = 26;

        // 3. Crea una variable double con tu altura en metros.

        double myHeight = 1.75;

        // 4. Declara una variable de tipo boolean que indique si te gusta programar.

        boolean doYouLikeProgramming = true;

        // 5. Declara una constante con tu email.

        final String email = "gregoryvicent.dev@gmail.com";

        // 6. Crea una variable de tipo char y guárdale tu inicial.

        char myChar = 'G';

        // 7. Declara una variable de tipo String con tu localidad, y a continuación cambia su valor y vuelve a imprimirla.

        String myAddress = "Caracas, Venezuela";
        myAddress = "Cúcuta, Colombia";

        // 8. Crea una variable int llamada a, otra b, e imprime la suma de ambas.

        int a = 1;
        Integer b = 2;

        System.out.println(a + b);

        // 9. Imprime el tipo de dos variables creadas anteriormente.

        System.out.println(myAddress.getClass().getSimpleName());
        System.out.println(b.getClass().getSimpleName());

        // 10. Intenta declarar una variable sin inicializarla y luego asígnale un valor antes de imprimirla.
        int aNumber;
        aNumber = a + b;
        System.out.println(aNumber);
    }
}
