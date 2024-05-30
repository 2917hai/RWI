package Umesh;
class Account
{
    private  int ammount;
    private  String acc;
    public void setAmmount(int ammount)
    {
        this.ammount=ammount;
    }
    public int getAmmount()
    {
        return ammount;
    }
    public void setAcc(String acc)
    {
        this.acc=acc;
    }
    public String getAcc()
    {
        return acc;
    }
}
public class Encapsulation {
    public static void main(String[] args) {
        Account ac=new Account();
        ac.setAmmount(1000000);
        ac.setAcc("2010222");
        System.out.println(ac.getAcc()+","+ ac.getAmmount());
    }
}
