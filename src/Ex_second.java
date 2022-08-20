import java.util.Scanner;

public class Ex_second {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your number: ");
        int mainNumber = scanner.nextInt();
        int nextNumber = mainNumber + 1;
        int previousNumber = mainNumber - 1;
        System.out.println("The next number for the number "+mainNumber+" is "+nextNumber+".");
        System.out.println("The previous number for the number "+mainNumber+" is "+previousNumber+".");
    }
}
