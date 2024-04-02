// Print the sum, difference and product of two complex numbers by creating a
// class named 'Complex' with separate methods for each operation whose real and
// imaginary parts are entered by user. Also use this keyword wherever required.

import java.util.Scanner;

class Complex {
    private int real;
    private int imaginary;

    public Complex(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    public void add(Complex c) {
        System.out.println("Sum: " + (real + c.real) + " + " + (imaginary + c.imaginary) + "i");
    }

    public void subtract(Complex c) {
        System.out.println("Difference: " + (real - c.real) + " + " + (imaginary - c.imaginary) + "i");
    }

    public void multiply(Complex c) {
        System.out.println("Product: " + (real * c.real - imaginary * c.imaginary) + " + " + (real * c.imaginary + imaginary * c.real) + "i");
    }
}

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the real and imaginary parts of the first complex number:");
        int real1 = scanner.nextInt();
        int imaginary1 = scanner.nextInt();
        System.out.println("Enter the real and imaginary parts of the second complex number:");
        int real2 = scanner.nextInt();
        int imaginary2 = scanner.nextInt();
        Complex c1 = new Complex(real1, imaginary1);
        Complex c2 = new Complex(real2, imaginary2);
        c1.add(c2);
        c1.subtract(c2);
        c1.multiply(c2);
    }
}