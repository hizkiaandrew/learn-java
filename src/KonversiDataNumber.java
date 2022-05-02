public class KonversiDataNumber {
    public static void main(String[] args) {
        /**
         * Converse Number Data Type
         * Widening Casting (Otomatis) byte -> short -> int -> long -> float -> double
         * Narrowing Casting (Manual) double -> float -> long -> int -> short -> byte
         */

        /**
         * Widening Casting Examples
         */
        byte iniByte = 25;
        short iniShort = iniByte;
        int iniInt = iniShort;
        long iniLong = iniInt;
        float iniFloat = iniLong;
        double iniDouble = iniFloat;

        /**
         * Narrowing Casting Examples
         */
        double iniDouble2 = 25;
        float iniFloat2 = (float) iniDouble2;
        long iniLong2 = (long) iniFloat2;
        int iniInt2 = (int) iniLong2;
        short iniShort2 = (short) iniInt2;
        byte iniByte2 = (byte) iniShort2;

    }
}
