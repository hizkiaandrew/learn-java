public class DoWhileLoop {
    public static void main(String[] args) {
        /**
         * Have same concept as while loop
         * But, do while loop will check the condition
         * after the first loop.
         *
         * It will do the block statement first
         * regardless it meet its condition or not.
         */
        var counter = 100;

        do{
            System.out.println("Counter : " + counter);
            counter--;
        }while (counter <= 10);
    }
}
