public class EvenPosition {
    public static void main(String[] args) {
        int[] array={45,56,98,75,32,16,10,3};
        System.out.println(" Print the elements of an array present on an even position ");
        int i;
        System.out.println("Even elements are:");
        for (i=0;i<array.length;i++){
            if (i%2==0){
                System.out.print(" "+array[i]);
            }
        }
    }
}
