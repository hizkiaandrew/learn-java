public class ContinueLoop {
    public static void main(String[] args) {
        /**
         * Continue on loop statements will skip only
         * that loop and will start another loop immediately
         *
         * EXAMPLES : Wants to print only odd numbers
         * from 1 until 100
         */
        for(var counter = 1; counter < 100; counter++){
            if(counter % 2 == 0){
                System.out.println("Number : " + counter);
            }
        }
    }
}
