// Pseudocode
// Program to play Rock, Paper, Scissors between two players
// 1. Start
// 2. Prompt player A for a move (R, P, S)
//    - Continue to prompt if the move isn't valid
// 3. Prompt player B for a move (R, P, S)
//    - Continue to prompt if the move isn't valid
// 4. Determine the outcome of the game based on the moves
//    - Display the result with the appropriate phrases
// 5. Declare the winner or a tie
// 6. Prompt the user to play again (Y/N)
//    - If Y, go to step 2
//    - If N, terminate
// 7. End


import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String playerAMove;
        String playerBMove;
        String playAgain;
        String[] validMoves = {"R", "P", "S"};

        do {
            do {
                System.out.print("Player A, enter your move (R, P, S): ");
                playerAMove = scanner.nextLine().toUpperCase();
            } while (!playerAMove.equals("R") && !playerAMove.equals("P") && !playerAMove.equals("S"));

            do {
                System.out.print("Player B, enter your move (R, P, S): ");
                playerBMove = scanner.nextLine().toUpperCase();
            } while (!playerBMove.equals("R") && !playerBMove.equals("P") && !playerBMove.equals("S"));


            if (playerAMove.equals(playerBMove)) {
                System.out.println(playerAMove + " vs " + playerBMove + " It's a Tie!");
            } else {
                String result;
                if ((playerAMove.equals("R") && playerBMove.equals("S")) ||
                        (playerAMove.equals("P") && playerBMove.equals("R")) ||
                        (playerAMove.equals("S") && playerBMove.equals("P"))) {
                    result = "Player A wins";
                } else {
                    result = "Player B wins";
                }
                String winningPhrase = switch (playerAMove) {
                    case "R" -> "Rock breaks Scissors";
                    case "P" -> "Paper covers Rock";
                    default -> "Scissors cuts Paper";
                };
                System.out.println(winningPhrase + ", " + result);
            }

            System.out.print("Do you want to play again [Y/N]? ");
            playAgain = scanner.nextLine().toUpperCase();
        } while (playAgain.equals("Y"));

    }
}
