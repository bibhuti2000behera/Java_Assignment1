/*Program to find the difference between sum of odd and even digits of a number following certain conditions*/
public class Difference {
    public static void main(String[] args)
    {
        int num=8927;
        int sum1=0,sum2=0,count1=0,count2=0;
        float avg_even,avg_odd,diff;
        int n1,n2,n3,n4,v1,v2;

        n1=num%10;
        num=num/10;
        n2=num%10;
        num=num/10;
        n3=num%10;
        num=num/10;
        n4=num%10;

        sum1+=(n1%2==0&&n1%4!=0)?n1:0;
        count1+=(n1%2==0&&n1%4!=0)?1:0;
        sum1+=(n2%2==0&&n2%4!=0)?n2:0;
        count1+=(n2%2==0&&n2%4!=0)?1:0;
        sum1+=(n3%2==0&&n3%4!=0)?n3:0;
        count1+=(n3%2==0&&n3%4!=0)?1:0;
        sum1+=(n4%2==0&&n4%4!=0)?n4:0;
        count1+=(n4%2==0&&n4%4!=0)?1:0;

        avg_even=sum1/count1;

        sum2+=(n1%2!=0&&n1%3!=0)?n1:0;
        count2+=(n1%2!=0&&n1%3!=0)?1:0;
        sum2+=(n2%2!=0&&n2%3!=0)?n2:0;
        count2+=(n2%2!=0&&n2%3!=0)?1:0;
        sum2+=(n3%2!=0&&n3%3!=0)?n3:0;
        count2+=(n3%2!=0&&n3%3!=0)?1:0;
        sum2+=(n4%2!=0&&n4%3!=0)?n4:0;
        count2+=(n4%2!=0&&n4%3!=0)?1:0;

        avg_odd=sum2/count2;

        diff=(avg_even-avg_odd);

        System.out.println("The difference between sum of even and odd digits of 8927 is :"+diff);
    }
}
/*Program Ends*/
