//All codes in java must be part of some class
public class Test{
               //public : access specifier, main method is made public because JVM wants to execte this method outside the class, package
                              //i.e; from anywhere. main method is the point where execution of any application starts
               //static: It is a keyword used for those methods or instance-variables.
                              //It is used so that we can access the methods or members of a class without creating class object.
                              //It is used to share the same copy of static variable among all the instances of the class
                              //We made main method to be static because JVM wants to execute the method outside the class & package
               //void: The main method doesn't return anything.
               // main(): Name configured in the JVM.
               // String[]: The main method accepts a single argument: 
               //           an array of elements of type String.
               // Like in C/C++, main method is the entry point for your application and will subsequently invoke all the other methods required by your program.
               // The next line of code is shown here. Notice that it occurs inside main( ).

               public static void main(String[] args){
                              System.out.println("Hello World!");

                              //println() : it is a built-in method
                              //System is a predefined class that provides access to the system
                              //out is the variable(object) of type output stream that is connected to the console.
               }
}

//Program : is a set of instructions and data that is executed to achieve some particular task.