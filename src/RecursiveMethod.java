public class RecursiveMethod {
    public static void main(String[] args) {
        /**
         * Recursive Method : Method that calls it own method.
         *
         * Can be used on many cases like Factorial
         *
         * But if the recursive was too deep it will make an error Stack Overflow
         * because on Java there is only numerous method stacked on one time (Based on OS & Hardware)
         */

        System.out.println(factorialLoop(5));
        System.out.println(factorialRecursive(5));

        loop(10000);
    }

    /**
     * Example if using looping
     *
     * @param value
     * @return
     */
    static int factorialLoop(int value) {
        int result = 1;
        for (int i = value; i >= 1; i--) {
            result *= i;
        }
        return result;
    }

    /**
     * Example if using recursive method
     *
     * @param value
     * @return
     */
    static int factorialRecursive(int value) {
        if (value == 1) {
            return 1;
        } else {
            return value * factorialLoop(value - 1);
        }
    }

    /**
     * Example if using recursive method but caused a stackOverflow error
     */
    static void loop(int value) {
        if (value == 0) {
            System.out.println("Selesai");
        } else {
            System.out.println("Loop : " + value);
            loop(value - 1);
        }
    }
}
