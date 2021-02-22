import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner sc = new Scanner(System.in);

        String[] s = new String[5];

        for (int i = 0; i < 5; i++) {
            s[i] = sc.next();
        }

        for (int i = 0; i < 5; i++) {
            System.out.println(s[i]);
        }
    }
}