package StringClassHomeWork;

public class Task2 {
    public static void main(String[] args) {
        /*
        Create a String and print it in reverse order (Sunday → yadnuS).

        String string="Sunday";
        String reverse = new StringBuffer(string).reverse().toString();
        System.out.println(reverse);

         */
        String string="Sunday";
;        String result="";
        for(int i=string.length()-1; i>=0; i--) {
            result = result + string.charAt(i);
        }
        System.out.println(result);
    }
}
