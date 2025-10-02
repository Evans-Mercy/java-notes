
*IF YOU FIND YOURSELF COPY-PASTING CODE, STOP AND RE-EVALUATE YOUR LIFE! Haha:)*

# METHODS
## **Method Structure** (Signature & body)

```java
System.out.println("hi");

```

### Example:

```java
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
Example:
```java
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

Example:
```java
          {
            if (dollarAmount < 0) {
                System.err.println("Dollar amount is negative");
            }
            System.out.printf("$%.2f%n", dollarAmount);
          }
```

### Parameter:
- Variable inside method definition

    (dollarAmount) - is passed when calling the method

### Argument:
- Actual value passed when calling the method

    printMoney(9.9555)
*(you can have more than one parameter or none)*

### Conditional statement

Example:
```java
            if (dollarAmount < 0) {
            System.err.println("Dollar amount is negative");
            }
```
### Output & Formatting

Example:
```java
           System.out.printf("$%.2f", dollarAmount);
```
  - %f → floating-point number
  - %.2f → round to 2 decimal places

Example:
```java
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

## Key points

**-Expression is a combination of values, variables, or operators that evaluates to a single value**

**- It's good practice to have no more than 20 lines in a method.**

**- Ctrl b - tells you what the highlighted item is.**
 # Scanners

The Scanner class takes input from the user (like numbers, words, or lines of text).

You need to import it before using:
```java
import java.util.Scanner;
```
## Set Up

- Create a Scanner object:
```java
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
```java
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

Example:
```java
          if ((age < 18) || (age >= 65)) {
          // condition met if under 18 OR over 65
          }
```
### COMPARING STRINGS
- Use the **.equals()** method instead of == when comparing strings.
  
Example:
```java

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

Example:
```java
             double price = (age < 18) ? 18.00 : 25.00;
```

# STRING FORMATTING
### Basic formatting with **printf**
- **System.out.printf()** lets you print formatted strings.

Example:
```java
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


Example:
```java
            String name = "Mercy";
            int age = 75;
            double hoursWorked = 42.5;

System.out.printf("%s is %d years old and worked %.1f hours today%n", name, age, hoursWorked);
```
Output
 ```java
 Mercy is 75 years old and worked 42.5 hours today
 ```

### Formatting Tips
- Always match placeholders with the right argument type.
- Use precision (.2f) for money or decimals.
- Keep placeholders in order, arguments fill them left to right.

# STRINGS
- Non-primitive (reference type)


  **Note: Non-primitive types start with a capital letter (e.g., String); primitives are lowercase (e.g., boolean).**


- Represented by double quotes ("")
- Escape quotes in a text using \ 
Example:
```java
String welcome = "She said, \"How are you\"?";
```
### Escape Characters
- \n - newline
- \t - tab
- \r - return
- \\ - backslash
- \' - single quote
- \" - double quote

## Comparing strings
**DO NOT USE (==)!**


Use **.equals()** method

For case sensitivity use **.equalsIgnoreCase()** for capitalization.

### Example
```java
String s1 = "A";
String s2 = "A";
if (s1.equals(s2)){
    //this will be true
        }

String s1 = "ABC";
String s2 = "abc";

if (s1.equalsIgnoreCase(s2)) {
    //this will be true
        }

