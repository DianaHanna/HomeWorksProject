package Class13HomeWork;

public class Task5 {
    public static void main(String[] args) {
        /*
        5) How would you check if String is palindrome or not? aba=> true
           Abbc =>false
         */
        String str = "Abbc";
        StringBuilder stringBuilder=new StringBuilder(str);
        stringBuilder.reverse();
        String rev=str.toString();
        if(str.equals(rev)){
            System.out.println("Given String is palindrome");
        }else{
            System.out.println("Given String is NOT palindrome");
        }
    }
}
