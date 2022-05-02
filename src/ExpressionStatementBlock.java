public class ExpressionStatementBlock {
    public static void main(String[] args) {
        /**
         * Expression -> single value of variable/operator/method
         * Statement -> Complete set of expression, Ends with ';'
         * Block -> Group of Statement
         *
         * Expression < Statement < Block
         *
         * Statement Type :
         * - Assignment Expression
         * - ++ and --
         * - Method Invocation
         * - Object Creation Expression
         *
         * Block starts with { and end with }
         */

        /**
         * Example Expression :
         */
        var x = 10; //one expression
        x = 5; // one expression

        /**
         * Example Statement
         */
        System.out.println(x == 19); //one statement, x==19 is an expression

        /**
         * Example Block
         */
        {
            System.out.println("Statement 1");
            System.out.println("Statement 2");
            System.out.println("Statement 3");
        }

    }
}
