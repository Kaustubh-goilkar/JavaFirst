import java.util.Scanner;

public class quadratic {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter value of a:: ");
        int a= sc.nextInt();
        System.out.print("Enter value of b:: ");
        int b= sc.nextInt();
        System.out.print("Enter value of c:: ");
        int c= sc.nextInt();

        double rt=b*b-4*a*c;
        rt=Math.sqrt(rt);
        double rt1=(-b+rt)/(2*a);
        double rt2=(-b-rt)/(2*a);

        System.out.println("Root of "+a+"x^2+"+b+"x+"+c+"=0  is "+rt1+" and "+rt2);
    }
}
