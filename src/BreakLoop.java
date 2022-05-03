public class BreakLoop {
    public static void main(String[] args) {
        /**
         * Break on loop statements will stop all looping
         * regardless the condition is met or not
         */

        var counter = 100;
        while (true){
            System.out.println("Counter : " + counter);
            counter--;

            if(counter < 50){
                break;
            }
        }
    }
}
