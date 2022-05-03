public class Scope {
    public static void main(String[] args) {
        /**
         * On Java variable can only be access on its own block
         * if called on another block it will show an error
         *
         * But variable can be called by its own node block
         */

        sayHello("Hizkia");
    }

    static void sayHello(String name) {
        String Hello = "Hello " + name;
        if (name.isBlank()) {
            String hi = "Hi " + name;
            System.out.println(hi);
        }
        /**
         * If initialized here:
         * System.out.println(hi); // it will error because hi only initialized on if block
         */

    }
}
