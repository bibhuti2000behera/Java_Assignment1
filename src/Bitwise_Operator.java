/*Program using Bitwise operators*/
public class Bitwise_Operator {
    public static void main(String[] args)
    {
        int num=1234;
        int sec_digit,four_digit;
        four_digit=num%10;
        num=num/100;
        sec_digit=num%10;

        int bitwise_and=sec_digit & four_digit;
        int bitwise_or=sec_digit | four_digit;
        int bitwise_xor=sec_digit ^ four_digit;

        System.out.println("Bitwise AND of 2nd and 4th digit of 1234 is : "+bitwise_and);
        System.out.println("Bitwise OR of 2nd and 4th digit of 1234 is : "+bitwise_or);
        System.out.println("Bitwise XOR of 2nd and 4th digit of 1234 is : "+bitwise_xor);
    }
}
/*Program Ends*/
