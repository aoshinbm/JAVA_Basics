import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        int size,i,count=0;
        System.out.println("Count frquency of number in an array");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array:");
        size=scan.nextInt();
        int[] freq=new int[size];
        System.out.println("Enter elements:");
        for (i=0;i<freq.length;i++) {
            freq[i] = scan.nextInt();
        }
        for (i=0;i<freq.length;i++){
            System.out.print(" "+freq[i]);
            if(freq[i]==freq[i+1]){
                System.out.println(freq[i]);
                count++;
            }
        }
        System.out.println("Frequency is "+count);
    }
}
