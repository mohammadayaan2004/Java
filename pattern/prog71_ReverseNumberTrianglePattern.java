/*/
 
/*/
import java.util.Scanner;
public class prog71_ReverseNumberTrianglePattern 
{
    public static void nForest(int n) 
    {
        for (int i = 1; i <=n; i++) 
        {
            for (int j = 1; j <=i-1; j++)
            {
                System.out.print(" ");// SPACE    
            } 
            int k=i;
            for (int j = 1; j <=n-i+1; j++)
            {
                System.out.print(k+" ");// STAR
                k++;
            } 
            System.out.println(" ");
        } 
    }    
    public static void main(String[] args) 
    {
        System.out.print("Number of rows :- ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        nForest(n);
        sc.close();
    }
}