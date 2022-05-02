public class WhileLoop {
    public static void main(String[] args) {
        /**
         * Looping like for but stop only condition not meet
         * difference with for is for have init statement & post statement
         * while not have it
         */
        int counter = 0;
        while(counter < 10){
            System.out.println("Counter " + counter);
            counter++;
        }
    }
}
