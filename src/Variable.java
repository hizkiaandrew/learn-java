public class Variable {
    public static void main(String[] args) {
        /**
         * Variable Example
         */
        String name;
        name = "John Doe";

        int age = 25;

        name = "Doni Salmanan"; // value varaible name become Doni Salmanan

        /**
         * On Java 10 above there is variable var
         * Value must be initialized (Cannot be null)
         */
        var ageVar = 52;
        var addressVar = "Indonesia";

        /**
         * final Keyword
         * final cannot be changed its value
         * Also called constant variable
         * Add keyword 'final' in front of var / type data
         */
        final String fullNameFinal = "Hizkia Andrew";
        final var varFinal = 3.14;


    }
}
