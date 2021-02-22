import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int sequence = scanner.nextInt();
        int sum = 0;
        for (int i = 0; i < sequence; i++) {
            int input = scanner.nextInt();
            if (input % 6 == 0) {
                sum = sum + input;
            }
        }
        System.out.println(sum);
    }
}