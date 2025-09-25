public class Main {
    public static void main(String[] args) {

        double dollarAmount = 9.9555;
    }

    public static void printMoney(double amount) {


        if (dollarAmount < 0) {
            System.err.println("Dollar amount is negative");
        }
        System.out.printf("$%.2f", dollarAmount);

    }
}

/*
-IF YOU FIND YOURSELF COPY-PASTING CODE, STOP AND RE-EVALUATE YOUR LIFE :)

Method Structure
*Method Signature
 - public static void printMoney(double amount)
        public - access modifier
        static - belongs to class
        void = return type (does not return a value)
        printMoney = method name
        (double amount) = parameters
            double = type
            amount = variable name

*Method body
 - code inside {..}

-Parameter: Variable inside method definition (double amount)
-Argument: Actual value passed when calling (printMoney(9.9555))
(you can have more than one parameter or none)

Output & Formatting
- System.out.printf("$%.2f", amount);
        %f → floating-point number
        %.2f → round to 2 decimal places
        $%.2f → prints like $9.96
System.err.println → prints error messages (usually in red in console).

Common Return Types
    void → no value returned
    int → returns whole number
    double → returns decimal number
    String → returns text
    boolean → returns true/false



 */