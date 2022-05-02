public class OperasiMatematika {
    public static void main(String[] args) {
        /**
         * Mathematical Operation
         *  + -> add
         *  - -> minus
         *  * -> multiply
         *  / -> divide
         *  % -> mod (sisa bagi)
         */

        int a = 100;
        int b = 10;
        System.out.println("Add : " + (a+b));
        System.out.println("Minus : " + (a-b));
        System.out.println("Multiply : " + (a*b));
        System.out.println("Divide : " + (a/b));
        System.out.println("Mod : " + (a%b));

        /**
         * Augmented Assignment
         * example : a = a + 10; -> a += 10;
         * can be applied to another operation
         */
        System.out.println("Augmented : " + (a += 10));

        /**
         * Unary Operator
         * example : a++ -> a = a + 1
         * example : ++a -> a - 1 = a
         *
         * '-' -> negative
         * '+' -> positive
         * '!' -> opposite
         */
        int unaryPos = +100;
        int unaryNeg = -10;
        boolean unaryBool = true;

        System.out.println(unaryPos++); //100
        System.out.println(unaryNeg--); //-10
        System.out.println(++unaryPos); //102
        System.out.println(--unaryNeg); //-12
        System.out.println(!unaryBool); //false
    }
}
