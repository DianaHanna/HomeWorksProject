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
        switch (country) {
            case "Egypt":
                System.out.println("اهلا");
                break;
            case "USA":
                System.out.println("Hello");
                break;
            case "France":
                System.out.println("Bonjour");
                break;
            case "Spain":
                System.out.println("Hola");
                break;
            case "Italy":
                System.out.println("Ciao");
                break;
        }
        return country;
    }


        public static void main (String[]args){
            Task4 task4 = new Task4();
            System.out.println(task4.language("Spain"));
        }
    }

