public class MethodVariableArgument {
    public static void main(String[] args) {
        /**
         * You can add a multiple value on method parameter using argument
         * The argument will be read as an array
         *
         * To Use argument you have to specified it with <data type> + '...'
         * Argument must be specified on last parameter on method.
         */
        int[] values = {50, 100, 60, 75};
        sayCongrats("Hizkia", values);

        sayCongratsArg("Bokir", 65, 70, 80, 90);
    }

    /**
     * Example if not using argument parameter
     *
     * @param name
     * @param values
     */
    static void sayCongrats(String name, int[] values) {
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var result = total / values.length;

        if (result < 75) {
            System.out.println("Sorry " + name + " Anda tidak lulus");
        } else {
            System.out.println("Congrats " + name + " Anda lulus");
        }
    }

    /**
     * Example if using argument parameter
     *
     * @param name
     * @param values
     */
    static void sayCongratsArg(String name, int... values) {
        /**
         * You can add an array to values too
         */
        var total = 0;
        for (var value : values) {
            total += value;
        }

        var result = total / values.length;

        if (result < 75) {
            System.out.println("Sorry " + name + " Anda tidak lulus");
        } else {
            System.out.println("Congrats " + name + " Anda lulus");
        }
    }
}
