/*Program to find sum of digits*/
public class Sum_Digits {
    public static void main(String[] args)
    {
        int num=1234;
        int sum=0;
        sum=sum+num%10;
        num=num/10;
        sum=sum+num%10;
        num=num/10;
        sum=sum+num%10;
        num=num/10;
        sum=sum+num%10;

        System.out.println("The sum of digits of 1234 is : "+sum);
    }
}
/*Program Ends*/
