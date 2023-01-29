import java.util.*;

class GuessingGame {
    GuessingGame(){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        int n = 0;
        int n2 = -1;
        System.out.println("<------------ Welcome to the Number Guessing Game ------------>");
        System.out.println("if you correctly guess --> you wins");
        System.out.print("Do you wish to play this game?(Y/N) : ");
        char c = scanner.nextLine().toLowerCase().charAt(0);
        if (c == 'y') {
            System.out.println("\nLets start the Game.\n");
            System.out.println("This Game consists of 3 Rounds.\nGuess the number correctly in more than 2 rounds to win!\n");
            for (int i = 1; i != 4; ++i) {
                int n3 = 1;
                System.out.println("<----------------------------------------------------------->");
                System.out.println("ROUND - " + i);
                int n4 = random.nextInt(101);
                System.out.println("Now, the Random-Number has been generated! by program");
                System.out.println("It is the time to guess it.");
                System.out.println("You have five attempts to win it!\n");
                while (n4 != n2) {
                    System.out.print("Enter your guess : ");
                    n2 = scanner.nextInt();
                    if (n4 < n2) {
                        System.out.println("Your guess is Higher than the generated Number.\n");
                    } else {
                        System.out.println("Your guess is Lower than the generated Number.\n");
                    }
                    if (n3++ != 6) continue;
                }
                System.out.println("\nRound - " + i + " - result : ");
                if (n4 == n2) {
                    System.out.println("HOORAY!!\n");
                    System.out.println("You have successfully Guessed the number correctly!\n");
                    ++n;
                    if (i != 3) {
                        System.out.println("Keep up the spirit and Let's Move on to the Next Round!");
                    } else {
                        System.out.println("You have Guessed the Number in the Final Round.");
                    }
                }
                if (n3 != 6) continue;
                System.out.println("You Ran out of your attempts, Mr.Player!");
                if (i != 3) continue;
                System.out.println("With this Round, We Finished the game!");
                System.out.println("Time for the Results.");
            }
            System.out.println("<----------------------------------------------------------->");
            if (n >= 2) {
                System.out.println("You Have Guessed the correct number in more than 2 rounds!");
                System.out.println("YOU WON THE GAME!!!");
            } else {
                System.out.println("You haven't guessed the correct number for at least 2 Rounds!");
                System.out.println("please try again! you LOST the Game.!");
            }
            System.out.println("<----------------------------------------------------------->\n\n");
            System.out.println("Thank you for playing this game and Have a Wonderful Day!");
        } else if (c == 'n') {
            System.out.println("Understandable, Have a nice day :)");
        } else {
            System.out.println("Please run again and enter a valid choice!");
        }
        scanner.close();
    }
    public static void main(String[] arrstring) {
        GuessingGame g= new GuessingGame();
    }
}
