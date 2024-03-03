package Lab1.Ex3;

import java.util.Random;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] random_numbers = new int[10];
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            random_numbers[i] = random.nextInt(24);
        }

        // Display the unsorted numbers
        System.out.println("Unsorted Numbers:");
        for (int number : random_numbers) {
            System.out.print(number + " ");
        }

        // Sort the array
        Arrays.sort(random_numbers);

        // Display the sorted numbers
        System.out.println("\nSorted Numbers:");
        for (int number : random_numbers) {
            System.out.print(number + " ");
        }
    }
}
