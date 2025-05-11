package p1;
import java.util.Scanner;

public class arry1 {

    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Enter the number of cars:");
        int size = s.nextInt();
        s.nextLine(); // Consume newline left-over

        String[] cars = new String[size];

        for (int i = 0; i < cars.length; i++) {
            System.out.println("Enter the name of car " + (i + 1) + ":");
            cars[i] = s.nextLine();
        }

        System.out.println("\nCars entered:");
        for (String car : cars) {
            System.out.println(car);
        }

        System.out.println("Total number of cars: " + cars.length);
    }
}
