package Class33HomeWork;

public class Task4 {

    public static void checkUserName(String userName){
        if (userName.length()<5){
            throw new RuntimeException("Username is less than 5 characters.");
        }
    }

    public static void main(String[] args) {

        String userName="John";
        try {
            checkUserName(userName);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
