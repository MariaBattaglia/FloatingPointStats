package FloatingPointStats.java;
import java.util.Scanner;

public class FloatingPointStats {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float[] numbers = new float[5];
        int count = 0;

        System.out.println("Enter 5 floating-point numbers:");

        while (count < 5) {
            System.out.print("Enter number " + (count + 1) + ": ");
            if (scanner.hasNextFloat()) {
                numbers[count] = scanner.nextFloat();
                count++;
            } else {
                System.out.println("Invalid input. Please enter a valid floating-point number.");
                scanner.next(); // discard invalid input
            }
        }

        float total = 0;
        float max = numbers[0];
        float min = numbers[0];

        for (float num : numbers) {
            total += num;
            if (num > max) max = num;
            if (num < min) min = num;
        }

        float average = total / numbers.length;
        float interest = total * 0.20f;

        System.out.println("\n--- Results ---");
        System.out.println("Total: " + total);
        System.out.println("Average: " + average);
        System.out.println("Maximum: " + max);
        System.out.println("Minimum: " + min);
        System.out.println("Interest on total at 20%: " + interest);

        scanner.close();
    }
}
