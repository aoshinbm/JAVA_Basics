import java.util.Scanner;

public class Frequency {
    public static void main(String[] args) {
        int size,i,count=1,j;
        System.out.println("Count frquency of number in an array");
        Scanner scan=new Scanner(System.in);
        System.out.println("Enter size of array:");
        size=scan.nextInt();
        int[] freq=new int[size];
        System.out.println("Enter elements:");
        for (i=0;i<freq.length;i++) {
            freq[i] = scan.nextInt();
        }
        for (i=0;i<freq.length;i++) {
            System.out.print(" " + freq[i]);
        }

        for (i=0;i<freq.length;i++){
            for (j=i+1;j<i;j++)
            if(freq[i]==freq[j]){
                System.out.println(freq[i]);
                count++;
                System.out.println("\n Number frequency is "+count);
            }
            else{
                System.out.println("No frequency...!!!");
            }
        }
    }
}
