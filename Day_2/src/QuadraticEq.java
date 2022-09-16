import java.util.Scanner;

public class QuadraticEq {
    public static void main(String[] args) {
        System.out.println("Quadratic Equation");
        int a,b,c;
        double delta=0.0,sqrt=0.0,x1=0.0,x2=0.0;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number");
        a=sc.nextInt();
        System.out.println("Enter number");
        b=sc.nextInt();
        System.out.println("Enter number");
        c=sc.nextInt();

        delta=b*b-4*a*c;
        System.out.println("delta = "+delta);

        sqrt=Math.sqrt(delta);
        System.out.println("Square root of delta : "+sqrt);

        x1=(-b+sqrt)/(2*a);
        System.out.println("Root1 of x is "+x1);

        x2=(-b-sqrt)/(2*a);
        System.out.println("Root2 of x is "+x2);
    }
}
