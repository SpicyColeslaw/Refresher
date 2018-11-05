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
}
