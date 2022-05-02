public class TenaryOperator {
    public static void main(String[] args) {
        /**
         * Tenary operator to replace single if statement
         *
         * If statement
         */
        var nilai = 75;
        String result;

        if(nilai >= 75){
            result = "Selamat anda lulus";
        }else{
            result = "maaf anda belum lulus";
        }

        System.out.println(result);

        /**
         * Tenary Operator
         * after condition followed with '?'
         * else statement starts with ':'
         */
        String result2 = nilai >= 75 ? "Selamat anda lulus" : "Maaf anda belum lulus";

        System.out.println(result2);


    }
}
