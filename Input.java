/*
 * 2 Ways to read i/p from a file or console:
 * 1. Using BufferedReader - is a class. That reads a character or sequence 
 *             of characters.
 *             It has functions such as read() - reads a character, array of 
 *                                           character
 *             , readLine()- reads a line
 * 
 * BufferedReader throws checked exception which occurs during compile time,
 * which needs to be handled, either by using try-catch block or IOE Exception.
 * (IOException in Java is a checked exception that signals an issue during input or output operations. It is part of the java.io package ).
 * 
 * In Java, when BufferedReader is described as "synchronized," it means its methods are designed to be thread-safe. Thread safety is achieved through internal synchronization mechanisms that manage concurrent access from multiple threads.
When multiple threads attempt to access a synchronized method or block of code, the object on which the method is invoked acquires a lock. This lock ensures that only one thread can execute that specific section of code at any given time. Other threads attempting to access the same synchronized method or block will be blocked until the lock is released by the current thread.
For BufferedReader, synchronization is implemented to protect its internal state, specifically the buffer. This protection is necessary because multiple threads might try to read from the same BufferedReader instance concurrently. Without synchronization, this could lead to data corruption or inconsistent results.
While synchronization ensures thread safety, it can also introduce performance overhead. The acquisition and release of locks can be relatively expensive operations, especially if there is a lot of contention for the lock. In scenarios where thread safety is not a concern, using a non-synchronized alternative like Scanner or manually managing synchronization might be more efficient.
 * 
 * 
 * 
 * 2. Using Scanner - advanced method of reading i/p from user. It can read 
*                     formatted i/p. It has different functions to read differnt 
               types of data.
               Much easier to use when compared with Bufferedreader.
               No need of catching any exception.
               simple syntax.
               To use this import: Scanner class present inside util package
 */
import java.io.*;
import java.util.Scanner;
/*
 import - keyword used to import those libraries, class which are not part of current file and will help to simplify particular work.

    * - represents All classes in IO package.
    We could use BufferedReader also, insted of star, but it won't handle exceptions as it's not defined in that class.

    Package- provides strucutre to the file that contains co-realted classes.
 */
public class Input {
               public static void main(String[] args) throws IOException{
                              BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
                              //BufferedReader is a class
                              //System.in - System is predefined class,
                              //in is a predefined (object of inputStream) stream that reads from the keyboard
                              //InputStreamReader - class that takes up the byte from sources where data is generated or stored in form of bytes and converts them into character.
                              //This is used wherever we wish to read data in the
                              // form of character from the source where data is in the form of bytes.
                              //bufferedReader expects character to be read.
                              System.out.println("Enter a string");
                              String s = br.readLine();
                              System.out.println("You entered: "+s);

                              //Note: To read other types, we use functions such as Integer.parseInt(), Double.parseDouble(). To read multiple values, we use split(). because BufferedReader  reads character and to store these read data form console or file we need to use, certain functions.
                              //For example : after reading an int and we want top store them in a variable having data type int. If we directly store it, throw a compile-time error, so, it's benificial 
                              //to convert it into int using Integer.parseInt() function because BufferedReader instances expects character stream to be read and stored.

                              System.out.println("Enter a number");
                              int n = Integer.parseInt(br.readLine());
                              System.out.println("You entered: "+n);

                              //Scanner
                              Scanner sc = new Scanner(System.in);
                              //System.in - System is a predefined class
                              //in - predefined object of inputStream that reads from the keyboard
                              //Scanner is predeined class , which can read different format inputs.
                              //sc is an object created of type Scanner.
                              System.out.println("Enter a string");
                              String str = sc.nextLine();
                              System.out.println("You entered: "+str);

                              System.out.println("Enter a number");
                              int num = sc.nextInt();
                              System.out.println("You entered: "+num);

                              int b = 20, c =30;
                              //int a = b+++++c;//Produces an error as compiler uses  lex tool to match the greatest match when generating tokens. This creates a bit of problem if overlooked. For example, consider the statement a=b+++c;, to many of the readers this might seem to create compiler error. But this statement is absolutely correct as the tokens created by lex are a, =, b, ++, +, c. Therefore this statement has similar effect of first assigning b+c to a and then incrementing b. Similarly, a=b+++++c; would generate error as tokens generated are a, =, b, ++, ++, +, c. which is actually an error as there is no operand after second unary operand. 
                              // a = b++ + c;
                              // a = b+c then b = b+1
                              // System.out.println(a);
                              System.out.println("b+c"+ b + c);
                              //Using + over (): When using + operator inside system.out.println() make sure to do addition using parenthesis. If we write something before doing addition, then string addition takes place, that is associativity of addition is left to right, and hence integers are added to string first producing a string, and string objects concatenates when using +, therefore it can create unwanted results. 
                               // concatenates x and y
                              // as first x is added to "concatenation (x+y) = "
                              // producing "concatenation (x+y) = 5" and then 8 is
                              // further concatenated.

                              
                              //so to perform addition
                              System.out.println("b+c" + (b+c));


                              

               }
}
/*
 * 
 *  class PAth : contains the root of directories, which contains the packages, using this it locates all the codes.
 */
/*
 * Differences 
 * bufferedReaded is a very basic way to read i/p, mainly used to read character stream.
 * Advantage with bufferedReader is: It's generally faster than scanner, because scanner does a lot of post processing for parsing the input.Buffered reader simply reads the character stream.
 * 
 * BuffereredReader is more flexible , as we can specify the buffer size that we
 * want to be read at a time .
 * And BufferedReader do have larger buffer size in comparision to Scanner.So, benificial only when we are reading large input.
 * 
 * It is syncronized, so when we are dealing with multiple threats , we should use bufferedReader.
 * In Java, when BufferedReader is described as "synchronized," it means that its methods are thread-safe. This synchronization ensures that multiple threads can access and operate on a BufferedReader instance concurrently without causing data corruption or loss or unexpected behavior. Specifically, it means that if one thread is currently executing a BufferedReader method (such as read() or readLine()), other threads attempting to call the same or other synchronized methods on the same BufferedReader instance will be blocked until the first thread completes its operation. This mechanism prevents race conditions and ensures data consistency in multithreaded environments.
 * 
 */
