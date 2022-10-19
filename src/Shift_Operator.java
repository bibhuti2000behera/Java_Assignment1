/*Program using left,right and zero fill right shifting*/
public class Shift_Operator {
    public static void main(String[] args)
    {
        int num=1234;
        int sum=0;
        int n1,n2,n3,n4;
        n1=num%10;
        sum=sum+n1;
        num=num/10;
        n2=num%10;
        sum=sum+n2;
        num=num/10;
        n3=num%10;
        sum=sum+n3;
        num=num/10;
        n4=num%10;
        sum=sum+n4;

        int left_shift = sum<<n2;
        int right_shift = sum>>n2;
        int zero_fill = sum>>>n2;

        System.out.println("The value after left shifting the sum of digits of 1234 by it's 3rd digit is : "+left_shift);
        System.out.println("The value after right shifting the sum of digits of 1234 by it's 3rd digit is : "+right_shift);
        System.out.println("The value after zero fill right shifting the sum of digits of 1234 by it's 3rd digit is : "+zero_fill);

    }
}
/*Program Ends*/
