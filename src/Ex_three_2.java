import java.util.Scanner;

public class Ex_three_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Students: ");
        int students = scanner.nextInt();
        System.out.print("Apples: ");
        int apples = scanner.nextInt();
        int answer1 = apples/students;
        int mainAnswer = apples - (students*answer1);
        System.out.println(mainAnswer);
    }
}
