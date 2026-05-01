package learn;

/**
 * Throwable
 * ├── Error          (serious — don't handle these)
 * │   ├── OutOfMemoryError
 * │   └── StackOverflowError
 * └── Exception      (handle these)
 *     ├── Checked Exception
 *     │   ├── IOException
 *     │   ├── SQLException
 *     │   └── FileNotFoundException
 *     └── Unchecked Exception (RuntimeException)
 *         ├── ArithmeticException
 *         ├── NullPointerException
 *         ├── ArrayIndexOutOfBoundsException
 *         ├── NumberFormatException
 *         └── ClassCastException
 */

// try-catch-finally

public class AgeErrors extends Exception {
    AgeErrors(String Msg){
        super("AGE ERROR EXCEPTION : " + Msg);
    }
}
