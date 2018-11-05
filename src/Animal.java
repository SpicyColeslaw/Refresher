import java.util.Scanner;
import java.util.*;

public class Animal {
    //static variable - Shared between all instances of this class.
    //final - This variable cannot be changed.
    public static final double FAVNUMBER = 1.6180;

    //private - Only this class can access the variable. accessed by getters and setters.
    private String name;
    private int weight; //-2^31 to 2^31 - 1
    private boolean hasOwner = false;
    private byte age;   //-28 to 127
    private long uniqueID; //-2^63 to 2^63
    private char favoriteChar;
    private double speed;
    private float height;

    protected static int numberOfAnimals = 0;

    static Scanner scanner = new Scanner(System.in);

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public boolean isHasOwner() {
        return hasOwner;
    }

    public void setHasOwner(boolean hasOwner) {
        this.hasOwner = hasOwner;
    }

    public byte getAge() {
        return age;
    }

    public void setAge(byte age) {
        this.age = age;
    }

    public long getUniqueID() {
        return uniqueID;
    }

    public void setUniqueID(long uniqueID) {
        this.uniqueID = uniqueID;
        System.out.println("Unique ID set to: " + this.uniqueID);
    }


    public void setUniqueID() {
        long minNumber = 1;
        long maxNumber = 1000000;

        this.uniqueID = minNumber + (long) (Math.random() * ((maxNumber - minNumber) + 1));
    }

    public char getFavoriteChar() {
        return favoriteChar;
    }

    public void setFavoriteChar(char favoriteChar) {
        this.favoriteChar = favoriteChar;

    }

    public void setFavoriteChar() {
        int randomNumber = (int) (Math.random() * 126) + 1;

        this.favoriteChar = (char) randomNumber;

        if (randomNumber == 32) {
            System.out.println("Favorite character set to Space");
        } else if(randomNumber == 10){
            System.out.println("Favorite character set to NewLine");
        } else {
            System.out.println("Favorite character set to " + this.favoriteChar);
        }

        if((randomNumber > 97) && (randomNumber < 122)) {
            System.out.println("Favorite character is a lowercase letter");
        }

        if((randomNumber > 97 && randomNumber < 122) || (randomNumber > 64 && randomNumber < 91)) {
            System.out.println("Favorite character is a letter");
        }

        int whichIsBigger = (50 > randomNumber) ? 50 : randomNumber;

        switch (randomNumber) {
            case 8:
                System.out.println("Favorite character set to Backspace");
                break;
            case 10:
            case 11:
            case 12:
                System.out.println("Demonstrating switch fall through");
                break;

            default:
                System.out.println();
                break;
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public float getHeight() {
        return height;
    }

    public void setHeight(float height) {
        this.height = height;
    }

    public Animal() {
        numberOfAnimals++;
        System.out.println(numberOfAnimals);

        int sumOfNumbers = 5 + 1;
        System.out.println("5 + 1 = " + sumOfNumbers);

        int diffOfNumbers = 5 - 1;
        System.out.println("5 - 1 = " + diffOfNumbers);

        int multOfNumbers = 5 * 1;
        System.out.println("5 * 1 = " + multOfNumbers);

        int divOfNumbers = 5 / 1;
        System.out.println("5 / 1 = " + divOfNumbers);

        int modOfNumbers = 5 % 1;
        System.out.println("5 % 1 = " + modOfNumbers);

        System.out.print("Enter the name: ");

        //Scanner Notes:
        //receiving String - hasNextLine()
        //receiving Int - hasNextInt()
        //receiving Float - hasNextFloat()
        //receiving double - hasNextDouble()
        //receiving Byte - hasNextByte()
        //receiving Boolean - hasNextBoolean()
        if(scanner.hasNextLine()) {
            this.setName(scanner.nextLine());
        }
    }

    //Demonstrating for loop
    protected static void countTo(int startingNumber) {
        for(int i = startingNumber; i <= 100; i++) {
            if(i == 90)
                continue; //jumps to next loop
            System.out.println(i);
        }
    }

    //Demonstrating while loop
    protected static String printNumbers(int maxNumbers) {
        int i = 1;

        while( i <(maxNumbers / 2)) {
            System.out.println(i);
            i++;

            if(i == (maxNumbers / 2))
                break;
        }

        Animal.countTo(maxNumbers/2);

        return "End of printNumbers";
    }

    protected static void guessMyNumber() {
        int number;

        do {
            System.out.println("Guess number up to 100");

            while(!scanner.hasNextInt()) {
                String numberEntered = scanner.next();
                System.out.printf("%s is not a number\n", numberEntered);
                //byte, short, int, long - %d
                //float, double - %f (EXTRA: %.2f forces two decimal places)
            }

            number = scanner.nextInt();


        } while(number != 50);

        System.out.println("Hey you got it!");
    }

    public String makeSound() {
        return "Grr";
    }

    public static void speakAnimal(Animal randAnimal) {
        System.out.println("Animal says " + randAnimal.makeSound());
    }

    public static void AnimalMain() {
        Animal animal = new Animal();

        int[] favoriteNumbers;
        favoriteNumbers = new int[20];
        favoriteNumbers[0] = 100;

        String[] stringArray = {"Random", "Words", "Here"};


        //For each loop
        for(String word : stringArray) {
            System.out.println(word);

        }


        //copies array with a new length variable
        String[] copyOfArray = Arrays.copyOf(stringArray, 3);

        //A lot of variables have a to String method
        System.out.println(Arrays.toString(copyOfArray));

        //Searching for a specific value, returns the index.
        System.out.println(Arrays.binarySearch(copyOfArray, "Random"));


    }
}
