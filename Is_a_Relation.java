package Umesh;
// is a relationship in which data member of one class obtained in to another class by using inheritance
class A
{
    int a=10;
    int b= 20;
}
class B extends A
{
    void sum()
    {
        int sum=a+b;
        System.out.println(sum);
    }
}
public class Is_a_Relation  {
    public static void main(String[] args) {
        B ob= new B();
        ob.sum();

    }

}
