/*

Sample Output:
if input is 5

 *********
  ******* 
   *****  
    ***   
     *

*/
package patterns;

import java.util.Scanner;

public class InvertedStarPyramid {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=1; i<=n; i++)
        {
            for(int j=0; j<i; j++) // before spaces
            {
                System.out.print(" ");
            }
            for(int k=1; k<=(n-i)*2+1; k++) // stars
            {
                System.out.print("*");
            }

            for(int l=1; l<i; l++) //after spaces
            {
                System.out.print(" ");
            }

            System.out.println();

        }
    }
}
