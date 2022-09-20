import java.util.Arrays;

public class Ascending {
    public static void main(String[] args) {
        System.out.println("Sort the elements of an array in ascending order  ");
        int[] num={45,2,5,98,76,35,24,18};
        int i,j,temp;

        Arrays.sort(num);
        for (i=0;i<num.length;i++)
        System.out.print(" "+num[i]);

/*        for (i=0;i<num.length;i++){
            for (j=1;j<=i;j++){
                if (num[i]<num[j]){
                    temp=num[i];
                    num[i]=num[j];
                    num[j]=temp;
                }
            }
        }
        System.out.println("Ascending order:");
        for (i=0;i<num.length;i++){
            System.out.print(" "+num[i]);
        }

 */
    }
}
