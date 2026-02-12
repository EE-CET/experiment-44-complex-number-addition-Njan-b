import java.util.Scanner;

public class ComplexAddition {

    int real;
    int imaginary;

    // Constructor
    ComplexAddition(int real, int imaginary) {
        this.real = real;
        this.imaginary = imaginary;
    }

    // Method to add two complex numbers
    ComplexAddition add(ComplexAddition c) {
        int sumReal = this.real + c.real;
        int sumImaginary = this.imaginary + c.imaginary;
        return new ComplexAddition(sumReal, sumImaginary);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int r1 = sc.nextInt();
        int i1 = sc.nextInt();

        int r2 = sc.nextInt();
        int i2 = sc.nextInt();

        ComplexAddition c1 = new ComplexAddition(r1, i1);
        ComplexAddition c2 = new ComplexAddition(r2, i2);

        ComplexAddition result = c1.add(c2);

        System.out.println(result.real + " + " + result.imaginary + "i");

        sc.close();
    }
}
