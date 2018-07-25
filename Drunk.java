//Cody Corke July 2018
//CodyCorke@yahoo.com
//Drunk.java is a source file for a text based experience in producing a "drunk walk".
//Compile and enjoy!

class Drunk

{

static int home = -5;       //assigns home a value of -5
static int jail = 5;        //assigns jail a value of 5
static int location = 0;    //students start location which accumulates as they approach jail or home
static int blocks;          //blocks traveled counter
static int N = 5;           //N is the number of times the walk is called
static double blocksTotal;  //total blocks traveled over N times

    public static void main(String[] args) //main function calls drunk walk N times
    {
        for (int i = 1; i <= N; i++) //where N comes in
        {
            drunkWalk();    //call for a drunk walk
            endLocation();  //call for the end location
            System.out.println("Here we go again... time for a walk!");
            System.out.println("Walked " + blocks + " blocks, and");
            System.out.println("Landed at " + endLocation());
            System.out.println("");
            blocksTotal += blocks;  //adds current block count to total count
            blocks = 0;             //reset block counter
            location = 0;           //reset location
        }
        //this is the end of main and prints off total details
        System.out.println("");
        System.out.println("Average number of blocks equals " + (blocksTotal / N));
        System.out.println("");

    }

    public static int drunkWalk()
    {
        while (location > home && location < jail) //begin while loop until student gets to home or jail

        {
            if (Math.random() < 0.5)    //generates random direction
            {
                location++; //adds 1 to location indicating a block toward jail
                blocks++;   //adds 1 to block counter
                //System.out.println("The student traveled East towards Jail"); //for dev use
                //System.out.println("Block count is " + blocks);   //for dev use
                //System.out.println("Location is " + location);    //for dev use
            }
            else
            {
                location--; //subtracts 1 from location indicating a block toward home
                blocks++;   //adds 1 block to counter
                //System.out.println("The student traveled West towards Home"); //for dev use
                //System.out.println("Block count is " + blocks);   //for dev use
                //System.out.println("Location is " + location);    //for dev use
            }
        } // end while loop
        return blocks;
    }

    public static String endLocation() //forms a string for visual printout of location in main
    {
        if (location == home)
        {
            return "HOME";
        }
        else
        {
            return "JAIL";
        }
    }
}
