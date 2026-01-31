package myBasic.c01_beginner;

public class VariablesAndConstants {
    public static void main(String[] args) {
        // Variables
        String dataString = "patata";
        System.out.println(dataString);
        dataString = "potato";
        System.out.println(dataString);
        int dataInt = 1;
        System.out.println(dataInt);

        // Constants
        final int AGE = 26; // Por buena práctica en Java se usan solo mayúsculas para definir constantes
        System.out.println(AGE);
        // age = 27; Si se trata de cambiar un valor asignado como 'final' se dispara un error
        // System.out.println(age);

        // var
        var any = "String data";
        System.out.println(any);
    }
}
