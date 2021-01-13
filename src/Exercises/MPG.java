package Exercises;
import java.util.Scanner;
public class MPG {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many miles did you drive?");
        Double miles = input.nextDouble();
        System.out.println("How many gallons of gas did you use?");
        Double gallons = input.nextDouble();
        System.out.println("Your miles per gallon are " + miles / gallons);
    }
}
