import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        int lines = scanner.nextInt();
        int i = 0;
        int max = Integer.MIN_VALUE;
        while (i < lines) {
            i++;
            int element = scanner.nextInt();
        if ((element % 4 == 0) && element > max) {
                max = element;
            }

        }
        System.out.println(max);


    }
}
