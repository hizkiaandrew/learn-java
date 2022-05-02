public class SwitchStatement {
    public static void main(String[] args) {
        /**
         * Old Version Manual
         * Switch statement used if just wanted to compare value
         */
        var nilai = "F";

        switch (nilai){
            case "A":
                System.out.println("Anda lulus");
                break;
            case "B":
            case "C":
                System.out.println("Anda belum lulus");
                break;

            default:
                System.out.println("Maaf anda belum lulus");
        }

        /**
         * On Java Version 14 or above there is switch lambda
         */
        String result;
        switch (nilai){
            case "A" -> result = "Anda lulus";
            case "B", "C" -> result = "Anda belum lulus";
            default -> {
                result = "Maaf anda belum lulus";
            }
        }

        System.out.println(result);

        /**
         * On Java version 14 or above there is yield feature to return
         * switch statement
         */

        String resultYield = switch (nilai){
            case "A":
                yield "Anda lulus";
            case "B", "C" :
                yield "Anda belum lulus";
            default:
                yield "Maaf anda belum lulus";
        };

        System.out.println(resultYield);
    }
}
