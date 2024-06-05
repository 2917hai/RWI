
class singleArray
{
    void Array() {
        int m[] = {1, 2, 3, 5, 5, 6, 7, 8, 9};
        int n[] = {9, 8, 7, 6, 5, 4, 3, 2, 1};
        for(int i=0; i<=m.length; i++)
        {
            for(int j=0; j<=n.length; j++)
             {
                 System.out.println(m[i]+","+n[j]);
             }
        }

}

public class Array {
    public static void main(String[] args) {
        int a[]={10,20,30,40,50,60,70,80,90};
        for(int i=0; i<=a.length; i++)
        {
            System.out.println(a[i]);

        }
        singleArray ar=new singleArray();
        ar.Array();    }
}
}