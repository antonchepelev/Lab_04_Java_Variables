public class Main {
    public static void main(String[] args) {
        //int variable

        int intOperandA = 3;

        int intOperandB = 2;

        int intSum = 10;

        int intProduct = 16;

        int intDifference = 13;

        int intQuotient = 12;

        int intModulo = 11;

        //double variables

        double doubleOperandA = 3.50;

        double doubleOperandB = 2.45;

        double doubleSum  = 5.00;

        double doubleProduct =16.00;

        double doubleDifference = 8.00;

        double doubleQuotient = 9.00;

        double doubleModulo = 4.00;

        intSum = intOperandA + intOperandB;

        intProduct = intOperandA * intOperandB;

        intDifference = intOperandA - intOperandB;

        intQuotient = intOperandA / intOperandB;

        intModulo = intOperandA % intOperandB;



        System.out.println("The sum using ints of " + intOperandA + " and " + intOperandB + " is " + intSum);

        System.out.println("The product using ints of " + intOperandA + " and " + intOperandB + " is " + intProduct);

        System.out.println("The difference using ints of " + intOperandA + " and " + intOperandB + " is " + intDifference);

        System.out.println("The quotient using ints of " + intOperandA + " and " + intOperandB + " is " + intQuotient);

        System.out.println("The modulo using ints of " + intOperandA + " and " + intOperandB + " is " + intModulo);

        doubleSum = doubleOperandA + doubleOperandB;

        doubleProduct = doubleOperandA * doubleOperandB;

        doubleDifference = doubleOperandA - doubleOperandB;

        doubleQuotient = doubleOperandA / doubleOperandB;

        doubleModulo = doubleOperandA % doubleOperandB;

        System.out.println("The sum using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleSum);

        System.out.println("The product using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleProduct);

        System.out.println("The difference using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleDifference);

        System.out.println("The quotient using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleQuotient);

        System.out.println("The Modulo using doubles of " + doubleOperandA + " and " + doubleOperandB + " is " + doubleModulo);
    }
}