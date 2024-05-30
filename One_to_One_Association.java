package Umesh;
class employee
{
    String empname;
    String empid;
    String addr;
    employee(String empname1, String empid1, String addr1)
    {
        empid=empid1;
        empname=empname1;
        addr =addr1;
    }
    void show()
    {
        System.out.println("emp id ="+ empid);
        System.out.println("emp name ="+ empname);
        System.out.println("emo address"+addr);
        System.out.println();

    }
}
class address
{
    String location;
    String city;
    String state;
     address(String location1, String city1, String state1)
     {
         location= location1;
         city= city1;
         state= state1;
     }
}
public class One_to_One_Association {
    public static void main(String[] args) {
        address add= new address("bhopal","bhopal", "mp");
        employee emp=new employee("umesh", "0191","bhopal");
        emp.show();

    }
}
