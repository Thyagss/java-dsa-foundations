/*

Sample Output:

    *
   ***
  *****
 *******
*********

*/

package patterns;

import java.util.Scanner;

public class TriangleStar {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i<=n; i++) {
            
            // to control the spaces
            for(int j=1; j<=n-i; j++)
            {
                System.out.print(" ");
            }

            // to control the stars
            for(int k=1; k<=(i*2)-1; k++)
            {
                System.out.print("*");
            }

            System.out.println();
        }
    }
}
