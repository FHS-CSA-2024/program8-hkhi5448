//import stuff here
import java.lang.Math;
import java.util.Scanner;
//Your code here
public class Program8 {
    public static void main(String[] args){
    Scanner myScanner = new Scanner(System.in);
    
    //Variables
    int a = 0;
    int b = 0;
    int sum = 0;
    int diff = 0;
    int prod = 0;
    double avg = 0.0;
    int abs = 0;
    int max = 0;
    int min = 0;
    
    //Input
    System.out.println("Enter number 1: ");
    a = myScanner.nextInt();
    
    System.out.println("Enter number 2: ");
    b = myScanner.nextInt();
    
    //Calculations
    sum = a + b;
    diff = a - b;
    prod = a * b;
    avg = (a + b) / 2.0;
    abs = Math.abs(a-b);
    max = (abs + a + b)/2;
    min = (-abs + a + b)/2;
    
    //Output
    System.out.println();
    System.out.println("Original numbers are " + a + " and " + b);
    System.out.println();
    System.out.println("Sum = " + sum);
    System.out.println();
    System.out.println("Difference = " + diff);
    System.out.println();
    System.out.println("Product = " + prod);
    System.out.println();
    System.out.println("Average = " + avg);
    System.out.println();
    System.out.println("Absolute value = " + abs);
    System.out.println();
    System.out.println("Maximum = " + max);
    System.out.println();
    System.out.println("Minimum = " + min);
    }
}
//Paste console output below:
/*
Enter number 1: 
13
Enter number 2: 
20

Original numbers are 13 and 20

Sum = 33

Difference = -7

Product = 260

Average = 16.5

Absolute value = 7

Maximum = 20

Minimum = 13


*/
  
