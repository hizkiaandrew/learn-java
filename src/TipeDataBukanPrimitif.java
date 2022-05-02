public class TipeDataBukanPrimitif {
    public static void main(String[] args) {
        /**
         * Type Data Primitive : byte, short, int, long, boolean, double, float, char
         * Type Data Primitive will always has default value
         *
         * String is not Primitive Data Type
         * If Data type is not Primitive, it doesn't have default value
         * If Data type is not Primitive, it can be null
         * Data Type non-primitive will always start with capitalized char on first word
         * Type Data non-Primitive : Byte, Short, Int, Long, Boolean, Double, Float, Char
         */
        Integer iniIntegerNon = 199;
        int iniIntegerPrim = 199;

        Byte iniByteNon;

        /**
         * Convert Type Data Primitive to non primitive
         */
        int iniPrimInteger = 90;
        Integer convertInt = iniPrimInteger;

        /**
         * Convert Type Data non Primitive to Primitive
         */
        Short iniNonPrimShort = 100;
        short convertShort = iniNonPrimShort;

        /**
         * Convert non-Primitive data Value to another Data Type
         * Add .(typeData)Value(); after state variable name
         * Can be to non-Primitive or primitive
         */
        Long iniNonPrimLong = 100L;
        short iniNonPrimShort2 = iniNonPrimLong.shortValue();
    }
}
