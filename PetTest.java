//Cody Corke July 2018
//CodyCorke@yahoo.com
//PetTest.java is a source file for a text based experience in producing an output of pets.
//The parameters are found here where the output is defined in the class found in PetTest.java.
//Compile with Pet.java and enjoy!

class PetTest
{

    public static void main(String[] args)
    {
        //new pet template
        //System.out.println("My ANIMAL");
        //Pet myANIMAL = new Pet("NAME", AGE, WEIGHT);
        //myANIMAL.getName();

        System.out.println("My Dog");
        Pet myDog = new Pet("Fido", 9, 29.5);
        myDog.getName(); //calls for getName from pet.java

        System.out.println("My Parrot");
        Pet myParrot = new Pet("Polly", 32, 2.85);
        myParrot.getName();

        System.out.println("My Cat");
        Pet myCat = new Pet("Tiger", 4, 105.3);
        myCat.getName();

    }
}
