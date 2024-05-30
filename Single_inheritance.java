package Umesh;
class parent
{
    int a =20;
    int b= 30;
    void summ()
    {
        int sum=a+b;
        System.out.println(sum);
    }

}
class child extends parent
{
    void mult()
    {
        int mult=a*b;
        System.out.println(mult);
    }
}
public class Single_inheritance {
    public static void main(String[] args) {
        child ch= new child();
        ch.mult();
        ch.summ();

    }
}
