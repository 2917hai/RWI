public class duplicate_element_in_two_Array {
    public static void main(String[] args) {
        int a[]={10,30,70,40};
        int b[]={50,60,30,90,10};
        for (int i=0; i<=a.length-1; i++)

        {
            for (int j=0; j<=b.length-1; j++)
            {
                if (a[i] == b[j])
                {
                    System.out.println(a[i]);
                }
            }
        }
    }
}
