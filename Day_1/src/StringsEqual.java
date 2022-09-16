import java.util.Scanner;

public class StringsEqual {
    public static void main(String[] args) {
        System.out.println(" Check two strings are equal or not. ");
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter string1:");
        String str1=sc.next();
        System.out.println("Enter string2:");
        String str2=sc.next();

        if (str1.equalsIgnoreCase(str2)){
            System.out.println("String "+str1+" & "+str2+" are equal.");
        }
        else {
            System.out.println("Strings are not equal.");
        }
    }
}
