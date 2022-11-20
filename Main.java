/*
Conor O'Flynn
11/11/22
CSC1060680
 */
import java.util.Locale;
import java.util.Objects;
import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // This calls the Dice object
        DiceObject Dice = new DiceObject();
        System.out.println("Score is: " + Dice.score + "\n");
        // input scanner
        Scanner input = new Scanner(System.in);
        // Players input their names and are welcomed to the game
        System.out.println("Player 1 what is your name?");
        String player1 = input.nextLine();
        System.out.println("Player 2 what is your name?");
        String player2 = input.nextLine();
        System.out.println("Welcome "+player1+" and "+player2+" to the Dice game!");
        // This explains the rules of the game
        System.out.println("Each player has two dice. The players take turns rolling their dice. \n When a player rolls both dice, the player may keep the total of both dice or the face value of either die to add to that player's total. \n A player MUST select either the face value of one of the dice, or the total value of both dice. If a player's score goes over 30, \n then that player's score is reset to zero and play continues until one player obtains a score of exactly 30. \n The first player to score exactly 30 is the Winner.");
        // The main loop of the game
        while (Dice.score != 30 || Dice.score2 != 30) {
            // this sets the dice roll
            Dice.setRoll();
            System.out.println(player1+" It is your turn!");
            // Prints out current score
            System.out.println("Score is: "+Dice.getScore());
            // displays Player 1's rolls
            System.out.println(player1+" rolled ***" + Dice.getRoll1() + "*** and ***" + Dice.getRoll2()+"***");
            // asks which die to keep
            System.out.println("Keep dice 1, 2, or both?");
            System.out.println("Enter: one, two, or both: Cannot be numeric");
            //input variable
            String input2 = input.nextLine();
                // assuming we keep both dice
                if (Objects.equals(input2, "both")) {
                    Dice.setScoreBoth();
                }
                // dice 1 kept
                else if (Objects.equals(input2, "one")) {
                    Dice.setScoreOne();
                }
                // dice 2 kept
                else if (Objects.equals(input2, "two")) {
                    Dice.setScoreTwo();
                }
                // error message, proceeds to next players turn
                else{
                    System.out.println("invalid Input");
                }
                // prints out the new score
                System.out.println(player1+"'s New score is: " + Dice.getScore());
                // Checks if player 1 has won and ends loop if true
            if(Dice.getScore()==30) {
                System.out.println("*** you win! ***");
                break;
            }
            // checks if player 1 has lost and resets to 0 if true
            else if (Dice.getScore()>30) {
                System.out.println("*** you lose! resetting to 0 ***");
                Dice.resetScore();
            }

            System.out.println("----------------------------------------");

        // Player 2s turn
            System.out.println(player2+" It is your turn!");
            // displays player 2s current score
            System.out.println("Score is: "+Dice.getScore2());
            // displays player 2s dice rolls
            System.out.println(player2+" rolled ***" + Dice.getRoll3() + "*** and " + Dice.getRoll4()+"***");
            //asks which die to keep
            System.out.println("Keep dice 1, 2, or both?");
            System.out.println("Enter: one, two, or both: Cannot be numeric");
            //input variable
            String input3 = input.nextLine();
            // assuming we keep both dice
            if (Objects.equals(input3, "both")) {
                Dice.setScore2Both();
            }
            // dice 1 kept
            else if (Objects.equals(input3, "one")) {
                Dice.setScore2One();
            }
            // dice 2 kept
            else if (Objects.equals(input3, "two")) {
                Dice.setScore2Two();
            }
            // error message, proceeds to player 1's turn
            else{
                System.out.println("invalid Input");
            }
            // prints new score
            System.out.println(player2+"'s New score is: " + Dice.getScore2());
            //Checks if player 2 has won and ends loop if true
                if(Dice.getScore2()==30) {
                System.out.println("*** you win! ***");
                break;
            }
                // Checks if player 2 has lost and resets their score to 0 if true
                else if (Dice.getScore2()>30) {
                System.out.println("*** you lose! resetting to 0 ***");
                Dice.resetScore2();
            }

                System.out.println("----------------------------------------");
            }

        }
}
