public class ConditionalStatements {
    public static void main(String[] args) {

        //1.Variable declaration & assignment
        //variable name = raining
        //value assigned = false
        //conditional statements use an expression = boolean
        boolean raining = false;

        //2. Conditional Statement
        //if checks whether the condition inside parentheses is true.
        //If the condition is true, the block inside the {} after if executes.
        //If the condition is false, the block after else executes.

        //noinspection ConstantValue
        if (raining){
            System.out.println("It's raining");
        }
        else{

            //3. Output
            //Since raining is false, it will print
            System.out.println("It's not raining");
        }
        System.out.println();


    }
}

/*  KEY POINTS
 IF / ELSE
   - 'if' statements check a condition (true/false)
   - 'else' defines what happens if the condition is false.
   - 'else if' lets you chain multiple conditions together.
   - 'else' must always follow an 'if'.
   - Always use { } braces, even if only one line (best practice).
   - Conditional expressions usually use boolean values.

OPERATORS
   ==   equals (comparison for numbers/booleans, NOT strings)
   !=   not equals
   < > <= >=   comparison operators (numbers only)
   &&   AND (both conditions must be true)
   ||   OR  (at least one condition must be true)
   !    NOT (reverses the boolean value)

BOOLEAN LOGIC
   true  && true   = true
   true  && false  = false
   false && false  = false
   true  || false  = true
   false || false  = false



   * Add parentheses if you want part of an expression to be evaluated first.
     Example:
     if ((age < 18) || (age >= 65)) {
         // condition met if under 18 OR over 65
     }

COMPARING STRINGS
   - Use the .equals() method instead of == when comparing strings.
   - Example:

       String homeState = "Texas";
       String contactPhone;

       if (homeState.equals("Texas") || homeState.equals("Kansas")) {
           contactPhone = "800-555-5555";
       } else {
           contactPhone = "855-555-5555";
       }

TERNARY OPERATOR
   - Shortcut for simple if/else.
   Syntax: (condition) ? valueIfTrue : valueIfFalse
   Example:
       double price = (age < 18) ? 18.00 : 25.00;

*/
