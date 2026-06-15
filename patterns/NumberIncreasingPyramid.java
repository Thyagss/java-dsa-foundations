/*

Sample Output :

1
12
123
1234
12345

*/

package patterns;

import java.util.Scanner;

public class NumberIncreasingPyramid {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int input = in.nextInt();

        for(int i=1; i<=input; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(j);
            }
            System.out.println();
        }
    }
}
