import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner = new Scanner(System.in);
        int number = scanner.nextInt();
        int i = 1;

        while (i <= number) {
           double result = Math.pow(i,2);
           if (result > 0 && result <= number) {
               System.out.println((int)result);
           }
           i++;
       }



    }
}