```
## Examples of String Methods
.length - gets the length (number of characters) of the string

.trim() – removes whitespace from the start and end of the string

.toUpperCase() – converts all characters to uppercase

.toLowerCase() – converts all characters to lowercase

.charAt(index) – returns the character at a specific index

.substring(start) – returns part of the string from start index to the end

.substring(start, end) – returns part of the string between start and end indexes

.equals(string) – compares the values of two strings (case-sensitive)

.equalsIgnoreCase(string) – compares values ignoring case

.contains(sequence) – checks if a string contains a sequence of characters

.startsWith(prefix) – checks if string starts with the given prefix

.endsWith(suffix) – checks if string ends with the given suffix

.replace(old, new) – replaces characters or sequences in a string

.indexOf(string) – returns the index of the first occurrence of a substring

.lastIndexOf(string) – returns the index of the last occurrence of a substring

.split(delimiter) – splits the string into an array by the given delimiter

.isEmpty() – checks if the string is empty ("")

## Key points
- Primitive types: store actual values directly in memory.

- Reference types: store a reference (memory address) that points to where the object’s data is stored.
### Example
```java
int a = 5;        // '5' stored directly in memory  
String name = "Hi"; // memory stores a reference to where "Hi" is stored  
```
- == – checks if two strings refer to the same memory location.

- .equals() – checks if two strings have the same value/content.


# Classes 
- **classes have members; fields & methods**

Types of classes:

        1. Public
        2. Private

1. Public - accessible from anywhere (any other class, package or project).

Example:
```java
public class Person {
    public String name; // can be accessed from anywhere
}
```
```java
Person p = new Person();
p.name = "Mercy"; // ✅ works anywhere

```

2. Private - accessible only inside the same class.
  - Used to protect data so it can’t be changed directly.

- Usually combined with getter and setter methods to allow controlled access.

Example:
```java
public class Person {
    private String name; // can only be accessed inside Person class

    public String getName() {
        return name; // getter allows reading
    }

    public void setName(String name) {
        this.name = name; // setter allows controlled updating
    }
}
```
```java
Person p = new Person();
p.setName("Mercy"); // ✅ works through setter
System.out.println(p.getName()); // ✅ works through getter

```

# OOP
Key concepts :

- Class — like a blueprint for an object.

- Object — an actual thing made from that blueprint.

- Encapsulation — keeping data private inside the class and giving access through getters/setters. (protecting)

- Constructor — a special method that runs when you create an object.

# Constructors 
- special method that creates an object. 
    - starts with a capital letter.
    - has the same name as the class
    - no return type
    - automatically called when an object is created with new
 ## Types of constructors
1. Default Constructor
    - no parameters; sets default values.
```java
public class CellPhone {
    private String model;

    public CellPhone() {
        model = "Unknown";
    }
}
```
2. Parameterized Constructor
    - takes parameters to set values (when the object is created).
```java
public class CellPhone {
    private String model;

    public CellPhone(String model) {
        this.model = model;
    }
}
```
Example:
```java
CellPhone phone1 = new CellPhone(); // Calls default constructor
CellPhone phone2 = new CellPhone("iPhone 15"); // Calls parameterized constructor
```

## Setters and Getters
- Getter → a method that returns (gets) the value of a private variable.

- Setter → a method that updates (sets) the value of a private variable.

They are used because variables are often marked private (hidden) for encapsulation (protection).

Example:
```java
public class Person {
    private String name;  // private variable, hidden from outside

    // Getter
    public String getName() {
        return name;  // lets us read the value
    }

    // Setter
    public void setName(String newName) {
        name = newName;  // lets us update the value
    }
}
```
```java
public class Main {
    public static void main(String[] args) {
        Person p = new Person();   // create a Person object

        // use setter to change the value
        p.setName("Mercy"); 

        // use getter to read the value
        System.out.println(p.getName()); // prints Mercy
    }
}
```

# OVERLOADING

**Method overloading**

- when a class has multiple methods with the same name but different signatures.

- The signature is determined by taking the name of a method and
  adding to it the type of each parameter
  Example
```java
  public class Thingy {
  public void foo() {
  // signature foo
  }
  public void foo(int x) {
  // signature foo_int
  }
  public void foo(int x, int y) {
  // signature foo_int_int
  }
  public void foo(int x, String s) {
  // signature foo_int_String
  }
  public void foo(String s, int x) {
  // signature foo_String_int
  }
  public void foo(String x) {
  // signature foo_String
  }
  }
```
- (foo) - is the method being overloaded
- takes in different signatures. ()






