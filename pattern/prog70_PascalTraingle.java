/*
    1  
   1 1  
  1 2 1  
 1 3 3 1  
 */
import java.util.Scanner;
public class prog70_PascalTraingle  {
    public static void nForest(int n) {
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <=n-i ; j++) //space 
            {
               System.out.print(" ");
            }
            int k=1;
            for(int j=1;j<=i;j++) //pascal number printing 
            {
                System.out.print(k+" ");
                k=k*(i-j)/(j);  
            }
            
            System.out.println(" ");
        }
    }    
    public static void main(String[] args) {
        System.out.print("Number of rows :- ");
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        nForest(n);
        sc.close();
    }
}
