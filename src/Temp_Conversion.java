/*Program for Temperature conversion*/
public class Temp_Conversion {
    public static void main(String[] args)
    {
        float temp1=37f,temp2=98.6f;
        float deg_far=(temp1*9/5)+32;
        float deg_cel=(temp2-32)*5/9;

        System.out.println("37 degree celsius in degree fahrenheit = "+deg_far);
        System.out.println("98.6 degree fahrenheit in degree celsius = "+deg_cel);
    }
}
/*Program Ends*/
