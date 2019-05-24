/**
 * Created by iyasuwatts on 10/17/17.
 */
import java.util.Scanner;
public class Main {
     //int sum = 0;
    public static void main(String[] args){
        System.out.println("Enter a number: ");
        Scanner sr = new Scanner(System.in);
        int n = sr.nextInt();
        int sum = 0;
        for(int i = 1; i <= n; i++)
        {
           System.out.println(i);
            sum = sum + i;
            //System.out.println(+sum);
        }
     
        System.out.println("Sum " +sum);
        
    }
}
