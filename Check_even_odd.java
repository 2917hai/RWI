public class Check_even_odd {
    public static void main(String[] args) {
        int evencount=0;
        int oddcount=0;
        int [] array={2,7,4,5,9,8,3,10,6};
        for (int i=0; i<=array.length-1; i++)
        {
            if(array[i]%2==0)
            {
                evencount=evencount+1;
            }
            else
                oddcount=oddcount+1;
        }
        System.out.println(evencount);
        System.out.println(oddcount);
    }
}
