import java.util.Scanner;
import java.util.Scanner.*;
public class finding_A_Element {
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("enter a number which you want to search");
        int no=sc.nextInt();
        int a[]={10,20,30,40,50,60,70,80,90,15,6,8,6,4,55};
        for(int i=0; i<=a.length-1; i++)
        {

            if (no==a[i])
            {
                System.out.println(a[i]+"NO is available in Array");

            }
            else
                System.out.println("data are not available");


        }

    }
}
