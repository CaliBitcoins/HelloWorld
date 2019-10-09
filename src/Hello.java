// Class signature components:
// 1) public - access modifier keyword
// 2) class
// 3) class name
public class Hello {

    // public is an access modifier
    // static  is a keyword that requires understanding of additional concepts
    // void is the return type - indicates method will not return anything
    public static void main(String[] args) {

        // Statement - a complete command to be executed can include one or more expressions
        // String Literal - "Hello World" an expression and not a variable
        System.out.println("Hello World");

        // EXPRESSION - a construct that evaluates to a single value
        // Operators - perform an operation on a variable or value (+, -, /, *, etc)
        // Primitive Types - most basic data types (boolean, byte, char, short, int, long, float) 
        int myFirstNumber = (10 + 5) + (2 * 10);
        int mySecondNumber = 12;
        int myThirdNumber = myFirstNumber * 2;
        int myTotal = myFirstNumber + mySecondNumber + myThirdNumber;
        int myLastOne = 1000 - myTotal;

        // Statement - a complete command to be executed can include one or more expressions
        System.out.println(myLastOne);

    }
}
