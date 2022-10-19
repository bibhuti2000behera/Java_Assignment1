/*Program to find the position value*/
public class Value_Position {
    public static void main(String[] args)
    {
        int num=8659;
        int p1=num%10;
        num=num/10;
        int p2=num%10;
        num=num/10;
        int p3=num%10;
        num=num/10;
        int p4=num%10;

        System.out.println("In the number 8659");
        System.out.println("The value at 1's place : "+p1);
        System.out.println("The value at 10th place : "+p2);
        System.out.println("The value at 100th place : "+p3);
        System.out.println("The value at 1000th place : "+p4);

    }
}
/*Program Ends*/
