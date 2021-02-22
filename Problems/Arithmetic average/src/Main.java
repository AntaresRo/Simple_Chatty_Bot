import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here

        Scanner scanner = new Scanner(System.in);

        double a = scanner.nextDouble();
        double b = scanner.nextDouble();
        double average;
        double sum = 0;
        int ct = 0;

        for (; a <= b; a++ ) {
            if (a % 3 == 0) {
               ct++;
               sum = sum + a;

            }

        }

        average = sum/ct;
        System.out.println(average);
    }
}