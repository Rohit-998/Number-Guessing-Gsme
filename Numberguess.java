import java.util.Scanner;

public class Numberguess {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Choose The Difficulty:");
            System.out.println("Enter 1 For Easy (Number 1-10)");
            System.out.println("Enter 2 For Medium (Number 1-100)");
            System.out.println("Enter 3 For Hard (Number 1-1000)");

            int n = input.nextInt();
            int range = 0;

            switch (n) {
                case 1:
                    range = 10;
                    break;
                case 2:
                    range = 100;
                    break;
                case 3:
                    range = 1000;
                    break;
                default:
                    System.out.println("Invalid choice! Please choose a valid difficulty.");
                    continue;
            }

    
            int num = (int)Math.ceil((Math.random() * range));
            int guessNum = 0;

            System.out.println("Guess The Number Between 1 and " + range + ": ");
            while (guessNum != num) {
                guessNum = input.nextInt();
                if (guessNum > num) {
                    System.out.println("Try Lower");
                } else if (guessNum < num) {
                    System.out.println("Try Higher");
                } else {
                    System.out.println("Wow... Your Guess Is Correct!");
                }
            }

            System.out.println("Type 'start' To Play Again or 'exit' To Quit: ");
            String str = input.next();
            if (str.equalsIgnoreCase("exit")) {
                System.out.println("Thank you for playing!");
                break;
            }
        }

        
    }
}
