package myBasic.c03_strings;

public class StringsCourse {
    public static void main(String[] args) {

        // Cadenas de texto

        String firstname = "Gregory";

        System.out.println(firstname);

        var lastname = new String("Vicent"); // Asi se puede llamar al constructor de la clase String.

        System.out.println(lastname);

        // Concatenación

        System.out.println(firstname + " " + lastname);

        // Length

        String myText = "Hello";

        System.out.println(myText.length());

        // charAt

        System.out.println(myText.charAt(1));

        // Substrings

        System.out.println(myText.substring(1));
        System.out.println(myText.substring(1, 4));

        // Minúsculas y mayúsculas

        System.out.println(myText.toUpperCase()); // Colocar todo el texto en mayúscula.
        System.out.println(myText.toLowerCase()); // Colocar todo el texto en minúsculas.

        // Contains

        String myStringTest = "Esto es un texto de prueba";

        System.out.println(myStringTest.contains("es")); // Retorna true
        System.out.println(myStringTest.contains("papa")); // Retorna false

        // Equals

        System.out.println(myText.equals("Hello")); // Retorna true
        System.out.println(myText.equals("Hola")); // Retorna false

        // Equals ignorando mayúsculas y minúsculas
        System.out.println(myText.equals("hello")); // Retorna false
        System.out.println(myText.equalsIgnoreCase("hello")); // retorna true

        String a = "Gregory";
        String b = "Gregory";
        var c = new String("Gregory");

        System.out.println("Pruebas de comparación");

        System.out.println(a == b);
        System.out.println(a == c);
        System.out.println(a.equals(b));
        System.out.println(a.equals(c));

        // Trim

        System.out.println("   Texto con espacio   ".trim());
        System.out.println("   Texto con espacio   ".trim());

        // Replace

        String testText = "Esto es un texto de pruebas";

        System.out.println(testText.replace("pruebas", "tomate"));
        System.out.println(testText.replace(" ", "/"));

        // Format

        int age = 26;
        String name = "Gregory";

        System.out.println(String.format("Mi nombre es %s, y tengo %d años", name, age));
    }
}
