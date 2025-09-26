
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
A method can return 0 or 1
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

**-Expression is a combination of values, variables, or operators that evaluates to a single value**

**- It's good practice to have no more than 20 lines in a method.**

**- Ctrl b - tells you what the highlighted item is.**

 # Scanners

The Scanner class takes input from the user (like numbers, words, or lines of text).

You need to import it before using:
```
import java.util.Scanner;
```
## Set Up

- Create a Scanner object:
```
Scanner myScanner = new Scanner(System.in);
```

- Use it to read different types of input:
```
int number =     myScanner.nextInt();       // reads an integer  
double price =   myScanner.nextDouble();    // reads a decimal  
String word =    myScanner.next();          // reads one word  
String line =    myScanner.nextLine();      // reads a whole line
```
## Examples

Example 1: Ask for name and age
```
import java.util.Scanner;

        public class Main {
        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
                System.out.print("Enter your name: ");
                String name = input.nextLine();
        
                System.out.print("Enter your age: ");
                int age = input.nextInt();
        
                System.out.println("Hello " + name + ", you are " + age + " years old!");
            }
        }
```
## Breakdown
1. **import java.util.Scanner;**

Tells Java you want to use the Scanner class from the built-in java.util package.

Without this line, Java won’t know what Scanner is.

2. **public class Main {**

Defines a class called Main.

In Java, all code must live inside a class.

3. **public static void main(String[] args) {**

The main method.

This is the entry point — the first thing Java runs in your program.

4. **Scanner input = new Scanner(System.in);**

Creates a Scanner object named input.

System.in means it will read data from the keyboard.

5. **System.out.print("Enter your name: ");**

Prints a message on the screen without moving to a new line.

Tells the user what they need to type.

6. **String name = input.nextLine();**

Waits for the user to type something and hit Enter.

Stores the whole line of text into the variable name.

7. **System.out.print("Enter your age: ");**

Prints another message, asking for the user’s age.

8. **int age = input.nextInt();**

Waits for the user to type a whole number and hit Enter.

Stores that number in the variable age.

9. **System.out.println("Hello " + name + ", you are " + age + " years old!");**

Prints a message combining text + variables.

Example output: Hello Mercy, you are 26 years old!

10. **} (closing braces)**

Close the main method and the Main class.


## Common Mistakes

- Forgetting to import java.util.Scanner;.

- Using nextLine() after nextInt() or nextDouble() → sometimes it “skips” because of leftover newline characters. (Fix: add an extra nextLine() to clear input.)

- Not closing the Scanner (use input.close(); at the end).

## Tips

- Use nextLine() when you want the whole sentence.

- Use nextInt(), nextDouble(), etc. only when you need specific types.

- Always guide your user with System.out.print("...") before input.




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

