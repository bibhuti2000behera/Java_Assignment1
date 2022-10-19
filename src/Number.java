/*Program to find the place value and face value of any number*/
public class Number {
    public static void main(String[] args)
    {
        int num = 1234;
        int f1=num%10,p1=(num%10)*1;
        num=num/10;
        int f2=num%10,p2=(num%10)*10;
        num=num/10;
        int f3=num%10,p3=(num%10)*100;
        num=num/10;
        int f4=num%10,p4=(num%10)*1000;

        System.out.println("In the number 1234");
        System.out.println("Face value of 4 = "+f1+" & "+"Place value of 4 = "+p1);
        System.out.println("Face value of 3 = "+f2+" & "+"Place value of 3 = "+p2);
        System.out.println("Face value of 2 = "+f3+" & "+"Place value of 2 = "+p3);
        System.out.println("Face value of 1 = "+f4+" & "+"Place value of 1 = "+p4);

    }
}
/*Program Ends*/

