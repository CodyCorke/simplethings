//Cody Corke July 2018
//CodyCorke@yahoo.com
//Hangman.cpp is a source file for a text based experience in playing hangman.
//Compile and enjoy!

#include <iostream>
#include <string>
#include <ctime>
#include <cstdlib>
#include <vector>
#include <algorithm>

using namespace std;

int main()
{
    const int wrongLimit = 5; //attempt limit
    vector<string> words; //words for game
    //begin words list
    words.push_back("CHEESE");
    words.push_back("CHICKEN");
    words.push_back("JEEP");
    words.push_back("ROCKER");
    words.push_back("BRING");
    words.push_back("GITHUB");
    words.push_back("FAUCET");
    words.push_back("MISSISSIPPI");
    words.push_back("TISSUE");
    words.push_back("SOFTWARE");
    //end words list

    srand(static_cast<unsigned int>(time(0)));

    random_shuffle(words.begin(), words.end()); //shuffle words vector

    const string guessWord = words[0]; //this is the word to guess

    string soFar(guessWord.size(), '-'); //creates a string with same digits as guess word filled with -

    string usedLetters = "";

    int wrong = 0; //for counting how many wrong guesses

    int tries = 0; //for counting how many tries it took

    cout << "Welcome to Hangman by Cody Corke" << endl;

    while ((wrong < wrongLimit) && (soFar != guessWord)) //begin loop
        {
            cout << endl;
            cout << endl;
            cout << "You have " << (wrongLimit - wrong) << " guesses left!" << endl;
            cout << endl;
            //cout << "Wrong count is: " << wrong << endl; //for dev use
            cout << "Letters used so far: " << usedLetters << endl;
            cout << endl;
            cout << "This is what your word looks like so far: " << soFar << endl;
            cout << endl;
            //cout << "And this is the word you are trying to guess: " << guessWord << endl; //for dev use

            char guess;
            cout << "What is your guess? " << endl;
            cin >> guess;
            guess = toupper(guess); //makes lower case into upper case
			tries++;

            while (usedLetters.find(guess) != string::npos) //duplicate guess loop
                {
                    cout << endl;
                    cout << "You have already guessed " << guess << endl;
                    cout << "Enter your guess. " << endl;
                    cin >> guess;
                    guess = toupper(guess); //makes lower case into upper case
                    tries++;
                }

                usedLetters += guess; //adds guess to usedLetter string

            if (guessWord.find(guess) != string::npos) //correct guess letter
                {
                    cout << endl;
                    cout << "You got it! " << guess << " is in the word!" << endl;
                    cout << endl;

                    for (int i = 0; i < guessWord.length(); i++) //adds guess letter to soFar string

                    if (guessWord[i] == guess)
                            soFar[i] = guess;
                }

            else //adds 1 to "wrong" counter
                {
                    wrong++;
                }

        } //end loop

        if (soFar == guessWord) //correctly guessed the word
                {
                    cout << "************************" << endl;
                    cout << "* You solved the word! *" << endl;
                    cout << "************************" << endl;
                    cout << "* The word was " << guessWord << "  *" << endl;
                    cout << "************************" << endl;
                    cout << "* In only " << tries << " tries too! *" << endl;
                    cout << "************************" << endl;
                }

        else //exited loop due to exceeding "wrong" limit
                {
                    cout << "*************************" << endl;
                    cout << "* You have been hanged! *" << endl;
                    cout << "*************************" << endl;
                    cout << "* The word was " << guessWord << "   *" << endl;
                    cout << "*************************" << endl;
                    cout << "******* GAME OVER *******" << endl;
                    cout << "*************************" << endl;

                }
    return 0;
}
