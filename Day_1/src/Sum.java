public class Sum {
    public static void main(String[] args) {
        int sum = 0,i,n;
        String[] array = new String[0];
        for(i=0; i<array.length; i++)
        {
            n=Integer.parseInt(array[i]);
            sum= sum+n;
        }
        System.out.println("Sum of only valid integers is= "+sum) ;
    }
}
