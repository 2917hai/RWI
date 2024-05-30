package Umesh;
class parentt
{
    int a=+60;
    int b = 30;
    void sum()
    {
        int sum=a+b;
        System.out.println(sum);
    }
}
class child1 extends parentt
{
    void devid()
    {
        int dev=a/b;
        System.out.println(dev);
    }
}
class child2 extends child1
{
    void sub()
    {
        int sub=a-b;
        System.out.println(sub);
    }
}
class child3 extends child2
{
    void mult()
    {
        int mult=a*b;
        System.out.println(mult);
    }}
public class Multilable_inheritance {
    public static void main(String[] args) {
        child3 ram=new child3();
        ram.sub();
        ram.mult();
        ram.sum();
        ram.devid();

    }
}
