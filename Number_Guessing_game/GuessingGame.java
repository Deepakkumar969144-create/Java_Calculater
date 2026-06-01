package Number_Guessing_game;
import java.util.*;
public class GuessingGame {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        Random r = new Random();
    
        int highscore = 9999;
        char choice;
        while(true){
            int number = r.nextInt(100)+1; // imp. 
                //r.nextInt(100)
                // Ye 0 se 99 tak koi bhi random number dega.
            int guess;
            int count = 0 ;
            System.out.println("Number Guessing Game");
            System.out.println("Guess a number between 1 and 100");
    
            while(true){ // condition true hai to loop infinite chalega 
                System.out.print("Enter your guess: ");
                guess = sc.nextInt();
    
                count++;
    
                if(guess > number ){
                    System.out.println("too high");
    
                }
                else if ( guess < number ){
                    System.out.println("too low");
    
                }
                else{
                    System.out.println("correct guess ");
                    System.out.println("the number was: " + number);
                    System.out.println("total attempts: " + count);
    
                    if(count < highscore ){
                        highscore = count ;
                        System.out.println("new high score ");
    
                    }
                    System.out.print("best score: "+highscore);
                    break;

                }

            }
            System.out.print("play again ? ( y/n) : " );
            choice = sc.next().charAt(0);
    
            if(choice != 'y' && choice != 'Y'){
                break;

            }
        }
        System.out.println("thank you for playing ! ");
        sc.close();

    }

}
// How to Play:
// 1. The computer generates a random number between 1 and 100.
// 2. Enter your guess when prompted.
// 3. If your guess is greater than the number, "too high" will be displayed.
// 4. If your guess is smaller than the number, "too low" will be displayed.
// 5. Keep guessing until you find the correct number.
// 6. The program will show the total number of attempts taken.
// 7. If you beat the previous best score, a new high score will be recorded.
// 8. After winning, choose 'y' to play again or 'n' to exit the game.

// Game Rules:
// - Guess a number between 1 and 100.
// - The game will tell you whether your guess is too high or too low.
// - Keep guessing until you find the correct number.
// - Your attempts will be counted.
// - Try to finish the game in fewer attempts to make a new high score.
// - Enter 'y' to play again or 'n' to quit.
