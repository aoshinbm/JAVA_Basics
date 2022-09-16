import java.util.Scanner;

public class Reverse {
    static int num;

    static void reverseNum(){
        //using while loop
        int rev=0;
        while(num!=0)
        {
            rev=rev*10;
            System.out.println("1st step of reversal of number : "+rev);

            rev=rev + (num%10);
            System.out.println("2nd step of reversal of number : "+rev);

            num=num/10;
            System.out.println("Remaining number : "+num);
        }
        System.out.println("Reverse of number  : "+rev);
    }

    static void reverseNumber(){
        //using while loop
        int reverse=0;
        for(;num>0;)
        {
            reverse=reverse*10;
            System.out.println("1st step of reversal of number : "+reverse);

            reverse=reverse + (num%10);
            System.out.println("2nd step of reversal of number : "+reverse);

            num=num/10;
            System.out.println("Remaining number : "+num);
        }
        System.out.println("Reverse of number  : "+reverse);
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.println("Enter number : ");
        num=sc.nextInt();
        reverseNum();

        System.out.println("Enter number : ");
        num=sc.nextInt();
        reverseNumber();
    }
}