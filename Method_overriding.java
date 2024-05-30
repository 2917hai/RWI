package Umesh;
class parents
{
    void marry1()
    {
        System.out.println("arrange marry");
    }
}
class childd
{
    void marry2()
    {
        System.out.println("love marry");
    }
}
public class Method_overriding {

        public static void main(String[] args) {
            parents p= new parents();
            p.marry1();
            childd ch = new childd();
            ch.marry2();
        }
    }

