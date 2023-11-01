package task_1;

public class Main {


    public static void main(String[] args) {

        var ii = 0;
        while (true) {

            System.out.println("Разград " + ii);
            ii++;
            if (ii == 20) {
                return;
            }

            for (int i = 0; i < 20; i++) {
                System.out.println("Разград - " + i);

            }
        }
    }

}
