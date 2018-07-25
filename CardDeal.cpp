//Cody Corke July 2018
//CodyCorke@yahoo.com
//CardDeal.cpp is a source file for a text based experience in producing a random playing card.
//Compile and enjoy!

#include <iostream>
#include <string>
#include <ctime>
#include <cstdlib>
using namespace std;

enum suit {club, diamond, heart, spade};
string strSuit[] = {"Clubs", "Diamonds", "Hearts", "Spades"};
string strRank[] = {"Ace", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine", "Ten", "Jack", "Queen", "King"};
int main()
{
	    srand(static_cast <unsigned int> (time(0)));

	    int x1 = rand() % 4; //sets x1 to random variable for suit

	    int x2 = rand() % 13; //sets x2 to random variable for rank

		//cout << "x1 " << x1 << endl; //for dev use

		//cout << "x2 " << x2 << endl; // for dev use

    	cout << "You were dealt the " << strRank[x2] << " of " << strSuit[x1] << "." << endl;

return 0;
}