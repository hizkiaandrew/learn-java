public class MethodOverloading {
    public static void main(String[] args) {
        /**
         * On Java you can make a method with same name.
         * But you have to make those methods' parameter different
         * Like number of parameter or its data type
         */

        sayHello();
        sayHello("Bokir");
        sayHello("Hizkia", "Andrew");
    }

    static void sayHello() {
        System.out.println("Hello!");
    }

    static void sayHello(String name) {
        System.out.println("Hello " + name);
    }

    static void sayHello(String firstName, String lastName) {
        System.out.println("Hello " + firstName + ' ' + lastName);
    }
}
