public class Largest {
    public static void main(String[] args) {
        int[] large={10,22,45,56,30,15,10,98};
        System.out.println("Print the largest elements of an array");
        int i,j;
        int max=large[0];
        System.out.println("Largest element is:");
        for (i=0;i<large.length;i++) {
  //          for (j = 1; j < i; j++) {
                if (large[i] > max) {
                    max=large[i];
                }
            }
        System.out.print(" "+max);
    }
}
