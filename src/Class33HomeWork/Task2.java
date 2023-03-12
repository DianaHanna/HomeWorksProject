package Class33HomeWork;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Task2 {

    public static List<Exception> exceptionList() {
        List<Exception> exceptions = new ArrayList<>();

        try {
            int num = Integer.parseInt("abc");
        } catch (NumberFormatException e) {
            exceptions.add(e);
        }

        try {
            int[] arr = new int[3];
            arr[4] = 10;
        } catch (ArrayIndexOutOfBoundsException e) {
            exceptions.add(e);
        }

        try {
            String str = null;
            str.length();
        } catch (NullPointerException e) {
            exceptions.add(e);
        }

        try {
            int a = 10, b = 0;
            int c = a / b;
        } catch (ArithmeticException e) {
            exceptions.add(e);
        }

        return exceptions;
    }

    public static void main(String[] args) {
        List<Exception> exceptionList = exceptionList();
        for (Exception e : exceptionList) {
            System.out.println(e.getClass().getSimpleName() + " " + e.getMessage());
        }
    }
}
