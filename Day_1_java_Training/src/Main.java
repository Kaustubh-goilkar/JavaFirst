import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int a,b,c;
        double result, s;
//        a = 20;
//        b = 10;
//        c = 5;
//        result = ( a + b ) / ( 2 * c);
//        System.out.println(result);
//        result  = (a * a) - (b * b);
//        System.out.println(result);

//        c = a++; //Post Increment
//        b = ++a; // Pre Increment
//        System.out.println(c);
//        System.out.println(b);
//        System.out.println(a);

//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the base :: ");
//        a = sc.nextInt();
//        System.out.println("Enter the height:: ");
//        b = sc.nextInt();
        a = 10;
        b = 12;
        c = 16;
        System.out.println("The Area of Circle :: "+(0.5 * a * b));
        s = 0.5 * ( a + b + c);

        result =   s * ( s - a) * ( s - b ) * ( s - c );
        System.out.println("Reuslt :: "+ Math.sqrt(result));

        a = 5 ; b = 4;
        c = 2 * a++ + 3 * ++b;
        System.out.println(c);
    }
}