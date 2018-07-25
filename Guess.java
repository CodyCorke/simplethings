//Cody Corke July 2018
//CodyCorke@yahoo.com
//Guess.java is a source file for a text based experience in guessing a number.
//Compile and enjoy!

import java.util.*;

class Guess
{

static int guessMax = 101;  //sets what the max possible number is
static int guessMin = 0;    //sets what the min possible number is
static int guessProposal = 50;  //our proposed guess
static char answer;         //users answer to our guess
static int counter;         //counter for how many guesses
static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {   //begin intro
        System.out.println("This program has you, the user, choose a number");
        System.out.println("between 1 and 100. Then I, the computer, will");
        System.out.println("try my best to guess it.");
        System.out.println("");
        System.out.println("If I guess a number that’s SMALLER than the");
        System.out.println("secret number, respond by typing the letter s. If I");
        System.out.println("guess a number that’s BIGGER than the secret number,");
        System.out.println("respond by typing the letter b. And if I guess");
        System.out.println("CORRECTLY, respond by typing the letter c.");
        System.out.println("");
        System.out.println("Go ahead and choose your number!");
        System.out.println("");
        //end intro

        while (answer != 'C')   //begin while loop until correct guess is made
        {

            System.out.println("Is it " + guessProposal + "?   (type S, B, or C):  ");
            answer = scan.next().charAt(0);
            counter++;
            //System.out.println(answer); //for dev use

            if (answer == 'S')  //guess was to small
            {
                guessMin = guessProposal;   //sets our min to the guess
                guessProposal = ((guessMax + guessMin) / 2);    //sets new guess to the center of max and min
                continue;
            }

            else if (answer == 'B') // guess was to big
            {
                guessMax = guessProposal;   //sets our max to the guess
                guessProposal = ((guessMax + guessMin) / 2);    //sets new guess to the center of max and mi
                continue;
            }

            else if (answer == 'C') //guess was correct exit loop
            {
                break;
            }

            else //wrong entry continues loop.
            {
                System.out.println("That entry is invalid. Try again.");
            }
        } // end while loop

        System.out.println("I got it after making just " + counter + " guesses!");

    }
}