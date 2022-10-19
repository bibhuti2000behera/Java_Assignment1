/*Program to find the sum of product of consecutive digits*/
public class Sum_Product_Digits {
    public static void main(String[] args)
    {
        int num=1234;
        int sum=0;
        int v1,v2,v3,v4;
        v1=num%10;
        num=num/10;
        v2=num%10;
        sum=sum+(v1*v2);
        num=num/10;
        v3=num%10;
        sum=sum+(v2*v3);
        num=num/10;
        v4=num%10;
        sum=sum+(v3*v4);

        System.out.println("The sum of product of consecutive digits in 1234 is : "+sum);
    }
}
/*Program Ends*/
