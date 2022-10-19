/*Program to find the sum of product of consecutive odd digits in any number*/
public class Sum_Product_Odd {
    public static void main(String[] args)
    {
        int num=1356;
        int d1,d2,d3,d4;
        int o1,o2,o3,sum;

        d1=num/1000;
        d2=(num/100)%10;
        d3=(num/10)%10;
        d4=num%10;

        o1=(d1%2!=0&&d2%2!=0)?d1*d2:0;
        o2=(d2%2!=0&&d3%2!=0)?d2*d3:0;
        o3=(d3%2!=0&&d4%2!=0)?d3*d4:0;

        sum=o1+o2+o3;

        System.out.println("The sum of product of consecutive odd digits in 1356 is : "+sum);
    }
}
/*Program Ends*/
