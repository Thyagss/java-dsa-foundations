/*

Sample Output:

1
2 2
3 3 3
4 4 4 4
5 5 5 5 5

*/

package patterns;

import java.util.Scanner;

public class NumberTriangle {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        int n = in.nextInt();

        for(int i=0; i<=n; i++)
        {
            for(int j=1; j<=i; j++)
            {
                System.out.print(i);
            }
            System.out.println();
        }
    }
}
