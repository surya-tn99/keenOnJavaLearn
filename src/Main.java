// this is a cmd line bro , why are you looking here

/*
    in this script , datatypes will be practiced
 */

/// documentation comments
/// @author kuttypuli
/// @version 0.0.1

import java.lang.Math;
import java.util.Scanner;

public class Main {
    static int tint1;
    public static void main(String[] args) {

        // outputs
        // method 1
        System.out.println("Hello and welcome!");
        System.out.println("\ntoday,may "+ 1 + "," + 2026);
        System.out.println(true + " , " + false);
        //method 2
        System.out.printf("value of pi : %.2f" , Math.PI);
        //method 3
        StringBuilder strbuild = new StringBuilder();
        strbuild.append("\nhi,");
        strbuild.append("today date is ");
        strbuild.append("May ");
        strbuild.append(1);
        strbuild.append(",");
        strbuild.append(2026);
        System.out.println(strbuild.toString());

//        // inputs
//        Scanner scan = new Scanner(System.in);
//        System.out.print("bytes input from user \n :" + scan.nextByte());
//        // this will check whether the input is within the range of Byte
//        System.out.print("bytes input from user \n :" + scan.hasNextByte());
//
        // variables
        //     for instance variable  , no initialization is required
        //      but for local variable  , we need to assign value before use
        int tint;
        tint = 10101;
        System.out.println(tint);
        // final variable cannot be reassigned (constant) , but they can be initialized later
        final String username;
        username = "surya-tn99";
        String textblocks = """
                
                hi hello vanakma .
                what's up .
                """;
        System.out.println(username + textblocks);
        /** datatypes
         * boolean
         * byte
         * char
         * short
         * int
         * long
         * float
         * double
        **/

        // var keyword
        // by using this , we don't have to write datatype  explicitly.
        // 1. Must be initialized at declaration
        // 2. Only works for local variables
        var age = 20002;
        var name = "surya";
    }
};

