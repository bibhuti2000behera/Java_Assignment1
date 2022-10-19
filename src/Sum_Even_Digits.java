/*Program to calculate the sum of even digits in any number*/
public class Sum_Even_Digits {
    public static void main(String[] args)
    {
        int num=1234;
        int n1,n2,n3,n4;
        int sum=0,v;
        n1=num%10;
        num=num/10;
        n2=num%10;
        num=num/10;
        n3=num%10;
        num=num/10;
        n4=num%10;

        v=(n1%2==0?n1:0);
        sum=sum+v;
        v=(n2%2==0?n2:0);
        sum=sum+v;
        v=(n3%2==0?n3:0);
        sum=sum+v;
        v=(n4%2==0?n4:0);
        sum=sum+v;

        System.out.println("The sum of even digits in 1234 is : "+sum);
    }
}
/*Program Ends*/
