package Basics;

import java.util.Locale;

public class StringFunctions {

    public static void main(String[] args) {

        /*
         * Formatar: toLowerCase(), toUpperCase(), trim()
         * Recortar: substring(inicio), substring(inicio, fim)
         * Substituir: replace(char, char), replace(string, string)
         * Buscar: indexOf, LastIndexOf
         * str.Split(" ")
         */

        String original = "abcde FGHIJ ABC abc DEFG   ";
        String s1 = original.toLowerCase();
        String s2 = original.toUpperCase();
        String s3 = original.trim();
        String s4 = original.substring(4);
        String s5 = original.substring(4,10); // 10 nao é incluido
        String s6 = original.replace("ABC","XYZ");
        int s7 = original.indexOf("bc");
        int s8 = original.lastIndexOf("bc");

        // Split
        String fruits = "Apple Grape Kiwi";
        String[] vect = fruits.split(" ");
        String f1 = vect[0];
        String f2 = vect[1];
        String f3 = vect[2];
        System.out.println(f1);
        System.out.println(f2);
        System.out.println(f3);


        System.out.println("Original: -" + original + "-");
        System.out.println("To lower case: -" + s1 + "-");
        System.out.println("To upper case: -" + s2 + "-");
        System.out.println("Trim: -" + s3 + "-");
        System.out.println("Substring inicio index(4): -" + s4 + "-");
        System.out.println("Substring ini e fim index(4, 10) : -" + s5 + "-");
        System.out.println("Replace(ABC, XYZ) : -" + s6 + "-");
        System.out.println("First indexOf(bc) : " + s7);
        System.out.println("Last indexOf(bc) : " + s8);
    }
}
