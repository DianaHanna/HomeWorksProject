package Class16HomeWork;

public class Task2 {

    /*
    Create a method that will take a String as a parameter and returns reversed String.
    Method should be available to all classes within your project and accessible by class name.
     */
    // return type reversed String
    // name reverseStr
    // parameter String

    public static String reverseStr(String input){ // access modifier and variable
        return new StringBuilder(input).reverse().toString(); // method

    }

    public static void main(String[] args) {
        System.out.println(reverseStr("I love Java"));
    }
}
