import java.util.Scanner;

public class ArithmeticOp {
    static int a,b,c;
    static void arithmeticOp1(){
        int sum1=0;
        sum1=a+b*c;
        System.out.println("Result of arithmetic operation is "+sum1);
    }
    static void arithmeticOp2(){
        int sum2=0;
        sum2=c+(a/b);
        System.out.println("Result of arithmetic operation is "+sum2);
    }
    static void arithmeticOp3(){
        int sum3=0;
        sum3=(a%b)+c;
        System.out.println("Result of arithmetic operation is "+sum3);
    }
    static void arithmeticOp4(){
        int sum4=0;
        sum4=a*b+c;
        System.out.println("Result of arithmetic operation is "+sum4);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Arithmetic Operations");
        System.out.println("Enter number:");
        a=sc.nextInt();
        System.out.println("Enter number:");
        b=sc.nextInt();
        System.out.println("Enter number:");
        c=sc.nextInt();

        System.out.println("Select arithmetic operation:");
        int choose=sc.nextInt();
        switch (choose){
            case 1://1st
                arithmeticOp1();
                break;
            case 2://2nd
                arithmeticOp2();
                break;
            case 3://3rd
                arithmeticOp3();
                break;
            case 4://4th
                arithmeticOp1();
                break;
            default:
                System.out.println("Invalid");
                break;
        }
    }
}
