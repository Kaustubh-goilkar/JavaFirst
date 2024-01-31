import java.util.Scanner;

public class digitAdditoin {
    public static void main(String[] args) {

        int sum=0,number;
        String[] NoString={"zero","one","two","three","four","five","six","seven","eight","nine"};
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number :- ");
        number = sc.nextInt();
        for(int i=0; number!=0; i++){
            sum += number % 10;
//            System.out.println(NoString[number%10].toUpperCase());

//            switch (number%10){
//                case 1:
//                    System.out.println("One");
//                    break;
//                case 2:
//                    System.out.println("Two");
//                    break;
//                case 3:
//                    System.out.println("Three");
//                    break;
//                case 4:
//                    System.out.println("Four");
//                    break;
//                case 5:
//                    System.out.println("Five");
//                    break;
//                case 6:
//                    System.out.println("Six");
//                    break;
//                case 7:
//                    System.out.println("Seven");
//                    break;
//                case 8:
//                    System.out.println("Eight");
//                    break;
//                case 9:
//                    System.out.println("Nine");
//                    break;
//                case 0:
//                    System.out.println("Zero");
//                    break;
//            }
            number = number / 10;
        }
        System.out.println(sum);

    }
}
