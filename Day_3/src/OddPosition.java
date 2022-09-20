public class OddPosition {
    public static void main(String[] args) {
        int[] array={45,56,75,30,15,10,3,5};
        System.out.println(" Print the elements of an array present on an even position ");
        int i;
        System.out.println("Odd elements are:");
        for (i=0;i<array.length;i++){
            if (i%2!=0){
                System.out.print(" "+array[i]);
            }
        }
    }
}
