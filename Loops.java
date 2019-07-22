package loops;

public class Loops {

    public static void main(String[] args) {

        for (int x = 1; x <= 10; x++) {
            if(x!=5){
                continue;
            }
            System.out.println("x is: " + x);
        }

        int y = 1;
        while (y <= 10) {
            System.out.println("y is: " + y);
            y++;

        }

        int a = 1;
        do {
            System.out.println("a is: " + a);
            a++;
        } while (a <= 10);
    }
}
