import java.util.Scanner;

public class Question2
{
  public static void main(String[] args)
  {
    /**
     * Prompts user for height and weight, calculate and print out the BMI of the user
     * 
     * Hint: in.nextDouble() to read double
     */
    Scanner in = new Scanner(System.in);
    System.out.println("Enter your height in m: ");
    double height = in.nextDouble();
    
    System.out.println("Enter your weight in kg: ");
    double weight = in.nextDouble();

    System.out.println("User's bmi is " + String.format("%.2f", weight/(height*height)));
    
    System.out.println("User's height is " + height);
    System.out.println("User's weight is " + weight);
  }
}
