package Umesh;
class  parentts
{
    void marry(int a)
    {
        System.out.println("first method print ");
    }
    void marry(int a, int b)
    {
        System.out.println("second method print ");
    }
    void marry(int a, int b, int c)
    {
        System.out.println("third method print ");
    }
}
public class Method_overloading {
    public static void main(String[] args) {
        parentts p =new parentts();
        p.marry(10);
        p.marry(10,20);
        p.marry(10,20,30);
    }
}
