import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int number,fact=1;

        System.out.print("Enter the Number :- ");
        number = sc.nextInt();
        for (int i = 1; i <= number; i++) {

            fact = fact * i;
        }
        System.out.println(fact);
    }
}
