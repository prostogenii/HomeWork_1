import java.util.Scanner;

public class Ex_one {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter your second number: ");
        int num2 = scanner.nextInt();
        double gipotenutha = Math.sqrt(num1*num1 + num2*num2);
        System.out.println("Gipotenusa is: "+gipotenutha);
    }
}
