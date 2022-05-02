public class Operasiboolean {
    public static void main(String[] args) {
        /**
         * Boolean Opeartor
         * && -> AND
         * || -> OR
         * ! -> opposite
         */
        boolean bool1 = true;
        boolean bool2 = false;

        System.out.println(bool1 && bool2);
        System.out.println(bool1 || bool2);
        System.out.println(!bool2);

        /**
         * Case Study Example
         */
        var nilaiAbsen = 80;
        var nilaiAkhir = 85;

        boolean lulusAbsen = nilaiAbsen >= 80;
        boolean lulusNilaiAkhir = nilaiAkhir > 85;

        System.out.println("Result : " + (lulusAbsen && lulusNilaiAkhir));

    }
}
