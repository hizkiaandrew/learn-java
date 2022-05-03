public class Function {
    public static void main(String[] args) {
        /**
         * You can make a method to give a return value when the method was called
         *
         * You have to add a data type on return value if you want to make a return
         *
         * On Java you can only return one data, unlike other languages like GOLANG
         *
         * You can add number of return if you use IF function
         */

        var result = sum(100, 200, 300);
        System.out.println(result);

        System.out.println(operation(100, 200, "Add"));
        System.out.println(operation(100, 200, "Minus"));
        System.out.println(operation(100, 200, "Divide"));
    }

    static int sum(int a, int b, int c) {
        return a + b + c;
    }

    static int operation(int a, int b, String operation) {
        switch (operation) {
            case "Add" -> {
                return a + b;
            }
            case "Minus" -> {
                return a - b;
            }
            default -> {
                return 0;
            }
        }
    }
}
