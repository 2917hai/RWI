package Umesh;
class M
{
    int a=50;
    int b=60;
    int add()
    {
        int sum=a+b;
        System.out.println(sum);
        return sum;
    }
    int mult()
    {
        int mu=a*b;
        System.out.println(mu);
        return mu;
    }
}
class N {
    M mm= new M();
}
public class Has_a_Relationship {
    public static void main(String[] args) {
        N nn=new N();
        int r=nn.mm.add();
        System.out.println(r);
       int p= nn.mm.mult();
        System.out.println(p);


    }
}

