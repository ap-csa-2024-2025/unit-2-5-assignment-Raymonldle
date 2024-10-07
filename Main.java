import java.util.Scanner;

public class Main
{
  public static void main(String[] args)
  {
    // write solutions to problems here
    Circle myCircle1 = new Circle(10.1);
    Circle myCircle2 = new Circle(14);
    Circle myCircle3 = new Circle(20.5);

    System.out.println("circle with radius " + myCircle1.getRadius());
    System.out.println("circle with radius " + myCircle2.getRadius());
    System.out.println("circle with radius " + myCircle3.getRadius());

    Scanner userInput = new Scanner(System.in);
    System.out.println("Type a number for length and width: ");
    double length = userInput.nextDouble();
  }
}
