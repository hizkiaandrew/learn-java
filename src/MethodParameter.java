public class MethodParameter {
    public static void main(String[] args) {
        /**
         * To send a data to a method you can give the method a parameter.
         *
         * When you call the method you have to add an argument inside '()'
         * to pass a data to method
         *
         * Parameter & argument can be more than one. Separated with comma ','
         */

        sayName("Hizkia", "Andrew");
        sayName("Boris", "Bokir");
    }

    static void sayName(String firstName, String lastName){
        System.out.println("Hello " + firstName + ' ' +  lastName + '!');
    }
}
