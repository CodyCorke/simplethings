//Cody Corke July 2018
//CodyCorke@yahoo.com
//Fibonacci.cpp is a source file for a text based experience in producing a Fibonacci Sequence.
//Compile and enjoy!

#include <iostream>
#include <vector>
using namespace std;

int main ()
{
    int num;
//output to request number input from user stored as num
    cout << "How many numbers? (1-30) \n";
    cin >> num;
//ensures users number is between 1 and 30 or will repeat question
    while ( num < 1 || num > 30)
    {
        cout << "That number is invalid. The number must be between 1 and 30.\n";
        cout << "Enter a number between 1 and 30. \n";
        cin >> num;
    }
//produces and output Fibonacci Sequence
        int first = 0, second = 1, third;
            for (int i = 0; i < num - 1; i++)
            {
                if (i == 0)
                {
                    cout << first << " " << second << " ";
                }
                else
                {
                    third = first + second;
                    first = second;
                    second = third;
                    cout << third<< " ";
                }
            }
        cout << "" << endl;
return 0;
}