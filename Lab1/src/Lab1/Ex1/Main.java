package Lab1.Ex1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ComplexNumber n1 = new ComplexNumber();
        ComplexNumber n2 = new ComplexNumber();

        Scanner scanner = new Scanner(System.in);

        //System.out.println(n1.real + " " + n1.imag + "i");
        System.out.println("Real part of first number: ");
        n1.real = Integer.parseInt(scanner.nextLine());
        System.out.println("Imaginary part of first number");
        n1.imag = Integer.parseInt(scanner.nextLine());
        System.out.println("Your first number is: " + n1.real + " + " + n1.imag + "i");

        System.out.println("Real part of second number: ");
        n2.real = Integer.parseInt(scanner.nextLine());
        System.out.println("Imaginary part of second number");
        n2.imag = Integer.parseInt(scanner.nextLine());
        System.out.println("Your second number is: " + n2.real + " + " + n2.imag + "i");

        boolean exit = false;

        do{
            System.out.println("Menu:");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Quit");

            System.out.print("Enter your choice (1/2/3/4): ");
            String choice = scanner.nextLine();

            switch (choice){
                case "1":
                    // Implement addition logic
                    ComplexNumber temp_add = new ComplexNumber();
                    temp_add = n1.add(n2);
                    System.out.println(temp_add.toString());
                    break;

                case "2":
                    // Implement subtraction logic
                    ComplexNumber temp_substract = new ComplexNumber();
                    temp_substract = n1.substract(n2);
                    System.out.println(temp_substract.toString());
                    break;

                case "3":
                    ComplexNumber temp_multiplication = new ComplexNumber();
                    temp_multiplication = n1.multiply(n2);
                    System.out.println(temp_multiplication.toString());
                    break;

                case "4":
                    System.out.println("Exiting the program. Goodbye!");
                    exit = true;
                    break;

                default:
                    System.out.println("Invalid choice. Please enter a valid option (1/2/3/4).");
            }

        }while (!exit);
    }
}