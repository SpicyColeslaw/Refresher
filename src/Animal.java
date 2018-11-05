import java.util.Scanner;

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

    public static void AnimalMain() {
        Animal animal = new Animal();
    }
}
