package Class13HomeWork;

public class Task4 {
    public static void main(String[] args) {
        /*
        How would you reverse a String word by word? for example
        // input=>This is sentence i want to reverse
        // output=>sihT si ecnetnes i tnaw ot esrever
         */

      /*StringBuilder str=new StringBuilder("This ia the sentence i want to reverse");
        System.out.println(str.reverse());
        String st= str.toString(); // converting a StringBuilder to String so that we can call methods from String
        st.split()

       */
        String str = "This is sentence i want to reverse";
        String[] arr = str.split(" "); // convert String to Array of String
/*
        for (String word : arr) {

            for (int i = word.length() - 1; i >= 0; i--) {
                System.out.print(word.charAt(i));
            }
            System.out.print(" ");
        for (String word:arr) {

            StringBuilder st=new StringBuilder(word);
            st.reverse();
            System.out.print(st);
            System.out.print(" ");
        }*/
        for (String word:arr) {
            System.out.print(new StringBuilder(word).reverse()+" ");
        }
        }
    }



