/*Program to find the sum of odd digits in any number*/
public class Sum_Odd_Digits {
    public static void main(String[] args)
    {
        int num=1234;
        int sum=0,v;
        int n1,n2,n3,n4;

        n1=num%10;
        v=(n1%2!=0?n1:0);
        sum=sum+v;
        num=num/10;
        n2=num%10;
        v=(n2%2!=0?n2:0);
        sum=sum+v;
        num=num/10;
        n3=num%10;
        v=(n3%2!=0?n3:0);
        sum=sum+v;
        num=num/10;
        n4=num%10;
        v=(n4%2!=0?n4:0);
        sum=sum+v;

        System.out.println("The sum of odd digits in 1234 is : "+sum);
    }
}
/*Program Ends*/
