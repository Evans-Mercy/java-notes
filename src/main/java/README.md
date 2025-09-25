
```
public class Methods {
public static void main(String[] args) {

         printMoney(9.9555); //example call
         printMoney(-5);     //example negative value
    }

    public static void printMoney(double dollarAmount) {

        if (dollarAmount < 0) {
            System.err.println("Dollar amount is negative");
        }
        System.out.printf("$%.2f%n", dollarAmount);

    }
}
```

*IF YOU FIND YOURSELF COPY-PASTING CODE, STOP AND RE-EVALUATE YOUR LIFE :)*

# METHODS
## **Method Structure** (Signature & body)
### Method Signature
```
public static void printMoney (double amount) 
```
- public - access modifier
- static - belongs to the class
- void = return type (does not return a value)
- printMoney = method name
- (double amount) = parameters

    **double = type** ,
**amount = variable name**

### Method body
* code inside { }
```java
/*
      {
        if (dollarAmount < 0) {
            System.err.println("Dollar amount is negative");
        }
        System.out.printf("$%.2f%n", dollarAmount);
      }
*/
```

### Parameter:
- Variable inside method definition

    (double amount) - is passed when calling the method

### Argument:
- Actual value passed when calling the method

    printMoney(9.9555)
*(you can have more than one parameter or none)*

### Conditional statement
```
if (amount < 0) {
System.err.println("Dollar amount is negative");
}
```
### Output & Formatting
```
  System.out.printf("$%.2f", amount);
  ```
  - %f → floating-point number
  - %.2f → round to 2 decimal placeS
```
Example:
    $%.2f → prints like $9.96
```
  - System.err.println → prints error messages (usually in red in console).

## **Common Return Types**
- void → no value returned
- int → returns whole number
- double → returns decimal number
- String → returns text
- boolean → returns true/false

# **Parameters**
-You can have:
- No parameters → methodName()
- One parameter → methodName(int x)
- Multiple parameters → methodName(int x, String y)


# CONDITIONAL STATEMENTS
## KEY POINTS
### IF / ELSE
- *'if'* statements check a condition (true/false)
- *'else'* defines what happens if the condition is false.
- *'else if'* lets you chain multiple conditions together.
- *'else'* must always follow an 'if'.
- Always use { } braces, even if only one line (best practice).
- Conditional expressions usually use boolean values.

### OPERATORS
- ==   equals (comparison for numbers/booleans, NOT strings)
- !=   not equals
- < > <= >=   comparison operators (numbers only)
- &&   AND (both conditions must be true)
- ||   OR  (at least one condition must be true)
- !    NOT (reverses the boolean value)

### BOOLEAN LOGIC
- true  && true   = true
- true  && false  = false
- false && false  = false
- true  || false  = true
- false || false  = false



**Add parentheses if you want part of an expression to be evaluated first.**
```
Example:
  if ((age < 18) || (age >= 65)) {
  // condition met if under 18 OR over 65
  }
```
### COMPARING STRINGS
- Use the **.equals()** method instead of == when comparing strings.
```
Example:

  String homeState = "Texas";
  String contactPhone;

  if (homeState.equals("Texas") || homeState.equals("Kansas")) {
  contactPhone = "800-555-5555";
  } else {
  contactPhone = "855-555-5555";
  }
```
### TERNARY OPERATOR
- Shortcut for simple if/else.

  **Syntax: (condition) ? valueIfTrue : valueIfFalse**
```
  Example:
  double price = (age < 18) ? 18.00 : 25.00;
```