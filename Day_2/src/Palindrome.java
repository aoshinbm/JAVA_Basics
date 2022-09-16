import java.util.Scanner;

public class Palindrome {
    public static void main(String[] args) {

        int num,rev=0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number : ");
        num = sc.nextInt();

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

        if(rev==num){
            System.out.println("Number"+num+" is palindrome ");
        }
        else{
            System.out.println("Number"+num+" is not a palindrome ");
        }
    }
}
