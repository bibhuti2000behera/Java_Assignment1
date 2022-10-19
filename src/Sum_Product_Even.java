/*Program to find the sum of product of consecutive even digits in any number*/
public class Sum_Product_Even {
    public static void main(String[] args)
    {
        int num=1624;
        int e1,e2,e3,sum;
        int d1,d2,d3,d4;

        d1=num/1000;
        d2=(num/100)%10;
        d3=(num/10)%10;
        d4=num%10;

        e1=(d1%2==0&&d2%2==0)?d1*d2:0;
        e2=(d2%2==0&&d3%2==0)?d2*d3:0;
        e3=(d3%2==0&&d4%2==0)?d3*d4:0;

        sum=e1+e2+e3;

        System.out.println("sum of product of consecutive even digits in 1624 is : "+sum);
    }
}
/*Program Ends*/
