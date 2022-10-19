/*Program to find the difference between sum of product of even digits and odd digits in any number*/
public class Difference_Sum_Product_Even_Odd {
    public static void main(String[] args)
    {
        int num=5980;
        int d1,d2,d3,d4;
        int sum1,sum2,diff,e1,e2,e3,o1,o2,o3;

        d1=num/1000;
        d2=(num/100)%10;
        d3=(num/10)%10;
        d4=num%10;

        e1=(d1%2==0&&d2%2==0&&d1!=2&&d1!=6&&d2!=2&&d2!=6)?d1*d2:0;
        e2=(d2%2==0&&d3%2==0&&d2!=2&&d2!=6&&d3!=2&&d3!=6)?d2*d3:0;
        e3=(d3%2==0&&d4%2==0&&d3!=2&&d3!=6&&d4!=2&&d4!=6)?d3*d4:0;

        sum1=e1+e2+e3;

        o1=(d1%2!=0&&d2%2!=0&&d1!=3&&d1!=7&&d2!=3&&d2!=7)?d1*d2:0;
        o2=(d2%2!=0&&d3%2!=0&&d2!=3&&d2!=7&&d3!=3&&d3!=7)?d2*d3:0;
        o3=(d3%2!=0&&d4%2!=0&&d3!=3&&d3!=7&&d4!=3&&d4!=7)?d3*d4:0;

        sum2=o1+o2+o3;

        diff=sum1-sum2;

        System.out.println("The difference between sum of product of consecutive even digits and odd digits in 5980 is : "+diff);
    }
}
/*Program Ends*/
