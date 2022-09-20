import java.util.Scanner;

public class VowelConsonant {
    public static void main(String[] args) {
        char vow[]={'a','e','i','o','u'};
        char alpha;
        int i;

        Scanner sc= new Scanner(System.in);

        System.out.println("Enter alphabet : ");
        alpha=sc.next().charAt(0);

        for(i=0;i<=vow.length;i++)
        {
            if(alpha==vow[i])
            {
                System.out.println(alpha+" is a vowel.");
                break;
            }
            else
            {
                System.out.println(alpha+" is a consonant.");
                break;
            }
        }
    }
}
