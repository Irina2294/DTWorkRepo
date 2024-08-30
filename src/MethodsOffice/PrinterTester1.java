package MethodsOffice;

public class PrinterTester1 {
    public static void main(String[] args) {
        Printer printer=new Printer();
        printer.print();
        printer.printWord("Hello Syntax");
        printer.printMany("Java",10); // "Java" string will be passed in word String. n=10 passed 10 times
        // if you defined an int for n, you must pass int in the method. If you specified 2 parameters in the method you mast pass 2 parameters in the same sequence.
        // We can not say int a=printer.print(). It won't return anything because method type is void. Void only Prints something.

        // example with returnable method type
        String str="java";
        int a=str.length(); // This will return the value for length because the length does not have void written type. Int is the written type for it.
       int sum= printer.add(10,10); // in this case we can store the result into Int Variable because Written type is different than void.
        System.out.println(sum);
       boolean results= printer.isEven(10); // defined variable number=10, return will be a boolean true or false
        System.out.println(results);
        int[] arr={10,20,30};
       int sumOfArray=printer.sumArray(arr); // using sumArray method to sum all the numbers from arr array. sumOfArray will return the sum of all the numbers
        System.out.println(sumOfArray); // print result
        // also represent it as: sout(printer.sumArray(arr)); Here you call the method directly
    }
}
