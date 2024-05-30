package Umesh;
class p
{
int a=500;
int b=50;
void devid()
{
    int dev=a/2;
    System.out.println(dev);
}

}
class Q
{
    void show()
    {
       p mn=new p();
      mn.devid();
    }
}
public class Usses_a_relationship {
    public static void main(String[] args) {
        Q bb=new Q();
        bb.show();
    }
}
