//Cody Corke July 2018
//CodyCorke@yahoo.com
//Pet.java is a source file for a text based experience in producing an output of pets.
//The parameters for the pets are found in PetTest.java.
//Compiles with PetTest.java!

class Pet
{
    //to add a new pet see PetTest.java
    //the name of the pet
    private String petName;

    //the pets age
    private int petAge;

    //the pets weight
    private double petWeight;

    public Pet(String name, int age, double weight)
    {//defines name age and weight from PetTest
        petName = name;
        petAge = age;
        petWeight = weight;
    }

    public void getName()
    {//defines the print out for each pet
            System.out.println("Meet " + petName + " who is " + petAge + " years old and weighs " + petWeight + " pounds!");
            System.out.println("");
    }
}
