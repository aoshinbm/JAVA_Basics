import java.util.Scanner;

public class PrintArray {
    public static void main(String[] args) {
        System.out.println("Print array");
        int[] array=new int[5];
        int i;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter elements:");
        for(i=0;i<array.length;i++){
            array[i]=sc.nextInt();
        }
        for(i=0;i<array.length;i++) {
            System.out.println("Array elements are: " + array[i]);
        }

        int[] arr={10,20,60,80,97,55,2};
        for (i=0;i<arr.length;i++)
        System.out.println("Array = "+arr[i]);
    }
}