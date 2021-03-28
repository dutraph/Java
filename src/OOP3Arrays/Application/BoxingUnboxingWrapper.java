package OOP3Arrays.Application;

public class BoxingUnboxingWrapper {

    public static void main(String[] args) {


        /* Boxing
         *  (Conversion process of an Object "value type (tipo valor)" to an compatible Object reference type)
         */
        int x = 20;
        Object obj = x; // an object will be allocated on HEAP with this value(20)


        /* Unboxing
         *  (Conversion process of an Object reference type to a compatible Object "value type (tipo valor)")
         */

        int y = (int) obj; // a box will be created on STACK with this value(20)


        /* Wrapper classes do the boxing and unboxing naturally (better use Wrapper classes in Entities classes
         *
         *
         * Wrapper Classes  - Primitive
         *    Double            double
         *    Integer           int
         *    Boolean           boolean
         */

    }
}