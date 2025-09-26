
*IF YOU FIND YOURSELF COPY-PASTING CODE, STOP AND RE-EVALUATE YOUR LIFE! Haha:)*

# METHODS
## **Method Structure** (Signature & body)
```
Example:
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

### Method Signature
```
Example:
            public static void printMoney(double dollarAmount) 
```
- public - access modifier
- static - belongs to the class
- void = return type (does not return a value)
- printMoney = method name
- (double dollarAmount) = parameters

    **double = type** ,
**dollarAmount = variable name**

### Method body
* code inside { }
```
Example:
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

    (dollarAmount) - is passed when calling the method

### Argument:
- Actual value passed when calling the method

    printMoney(9.9555)
*(you can have more than one parameter or none)*

### Conditional statement
```
Example:
            if (dollarAmount < 0) {
            System.err.println("Dollar amount is negative");
            }
```
### Output & Formatting
```
Example:
           System.out.printf("$%.2f", dollarAmount);
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
- < >  <=  >=   comparison operators (numbers only)
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

# STRING FORMATTING
### Basic formatting with **printf**
- **System.out.printf()** lets you print formatted strings.
```
Example:
            double price = 9.9555;
            System.out.printf("Price: $%.2f", price);
```
### Common Placeholders

   | Placeholder | Meaning                           | Example Output |
   |-------------|-----------------------------------|----------------|
   | %s          | String                            | "Mercy"        |
   | %d          | Integer                           | 42             |
   | %f          | Floating-point number             | 3.141593       |
   | %-10f       | Float (left-aligned)              | "3.141593   "  |
   | %10f        | Float (right-aligned)             | "   3.141593"  |
   | %.2f        | Float rounded to 2 decimal places | 3.14           |
   | %n          | New line                          | (line break)   |
   | %%          | Literal percent sign              | %              |


```
Example:
            String name = "Mercy";
            int age = 75;
            double hoursWorked = 42.5;

System.out.printf("%s is %d years old and worked %.1f hours today%n", name, age, hoursWorked);
```
Output
 ```
 Mercy is 75 years old and worked 42.5 hours today
 ```

### Formatting Tips
- Always match placeholders with the right argument type.
- Use precision (.2f) for money or decimals.
- Keep placeholders in order, arguments fill them left to right.
