import java.util.Scanner;

public class Ex_three {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Students: ");
        int students = scanner.nextInt();
        System.out.print("Apples: ");
        int apples = scanner.nextInt();
        int answer = apples/students;
        System.out.println(answer);
    }
}
