package StringClassHomeWork;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        /*
        Write a program that reads two people's first names and if they expecting boy or girl?
        Based on the input suggests a name for a baby:
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? boy
Suggested baby name: DANRY
Example Output:
Mom’s first name? Mary
Dad’s first name? Daniel
Boy or Girl? girl
Suggested baby name: MAIEL
         */

        Scanner scanner=new Scanner(System.in);
        System.out.println("Please enter Mom's first name?");
        String momName=scanner.next();
        System.out.println("Please enter Dad's first name?");
        String dadName=scanner.next();
        System.out.println("Boy or Girl?");
        String babyGender=scanner.next();


        String suggestName="";
        if (babyGender.equalsIgnoreCase("boy")){
            suggestName=dadName.substring(0,dadName.length()/2)+momName.substring(momName.length()/2);
        } else if (babyGender.equalsIgnoreCase("girl")) {
            suggestName=momName.substring(0,momName.length()/2)+dadName.substring(dadName.length()/2);
        }
        System.out.println(suggestName);


    }
}
