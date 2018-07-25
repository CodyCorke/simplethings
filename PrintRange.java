//Cody Corke July 2018
//CodyCorke@yahoo.com
//PrinRange.java is a source file for a text based experience in producing an output of a range of numbers.
//Compile and enjoy!


class PrintRange
{
    static int i;
    public static void main(String[] args)
    {
        printRange(2, 7); //enter variables here

        printRange(19, 11); //enter variables here

        printRange(5, 105); //enter variables here
    }
    public static int printRange(int x, int y)
    {
        if (x > y) // for when we need to count down
        {
            System.out.print("["); //first square bracket
            for (i = x; i >= y; i--) // count sequence
            {
                System.out.print(i);
                System.out.print(", "); //comma between
            }
            System.out.println("]"); //final square bracket
            return 0;
        }
        else // otherwise we are counting up
            {
                System.out.print("["); //first square bracket
                for (i = x; i <= y; i++) // count sequence
                {
                    System.out.print(i);
                    System.out.print(", ");  //comma between
                }
                System.out.println("]");  //final square bracket
                return 0;
            }
    }
}