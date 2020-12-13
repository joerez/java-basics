package com.joerezendes;

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


}
