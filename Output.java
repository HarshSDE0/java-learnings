/*
 * 4 Methods are there to produce output or perint something on screen
 * 1. System.out.print();
 * 2. System.out.println();
 * 3. System.out.format();
 * 4. System.out.printf();
 * 
 * 1 & 2 are similar
 * 3 & 4 are same anyone of them can be used.
 * 
 * 
 * Difference b/w print and println() : 
 * 1. print() does not appends a new line at the end of the output.
 * 2. println() appends a new line at the end of the output.
 * 
 * 
 * print() & pritln():
 * used to print "Strings", "numbers", or mixture of String and numbers
 * It basically handles Primitives.
 * For non-primitives first it converts into Strings and then prints it
 * It handles arithmetic operations too.
 * 
 * 
 * format() or printf()::
 * useful for formatted outputs. for i/p such as date, time, etc.
 * It uses placeholders.
 * placeholders are replaced by data stored in specified variable .
 * Some placeholders are - %d(for integer),
 *                            %f(for floating point)
 *                            %c(for characters)
 *                            %s(for String)
 *                            
 * 
 */
import java.math.*;
public class Output {
               public static void main(String[] args) {
                            int x = 100, y = 200;
                            System.out.println("Value of x is : " + x);
                            System.out.print("Courses");//Do not appends a new line so next word will continue form exact the next point where first one ends(even without appending space)
                            System.out.println("Java,Python,C++");

                            System.out.format("Value of y: %d\n", y);
                            //We can use multiple placeolders too within single statement
                            System.out.format("Value of x: %d \t Value of y: %d\n", x,y);

                            float pi = (float) Math.PI;
                            System.out.printf("Value of pi is : %f\n", pi);
                            System.out.printf("Value of pi is : %.2f\n", pi);//It restricts that after deciaml place there could be only 2 digit
                            System.out.printf("Value of pi is : %5.2f\n", pi);//It restricts that after deciaml place there could be only 2 digit and total number of characters should be 5(It counts decimal as a character). And  , to fulfil this condition it starts with empty spaces.
                            //So, in this case it will start with one  space characters
                            System.out.printf("Value of pi is : %05.2f\n", pi);//It restricts that after deciaml place there could be only 2 digit and total number of digits should be 5. so , to fulfil this condition it starts with 0 instead of  spaces character.

               }
}
