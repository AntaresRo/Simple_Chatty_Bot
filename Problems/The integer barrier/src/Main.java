import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sum = 0;
        while (scanner.hasNext()) {
            int number = scanner.nextInt();
            sum = sum + number;
            if (number == 0) {
                System.out.println(sum);
                break;
            } else if (sum >= 1000) {
                sum = sum - 1000;
                System.out.println(sum);
                break;
            }
        }
    }
}