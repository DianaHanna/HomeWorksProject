package ArraysHW;

public class Task8 {
    public static void main(String[] args) {

        int x=0;
        int y=1;
        int z;
        for (int i = 0; i < 10; i++) {
            System.out.print(x+" ");
            z=x+y;
            x=y;
            y=z;

        }
    }
}
