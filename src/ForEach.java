public class ForEach {
    public static void main(String[] args) {
        /**
         * To access all array value, for function can be used
         * but it becomes troublesome. So you can use for each
         * so it will iterate all value on array
         */
        String[] names = {
                "Bokir",
                "Boris",
                "UUS",
                "Babe",
                "Raditya",
                "Ernest"
        };

        for(var name : names){
            System.out.println(name);
        }
    }
}
