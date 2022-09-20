public class Duplicate {
    public static void main(String[] args) {
        int[] array={10,22,45,56,30,15,45,10,30,98,22};
        System.out.println("Print the duplicate elements of an array");
        int i,j;
        System.out.println("Duplicate elements are:");
        for (i=0;i<array.length;i++){
            for (j=1;j<i;j++) {
                if (array[i] == array[j]) {
                    System.out.print(" " + array[i]);
                }
            }
        }
    }
}
