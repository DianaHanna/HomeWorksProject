package Class33HomeWork;

public class Task3 {

    public static void checkAgeEligibility(int age){
        if (age<16){
            throw new RuntimeException("Age is less than 16.");
        }
    }

    public static void main(String[] args) {

        int age=10;
        try {
            checkAgeEligibility(age);
        }catch (RuntimeException e){
            System.out.println(e.getMessage());
        }
    }
}
