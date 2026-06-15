/*

Sample Output : 
if n = 4,

*
* *
* * *
* * * *
* * *
* *
*

*/

package patterns;

import java.util.Scanner;

public class RightPascal {
    public static void main(String[] args){
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        //upper-half
        for(int i=1; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }

        //lower-half
        for(int k=1; k<=n; k++)
        {
            for(int l=1; l<=n-k; l++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
