import java.util.Scanner;

class Parent
{
    void get() {
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        System.out.println(no);

    }
}
class child extends parent
{
    void set()
    {
        Scanner scc= new Scanner(System.in);
        int numm= scc.nextInt();
        System.out.println("numm");
        parent p= new parent();
        p.getClass();
    }

}
class Info extends child
{
    void info() {


        Scanner sc = new Scanner(System.in);
        System.out.println("pleae your name ");
        String name= sc.next();
    }

}
public class Multilable_inheritance {
    public static void main(String[] args) {
        Info in= new Info();
        in.info();
        in.set();


    }
}
