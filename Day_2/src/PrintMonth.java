import java.util.Scanner;

public class PrintMonth {
    public static void main(String[] args) {
        int choice;
        Scanner sc= new Scanner(System.in);
        System.out.println("Print the month name for the given number");
        System.out.println("Enter the number :");
        choice=sc.nextInt();
        switch (choice){
            case 1: System.out.println("The name of the month number "+choice+" is January ");break;
            case 2: System.out.println("The name of the month number "+choice+" is February ");break;
            case 3: System.out.println("The name of the month number "+choice+" is March ");break;
            case 4: System.out.println("The name of the month number "+choice+" is April ");break;
            case 5: System.out.println("The name of the month number "+choice+" is May ");break;
            case 6: System.out.println("The name of the month number "+choice+" is June ");break;
            case 7: System.out.println("The name of the month number "+choice+" is July ");break;
            case 8: System.out.println("The name of the month number "+choice+" is August ");break;
            case 9: System.out.println("The name of the month number "+choice+" is September ");break;
            case 10: System.out.println("The name of the month number "+choice+" is October ");break;
            case 11: System.out.println("The name of the month number "+choice+" is November ");break;
            case 12: System.out.println("The name of the month number "+choice+" is December ");break;
            default: System.out.println("Invalid input");break;
        }
    }
}
