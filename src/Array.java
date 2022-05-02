public class Array {
    public static void main(String[] args) {
        /**
         * Array only have one data type
         * Array have specific length (specified on first initilialization)
         * First index is 0(zero)
         */
        String[] arrName;
        arrName = new String[3];
        arrName[1] = "Mark"; //insert value to one index

        int[] arrAge = new int[3];
        arrAge[0] = 20;
        arrAge[1] = 21;
        arrAge[2] = 22;

        /**
         * Examples when specified an array and insert its value
         */
        Long[] arrLongNum = new Long[]{
          1L, 2L, 75L
        };

        Short[] arrShortNum = {
          20, 50, 895
        };

        /**
         * Array Operation : Change array value
         */
        arrAge[2] = 40; //arrAge index 2 value was changed to 40

        /**
         * Array Operation : Get Array value
         */
        System.out.println("Age : " + arrAge[2]);

        /**
         * Array Operation : Get array length
         */
        System.out.println("Array Age Length : " + arrAge.length);

        /**
         * Multidimensional Array
         */
        String[][] members = {
                {"Boris", "Bokir"},
                {"Deddy", "Mahendra"},
                {"Uus"}
        };

        /**
         * Access mutidimensional array
         */
        System.out.println("Members 1 first name : " + members[0][1]);

    }
}
