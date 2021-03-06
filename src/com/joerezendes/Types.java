package com.joerezendes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;

public class Types {
    /* DATA TYPES */

    /* NUMBER TYPES */
    int aNumber = 42;                       // Integer (or Whole Number) [-2,147,483,648 to 2,147,483,647]
    float aFloatingNumber = 13.37f;         // Floating point number [7 decimal point precision]

    // sometimes used
    byte aTinyNumber = 100;                 // One byte (or 8 bits) stores numbers from [-128 to 127]
    short aSmallNumber = 30000;             // short stores numbers from [-32,768 to 32,767]
    long aLongNumber = 50000;               // Long stores really long numbers. (9 quintillion) [-9,223,372,036,854,775,808
    // to 9,223,372,036,854,775,807

    double aMorePreciseNumber = 420.00005;  // [15 decimal point precision]

    /* Booleans */

    boolean isThisCourseGreat = true;       // store true (1) or false (0)
    boolean isThisHTML = false;

    /* Characters */

    char aSingleCharacter = 'A';            // Stores a single character. Can also include special characters
    // like commas, dashes, etc.

    /* Strings */

    String message = "Hello World";         // Store a sequence of characters.



    /* CASTING */

    int loan = 750;
    float interestRate = 0.0525f;

    float interest = loan * interestRate;
//        System.out.println(interest);


    int x = (int)50.5f + (int)20.6f;
//        System.out.println(x);


    /* ARRAYS */
    {
        String student_1 = "john@gmail.com";
        String student_2 = "july@gmail.com";
        String student_3 = "ryan@gmail.com";

        String[] studentMails = {"john@gmail.com", "july@gmail.com", "ryan@gmail.com"};

        for (int i = 0; i < 3; i++) {
//            System.out.println(studentMails[i]);
        }

    }

    /* MULTIDIMENSIONAL ARRAYS */
    {

        int[] numbers = {0, 1, 2, 3, 4, 5};

        int[][] someNumbers = { {10, 15, 20, 25}, {50, 500, 5000} };

        for (int x = 0; x < someNumbers.length; x++) {
            for (int y = 0; y < someNumbers[x].length; y++) {
                System.out.println("(" + x + "," + y + ")");
            }
        }

    }


    /* ARRAY LIST */
    {

        ArrayList<String> mails = new ArrayList<>();

        mails.add("john@yahoo.com");
        mails.add("rick@yahoo.com");
        mails.add("dan@yahoo.com");
        mails.add("dave@yahoo.com");

        mails.set(0, "john@gmail.com"); // change the 0th index.

        mails.remove(1);

        int mailsLength = mails.size();

        mails.clear();

        Collections.sort(mails); // sort in alphabetical order


        /* FOR EACH LOOP */

        String[] names = {"Johnny", "Martin", "George"};

        // for each
        for(String name: names) {
            // System.out.println(name);
        }



    }



    /* HASH MAP */
    {
        // key value pair
        HashMap<String, String> capitals = new HashMap<>();

        capitals.put("Mexico", "Mexico City");
        capitals.put("Germany", "Berlin");
        capitals.put("France", "Paris");
        capitals.put("USA", "Washington DC");

        String germanyCapital = capitals.get("Germany");

        capitals.remove("France");

        int capitalsLength = capitals.size();

        for (String s : capitals.keySet()) {
            String city = capitals.get(s);
        }

    }

    /* ENUMS */

    enum Difficulty { EASY, MEDIUM, HARD }

    {
        Difficulty gameDifficulty = Difficulty.HARD;
    }

    /* JAVA METHODS */
    {

        // factorial(5) = 5! = 5 * 4 * 3 * 2 * 1 = 120

        int factorialed = Factorial(5);

    }

    // outside of main function
    public static int Factorial(int number) {
        int fact = number;

        for (int i = number; i >= 1; i--) {
            fact *= i;
        }

        return fact;

    }

}
