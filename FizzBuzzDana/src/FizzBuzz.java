import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {

        System.out.print("Enter number : ");
        Scanner scanner = new Scanner(System.in);
        int input = scanner.nextInt();
        FizzBuzz(input);
    }

    public static void FizzBuzz (int number){

        for (int i = 1; i < number; i++){

            if (i % 3 ==0 && i % 5 ==0  ) {
                System.out.print("FIZZBUZZ ");
            }

            else if (i % 3 ==0 ) {
                System.out.print("FIZZ ");
            }

            else if (i % 5 ==0 ) {
                System.out.print("BUZZ ");
            }
            else {
                System.out.print(i + " ");
            }

        }

    }
}
