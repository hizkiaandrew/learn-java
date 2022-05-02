public class TipeDataNumber {
    public static void main(String[] args) {
        /**
         * Integer Number Data Type
         */
        byte iniByte = 10; //-128 <==> 128
        short iniShort = 10_000; //-32,768 <==> 32,767
        int iniInt = 1_000_000_000; //-2,147,483,648 <==> 2,147,483,648
        long iniLong = 1000_000_000L; //-9,223,372,036,854,775,808 <==> -9,223,372,036,854,775,807
        // For long add word 'L/l' on behind the value

        /**
         * Float Point Data Type
         */
        float iniFloat = 0.42F; // 3.4-e038 <==> 3.4+e038
        // For float add word 'F/f' on behind the value
        double iniDouble = 0.42523423; // 1.7e-308 <==> 1.7e+308

        /**
         * Literals
         */
        int decimalInt = 25;
        int hexInt = 0xA123B;
        int binInt = 0b01010011;

        /**
         * Underscore
         * Just an annotation to make developer read number easier
         */
        int underscoreInt = 1_000_003_925;

    }
}
