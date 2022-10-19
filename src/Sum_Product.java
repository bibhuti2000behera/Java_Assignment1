/*Program to calculate the sum of product of consecutive digits of any two numbers*/
public class Sum_Product {
    public static void main(String[] args) {
        int num1 = 1234, num2 = 7896;
        int sum = 0;
        int m1, m2, m3, m4, n1, n2, n3, n4;
        m1 = num1 % 10;
        num1 = num1 / 10;
        n1 = num2 % 10;
        num2 = num2 / 10;
        sum = sum + (m1 * n1);
        m2 = num1 % 10;
        num1 = num1 / 10;
        n2 = num2 % 10;
        num2 = num2 / 10;
        sum = sum + (m2 * n2);
        m3 = num1 % 10;
        num1 = num1 / 10;
        n3 = num2 % 10;
        num2 = num2 / 10;
        sum = sum + (m3 * n3);
        m4 = num1 % 10;
        n4 = num2 % 10;
        sum = sum + (m4 * n4);

        System.out.println("The sum of product of consecutive digits of 1234 and 7896 : " + sum);
    }
}
/*Program Ends*/
