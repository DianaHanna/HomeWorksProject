package Class15HomeWork;

public class Task4 {
    /*
    Create a method that will say Hello in different language based on the country that will passed
    when method is executed

    // return String
    // name language
    // parameter String
     */

    String language(String country) {
        switch (country) { // when we use return method we don't need break;
            case "Egypt":
                return ("اهلا");
            case "USA":
              return ("Hello");
            case "France":
                return ("Bonjour");
            case "Spain":
                return ("Hola");
            case "Italy":
                return ("Ciao");
            default:
                return "error";
        }
    }

        public static void main (String[]args){
            Task4 task4 = new Task4();
            System.out.println(task4.language("Spain"));
        }
    }

