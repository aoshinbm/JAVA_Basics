import java.util.Scanner;

public class SumOfNatural {
    static int num;
    static void sumNatural(){
        //using for loop
        int sum=0,i;
        for (i=0;i<=num;i++){
            sum=i+sum;
            System.out.print(" "+sum);
        }
        System.out.println("\nSum of natural number is " +sum);
    }
    static void addNatural(){
        int sum=0,i=0;
        //using while loop
        while (i<=num){
            sum=i+sum;
            System.out.print(" "+sum);
            i++;
        }
        System.out.println("\nSum of natural number is " +sum);
    }
    public static void main(String[] args) {
        System.out.println("Addition of natural numbers");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter number:");
        num=sc.nextInt();
        sumNatural();

        System.out.println("Enter number:");
        num=sc.nextInt();
        addNatural();
    }
}
