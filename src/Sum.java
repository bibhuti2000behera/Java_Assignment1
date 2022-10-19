/*Program to find The sum of product of corresponding even digits of any number and corresponding odd digits of any number*/
public class Sum {
    public static void main(String[] args)
    {
        int num1=1234,num2=4567;
        int m1,m2,m3,m4,n1,n2,n3,n4;
        int sum,r1,r2,r3,r4;

        m1=num1/1000;
        m2=(num1/100)%10;
        m3=(num1/10)%10;
        m4=num1%10;

        n1=num2/1000;
        n2=(num2/100)%10;
        n3=(num2/10)%10;
        n4=num2%10;

        r1=(m1%2==0&&n1%2!=0)?m1*n1:0;
        r2=(m2%2==0&&n2%2!=0)?m2*n2:0;
        r3=(m3%2==0&&n3%2!=0)?m3*n3:0;
        r4=(m4%2==0&&n4%2!=0)?m4*n4:0;

        sum=r1+r2+r3+r4;

        System.out.println("The sum of product of corresponding even digits of 1234 and corresponding odd digits of 4567 is : "+sum);
    }
}
/*Program Ends*/
