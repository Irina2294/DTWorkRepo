package MethodsOffice;

public class Printer {
    void print(){
        System.out.println("Hello Java");
    }
    void printWord(String word){
        System.out.println(word);
    }
    void printMany(String word,int n) { // we can pass 2 parameters inside. First the variable/word that we wanna print
        // second int n - the number of times we wanna print that word.
        //inside the {} write the login to execute when method called
        for (int i = 0; i < n; i++) { // loop executes n times. n will be decided by the user when he calls the mothod
            System.out.println(word);
        }
    }
        // write a method to return an integer type of data
        // When you write any other method than void, you must put " return" inside the login {}.
    int add(int a, int b){
            return a+b; // Here we are returning the results of the addition  back as an Int.
        }
     // new method to return  aboolean
    boolean isEven(int number){
        if(number%2==0){
            return true;
        }else{
            return false;}
    }
// method with array
    int sumArray(int [] arr){ // here we take an int array as input
        int sum=0;
        for(int n:arr){ // here is the logic to add all the numbers from array
            sum=sum+n;
        }
        return sum;

    } // there are 2 methods Categories. Written type return something, Void ones don't return anything whenever they are called

}
