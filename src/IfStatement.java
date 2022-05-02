public class IfStatement {
    public static void main(String[] args) {
        /**
         * IF statement -> make a branch situation based on condition specified
         * inside if is true or false
         */
        var nilaiAbsen = 80;
        var nilaiAkhir = 85;

        if(nilaiAbsen < 75 && nilaiAkhir < 70){
            System.out.println("Anda tidak lulus");
        }else{
            System.out.println("Anda lulus");
        }
    }
}
