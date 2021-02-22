import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here

        Scanner scanner = new Scanner(System.in);

        double money = scanner.nextDouble();
        double percent = scanner.nextDouble();
        double target_Money = scanner.nextDouble();
        int year = 0;

        while (money < target_Money) {
            money = money + money*percent/100;
            year++;
        }
        System.out.println(year);


    }
}