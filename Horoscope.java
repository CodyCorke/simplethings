//Cody Corke July 2018
//CodyCorke@yahoo.com
//Horoscope.java is a source file for a text based experience in determining a Zodiac sign.
//Compile and enjoy!

import java.util.*;
class Horoscope
{
static int month;
static int day;
static int numday;
static String sign;
static Scanner scan = new Scanner(System.in);

    public static void main(String[] args)
    {
        System.out.println("Welcome to Horoscope"); //intro

        System.out.print("Enter your month of birth (1 - 12): "); //ask month
        month = scan.nextInt();             //stores month
        //System.out.print("month is ");    //for dev use
        //System.out.println(month);        //for dev use

        if (month < 1 || month > 12) //creates limit on entry
            {
                System.out.println("Invalid Date");
            }

        System.out.print("Enter your day of birth (1 - 31): "); //asks day
        day = scan.nextInt();               //stores day
        //System.out.print("day is ");        //for dev use
        //System.out.println(day);            //for dev use

        if (day < 1 || day > 31) // creates limit on entry
            {
                System.out.println("Invalid Date");
            }

        System.out.println();

    numday(month, day);                 //numday variables entered here

    sign(numday);                       //numday assigned to sign

    //System.out.print("numday is ");   //for dev use

    //System.out.println(numday);       //for dev use

    System.out.print("Your Zodiac sign is ");

    System.out.println(sign);
    }

    public static int numday(int month, int day) //begin numday method which converts month and day to single number of days in yr
    {
        if(month == 1)
        {
            numday = 0 + day;
        }

        else if(month == 2)
        {
            numday = 31 + day;
        }

        else if(month == 3)
        {
            numday = 59 + day;
        }

        else if(month == 4)
        {
            numday = 90 + day;
        }

        else if(month == 5)
        {
            numday = 120 + day;
        }

        else if(month == 6)
        {
            numday = 151 + day;
        }

        else if(month == 7)
        {
            numday = 181 + day;
        }

        else if(month == 8)
        {
            numday = 212 + day;
        }

        else if(month == 9)
        {
            numday = 243 + day;
        }

        else if(month == 10)
        {
            numday = 273 + day;
        }

        else if(month == 11)
        {
            numday = 304 + day;
        }

        else if(month == 12)
        {
            numday = 334 + day;
        }

        return numday;
    }                                           //end numday method

    public static String sign(int numday)       //begin sign method which assigns a sign to the number of days in yr
    {
        if(numday >=80 && numday<=110)
        {
            sign = "aries";
        }

        else if(numday >=111 && numday<=141)
        {
            sign = "taurus";
        }

        if(numday >=142 && numday<=172)
        {
            sign = "gemini";
        }

        if(numday >=173 && numday<=203)
        {
            sign = "cancer";
        }

        if(numday >=204 && numday<=234)
        {
            sign = "leo";
        }

        if(numday >=235 && numday<=265)
        {
            sign = "virgo";
        }

        if(numday >=266 && numday<=295)
        {
            sign = "libra";
        }

        if(numday >=296 && numday<=325)
        {
            sign = "scorpio";
        }

        if(numday >=326 && numday<=355)
        {
            sign = "sagittarius";
        }

        if(numday >=356 || numday<=19)
        {
            sign = "capricorn";
        }

        if(numday >=20 && numday<=49)
        {
            sign = "aquarius";
        }

        if(numday >=50 && numday<=79)
        {
            sign = "pisces";
        }

        return sign;
    }                                       //end sign method

}